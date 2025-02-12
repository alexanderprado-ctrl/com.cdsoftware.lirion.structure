package com.cdsoftware.lirion.structure.callout;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import org.adempiere.base.annotation.Callout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.DB;
import org.compiere.util.Env;

import com.cdsoftware.lirion.structure.base.CustomCallout;

@Callout(tableName = {"HR_SpecialContracts"}, 
columnName = {"hourlycostnumeric","hoursnumeric","weeksnumeric","paymentcountnumeric","fiscalstampamountnumeric"})
public class UpdateSpecialContractFields extends CustomCallout{

	@Override
	protected String start() {
		// TODO Auto-generated method stub
		return null;
	}

	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		
		BigDecimal totalcontractamount= Env.ZERO,hourcost=Env.ZERO;
		int hourqty=0,weeksqty=0,paymentqty=0;
		String moneda="BALBOAS CON";
		hourcost = (BigDecimal)(mTab.getValue("hourlycostnumeric")!=null?mTab.getValue("hourlycostnumeric"):Env.ZERO);
		//hourqty = (int)(mTab.getValue("hoursnumeric")!=null?mTab.getValue("hoursnumeric"):0);
		hourqty=(int)mTab.getValue("hoursnumeric");
		weeksqty = (int)(mTab.getValue("weeksnumeric")!=null?mTab.getValue("weeksnumeric"):0);
		paymentqty = (int)(mTab.getValue("paymentcountnumeric")!=null?mTab.getValue("paymentcountnumeric"):0);
		
		totalcontractamount = hourcost.multiply(new BigDecimal(hourqty)).multiply(new BigDecimal(weeksqty));
		mTab.setValue("totalcontractamountnumeric", totalcontractamount);
		if(paymentqty!=0) {
			mTab.setValue("totalpaymentnumeric", totalcontractamount.divide(new BigDecimal(paymentqty), 2, RoundingMode.HALF_UP));	
		}
		//Cliente indica que quiere ingresar monto manualmente
		//mTab.setValue("fiscalstampamountnumeric", totalcontractamount.divide(Env.ONEHUNDRED, 2, RoundingMode.HALF_UP).multiply(new BigDecimal("0.1")).setScale(1, RoundingMode.HALF_UP));
		
		mTab.setValue("hourlycosttext", DB.getSQLValueString(null, "SELECT UPPER(f_convnl(?,?))",hourcost,moneda));
		mTab.setValue("hourstext", DB.getSQLValueString(null, "SELECT UPPER(f_convnl(?))",hourqty));
		mTab.setValue("weekstext", DB.getSQLValueString(null, "SELECT UPPER(f_convnl(?))",weeksqty));
		mTab.setValue("totalcontractamounttext", DB.getSQLValueString(null, "SELECT UPPER(f_convnl(?,?))",totalcontractamount,moneda));
		mTab.setValue("paymentcounttext", DB.getSQLValueString(null, "SELECT UPPER(f_convnl(?))",paymentqty));
		mTab.setValue("fiscalstampamounttext", DB.getSQLValueString(null, "SELECT UPPER(f_convnl(?,?))",mTab.getValue("fiscalstampamountnumeric"),moneda));
		mTab.setValue("totalpaymenttext", DB.getSQLValueString(null, "SELECT UPPER(f_convnl(?,?))",mTab.getValue("totalpaymentnumeric"),moneda));
		
		
		return "";
	}
}

