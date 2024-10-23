package com.cdsoftware.lirion.structure.callout;

import java.math.BigDecimal;
import java.util.Properties;

import org.adempiere.base.annotation.Callout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

import com.cdsoftware.lirion.structure.base.CustomCallout;

@Callout(tableName = {"GH_Structure","HR_BudgetPlanningLines"}, 
columnName = {"CDS_Month1","CDS_Month2","CDS_Month3","CDS_Month4"})
public class ValidMonthCount extends CustomCallout{

	@Override
	protected String start() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * La Cantidad de meses no puede exceder los 12 meses
	 */
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		
		BigDecimal Month1 = new BigDecimal((int)mTab.getValue("CDS_Month1"));
		BigDecimal Month2 = new BigDecimal((int)mTab.getValue("CDS_Month2"));
		BigDecimal Month3 = new BigDecimal((int)mTab.getValue("CDS_Month3"));
		BigDecimal Month4 = new BigDecimal((int)mTab.getValue("CDS_Month4"));
		
		Month1 = (Month1 != null) ? Month1 : BigDecimal.ZERO;
		Month2 = (Month2 != null) ? Month2 : BigDecimal.ZERO;
		Month3 = (Month3 != null) ? Month3 : BigDecimal.ZERO;
		Month4 = (Month4 != null) ? Month4 : BigDecimal.ZERO;
		
		BigDecimal totalSum = Month1.add(Month2).add(Month3).add(Month4);
		
		if(totalSum.compareTo(new BigDecimal(12))>0)
			return "Error: La cantidad de meses no puede exceder de 12"; 
		
		return "";
	}
		
}
