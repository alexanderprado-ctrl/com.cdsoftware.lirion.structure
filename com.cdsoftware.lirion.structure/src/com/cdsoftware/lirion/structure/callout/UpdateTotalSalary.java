package com.cdsoftware.lirion.structure.callout;

import java.math.BigDecimal;
import java.util.Properties;

import org.adempiere.base.annotation.Callout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;

import com.cdsoftware.lirion.structure.base.CustomCallout;

@Callout(tableName = {"GH_Structure","HR_BudgetPlanningLines"}, 
columnName = {"CDS_SalaryE1","CDS_SalaryE2","CDS_SalaryE3","CDS_SalaryE4",
				"CDS_Month1","CDS_Month2","CDS_Month3","CDS_Month4"})
public class UpdateTotalSalary extends CustomCallout{

	@Override
	protected String start() {
		// TODO Auto-generated method stub
		return null;
	}

	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		
		BigDecimal SalaryE1 = (BigDecimal)mTab.getValue("CDS_SalaryE1");
		BigDecimal SalaryE2 = (BigDecimal)mTab.getValue("CDS_SalaryE2");
		BigDecimal SalaryE3 = (BigDecimal)mTab.getValue("CDS_SalaryE3");
		BigDecimal SalaryE4 = (BigDecimal)mTab.getValue("CDS_SalaryE4");
		BigDecimal Month1 = new BigDecimal((int)mTab.getValue("CDS_Month1"));
		BigDecimal Month2 = new BigDecimal((int)mTab.getValue("CDS_Month2"));
		BigDecimal Month3 = new BigDecimal((int)mTab.getValue("CDS_Month3"));
		BigDecimal Month4 = new BigDecimal((int)mTab.getValue("CDS_Month4"));
		
		BigDecimal totalSum = safeMultiply(SalaryE1, Month1)
                .add(safeMultiply(SalaryE2, Month2))
                .add(safeMultiply(SalaryE3, Month3))
                .add(safeMultiply(SalaryE4, Month4));
		
		mTab.setValue("CDS_SalaryTotal", totalSum);
		return "";
	}
	
	private BigDecimal safeMultiply(BigDecimal salary, BigDecimal month) {
	    BigDecimal safeSalary = (salary != null) ? salary : BigDecimal.ZERO;
	    BigDecimal safeMonth = (month != null) ? month : BigDecimal.ZERO;
	    return safeSalary.multiply(safeMonth);
	}
		
		
}
