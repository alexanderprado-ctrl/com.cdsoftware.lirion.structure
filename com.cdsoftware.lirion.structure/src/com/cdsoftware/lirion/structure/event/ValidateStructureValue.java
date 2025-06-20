package com.cdsoftware.lirion.structure.event;

import java.util.Arrays;
import java.util.List;

import org.adempiere.base.annotation.EventTopicDelegate;
import org.adempiere.base.annotation.ModelEventTopic;
import org.adempiere.base.event.annotations.ModelEventDelegate;
import org.adempiere.base.event.annotations.po.BeforeChange;
import org.adempiere.base.event.annotations.po.BeforeNew;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MSysConfig;
import org.compiere.util.DB;
import org.osgi.service.event.Event;

import com.cdsoftware.lirion.structure.model.X_GH_ExpenseObject;
import com.cdsoftware.lirion.structure.model.X_GH_Structure;

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
		
		// Arreglo de strings sobresueldo manteniendo los ceros a la izquierda
        String[] noSalaryCodeArray = {"010", "011", "012", "013", "019", "081", "082", "089", "030"};
        
        // List
        List<String> noSalaryCodeList = Arrays.asList(noSalaryCodeArray);
        
        // Arreglo de strings sueldo manteniendo los ceros a la izquierda
        String[] salaryCodeArray = {"001", "002", "003", "004", "172"};
        
        // List
        List<String> salaryCodeList = Arrays.asList(salaryCodeArray);
        
		//Son 2 casos a tomar en cuenta
		//1) Para un mismo año no puede repetirse la combinación Código,Año
        String GH_ExpenseObject_Value = DB.getSQLValueString(record.get_TrxName(), "SELECT Value FROM GH_ExpenseObject WHERE GH_ExpenseObject_ID = ?",record.getGH_ExpenseObject_ID());
        
        if(salaryCodeList.contains(GH_ExpenseObject_Value)) {
        	
        	for (String salaryCode : salaryCodeList) {
				
				//Validar que para un mismo año no puede existir multiples objetos de gasto tipo salario
				count = DB.getSQLValue(record.get_TrxName(), "SELECT count(*) FROM GH_Structure WHERE C_Year_ID = ? AND Value = ? AND GH_ExpenseObject_ID IN (SELECT GH_ExpenseObject.GH_ExpenseObject_ID FROM GH_ExpenseObject WHERE GH_ExpenseObject.Value = ?)",record.getC_Year_ID(),record.getValue(),salaryCode);	
				if(count>0)
					throw new AdempiereException("No se puede guardar el objeto de gasto "+GH_ExpenseObject_Value+". La posición "+record.getValue()+" ya posee el objeto de gasto "+salaryCode+" para el año "+record.getC_Year().getFiscalYear());
				
			}
        	
        	//Validar que para un mismo año no puede repetirse la combinación Código,Año
			count = DB.getSQLValue(record.get_TrxName(), "SELECT count(*) FROM GH_Structure WHERE C_Year_ID = ? AND Value = ? AND GH_Structure_ID != ? AND GH_ExpenseObject_ID = ?",record.getC_Year_ID(),record.getValue(),record.get_ID(),record.getGH_ExpenseObject_ID());	
			
			if(count>0)
				throw new AdempiereException("La posición "+record.getValue()+" esta repetida para el objeto de gasto "+GH_ExpenseObject_Value+" para el año "+record.getC_Year().getFiscalYear());
		
		}		
		//2) La exepción a esta regla es que el objeto de gasto sea gastos de representación (030)
		//entonces se podria crear 1 registro adicional para la Combinación Código,Año para el ODG 030
		//pero solo 1
		else {
		
        	count = DB.getSQLValue(record.get_TrxName(), "SELECT count(*) FROM GH_Structure WHERE C_Year_ID = ? AND Value = ? AND GH_Structure_ID != ? AND GH_ExpenseObject_ID = ?",record.getC_Year_ID(),record.getValue(),record.get_ID(),record.getGH_ExpenseObject_ID());
			if(count>0)
				throw new AdempiereException("La posición "+record.getValue()+" esta repetida para el objeto de gasto "+GH_ExpenseObject_Value+" para el año "+record.getC_Year().getFiscalYear());
		}
	}
}
