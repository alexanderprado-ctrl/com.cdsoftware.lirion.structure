package com.cdsoftware.lirion.structure.event;

import org.adempiere.base.annotation.EventTopicDelegate;
import org.adempiere.base.annotation.ModelEventTopic;
import org.adempiere.base.event.annotations.ModelEventDelegate;
import org.adempiere.base.event.annotations.po.BeforeChange;
import org.adempiere.base.event.annotations.po.BeforeNew;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MSysConfig;
import org.compiere.util.DB;
import org.osgi.service.event.Event;

import com.cdsoftware.lirion.structure.model.X_GH_Structure;

@EventTopicDelegate
@ModelEventTopic(modelClass = X_GH_Structure.class)
public class ValidateStructureValue extends ModelEventDelegate<X_GH_Structure>{

	public ValidateStructureValue(X_GH_Structure po, Event event) {
		super(po, event);
		// TODO Auto-generated constructor stub
	}

	@BeforeNew
	@BeforeChange
	public void validateValue() {
		X_GH_Structure record = this.getModel();
		int v_representationExpenseCode = MSysConfig.getIntValue("CDS_EST_RepExpenseID", 0,record.getAD_Client_ID());
		int count = 0;
		//Son 2 casos a tomar en cuenta
		//1) Para un mismo año no puede repetirse la combinación Código,Año
		if(record.getGH_ExpenseObject_ID() != v_representationExpenseCode) {
			count = DB.getSQLValue(record.get_TrxName(), "SELECT count(*) FROM GH_Structure WHERE C_Year_ID = ? AND Value = ? AND GH_Structure_ID != ? AND IsActive='Y' ",record.getC_Year_ID(),record.getValue(),record.get_ID());
			if(count>0)
				throw new AdempiereException("La posición "+record.get_ValueAsString("GH_StructureValue")+" esta repetida para el año "+record.getC_Year().getFiscalYear());
		}		
		//2) La exepción a esta regla es que el objeto de gasto sea gastos de representación (030)
		//entonces se podria crear 1 registro adicional para la Combinación Código,Año para el ODG 030
		//pero solo 1
		else {
			count = DB.getSQLValue(record.get_TrxName(), "SELECT count(*) FROM GH_Structure WHERE C_Year_ID = ? AND Value = ? AND GH_ExpenseObject_ID = ? AND GH_Structure_ID != ? AND IsActive='Y'",record.getC_Year_ID(),record.getValue(),v_representationExpenseCode,record.get_ID());
			if(count>0)
				throw new AdempiereException("La posición esta repetida para el objeto de gasto 030 para el año "+record.getC_Year().getFiscalYear());			
		}
	}
}
