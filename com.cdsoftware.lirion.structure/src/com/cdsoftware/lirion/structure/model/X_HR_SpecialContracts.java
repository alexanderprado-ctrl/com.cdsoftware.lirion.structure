/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package com.cdsoftware.lirion.structure.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for HR_SpecialContracts
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="HR_SpecialContracts")
public class X_HR_SpecialContracts extends PO implements I_HR_SpecialContracts, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241023L;

    /** Standard Constructor */
    public X_HR_SpecialContracts (Properties ctx, int HR_SpecialContracts_ID, String trxName)
    {
      super (ctx, HR_SpecialContracts_ID, trxName);
      /** if (HR_SpecialContracts_ID == 0)
        {
			setHR_SpecialContracts_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_HR_SpecialContracts (Properties ctx, int HR_SpecialContracts_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, HR_SpecialContracts_ID, trxName, virtualColumns);
      /** if (HR_SpecialContracts_ID == 0)
        {
			setHR_SpecialContracts_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HR_SpecialContracts (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_HR_SpecialContracts[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Primer Semestre = 1S */
	public static final String ACADEMICCALENDAR_PrimerSemestre = "1S";
	/** Segundo Semestre = 2S */
	public static final String ACADEMICCALENDAR_SegundoSemestre = "2S";
	/** Curso Propedéutico = CP */
	public static final String ACADEMICCALENDAR_CursoPropedéutico = "CP";
	/** Módulo = M */
	public static final String ACADEMICCALENDAR_Módulo = "M";
	/** Verano = V */
	public static final String ACADEMICCALENDAR_Verano = "V";
	/** Set academiccalendar.
		@param academiccalendar academiccalendar
	*/
	public void setacademiccalendar (String academiccalendar)
	{

		set_Value (COLUMNNAME_academiccalendar, academiccalendar);
	}

	/** Get academiccalendar.
		@return academiccalendar	  */
	public String getacademiccalendar()
	{
		return (String)get_Value(COLUMNNAME_academiccalendar);
	}

	/** Set Account No.
		@param AccountNo Account Number
	*/
	public void setAccountNo (String AccountNo)
	{
		set_Value (COLUMNNAME_AccountNo, AccountNo);
	}

	/** Get Account No.
		@return Account Number
	  */
	public String getAccountNo()
	{
		return (String)get_Value(COLUMNNAME_AccountNo);
	}

	/** Set budgetpartno.
		@param budgetpartno budgetpartno
	*/
	public void setbudgetpartno (String budgetpartno)
	{
		set_Value (COLUMNNAME_budgetpartno, budgetpartno);
	}

	/** Get budgetpartno.
		@return budgetpartno	  */
	public String getbudgetpartno()
	{
		return (String)get_Value(COLUMNNAME_budgetpartno);
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set contractno.
		@param contractno contractno
	*/
	public void setcontractno (String contractno)
	{
		set_Value (COLUMNNAME_contractno, contractno);
	}

	/** Get contractno.
		@return contractno	  */
	public String getcontractno()
	{
		return (String)get_Value(COLUMNNAME_contractno);
	}

	/** Set Date From.
		@param DateFrom Starting date for a range
	*/
	public void setDateFrom (Timestamp DateFrom)
	{
		set_Value (COLUMNNAME_DateFrom, DateFrom);
	}

	/** Get Date From.
		@return Starting date for a range
	  */
	public Timestamp getDateFrom()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateFrom);
	}

	/** Set Date To.
		@param DateTo End date of a date range
	*/
	public void setDateTo (Timestamp DateTo)
	{
		set_Value (COLUMNNAME_DateTo, DateTo);
	}

	/** Get Date To.
		@return End date of a date range
	  */
	public Timestamp getDateTo()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTo);
	}

	/** Set fiscalstampamountnumeric.
		@param fiscalstampamountnumeric fiscalstampamountnumeric
	*/
	public void setfiscalstampamountnumeric (int fiscalstampamountnumeric)
	{
		set_Value (COLUMNNAME_fiscalstampamountnumeric, Integer.valueOf(fiscalstampamountnumeric));
	}

	/** Get fiscalstampamountnumeric.
		@return fiscalstampamountnumeric	  */
	public int getfiscalstampamountnumeric()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_fiscalstampamountnumeric);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set fiscalstampamounttext.
		@param fiscalstampamounttext fiscalstampamounttext
	*/
	public void setfiscalstampamounttext (String fiscalstampamounttext)
	{
		set_Value (COLUMNNAME_fiscalstampamounttext, fiscalstampamounttext);
	}

	/** Get fiscalstampamounttext.
		@return fiscalstampamounttext	  */
	public String getfiscalstampamounttext()
	{
		return (String)get_Value(COLUMNNAME_fiscalstampamounttext);
	}

	/** Set hourlycostnumeric.
		@param hourlycostnumeric hourlycostnumeric
	*/
	public void sethourlycostnumeric (int hourlycostnumeric)
	{
		set_Value (COLUMNNAME_hourlycostnumeric, Integer.valueOf(hourlycostnumeric));
	}

	/** Get hourlycostnumeric.
		@return hourlycostnumeric	  */
	public int gethourlycostnumeric()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_hourlycostnumeric);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set hourlycosttext.
		@param hourlycosttext hourlycosttext
	*/
	public void sethourlycosttext (String hourlycosttext)
	{
		set_Value (COLUMNNAME_hourlycosttext, hourlycosttext);
	}

	/** Get hourlycosttext.
		@return hourlycosttext	  */
	public String gethourlycosttext()
	{
		return (String)get_Value(COLUMNNAME_hourlycosttext);
	}

	/** Set hoursnumeric.
		@param hoursnumeric hoursnumeric
	*/
	public void sethoursnumeric (int hoursnumeric)
	{
		set_Value (COLUMNNAME_hoursnumeric, Integer.valueOf(hoursnumeric));
	}

	/** Get hoursnumeric.
		@return hoursnumeric	  */
	public int gethoursnumeric()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_hoursnumeric);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set hourstext.
		@param hourstext hourstext
	*/
	public void sethourstext (String hourstext)
	{
		set_Value (COLUMNNAME_hourstext, hourstext);
	}

	/** Get hourstext.
		@return hourstext	  */
	public String gethourstext()
	{
		return (String)get_Value(COLUMNNAME_hourstext);
	}

	public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException
	{
		return (org.eevolution.model.I_HR_Department)MTable.get(getCtx(), org.eevolution.model.I_HR_Department.Table_ID)
			.getPO(getHR_Department_ID(), get_TrxName());
	}

	/** Set Payroll Department.
		@param HR_Department_ID Payroll Department
	*/
	public void setHR_Department_ID (int HR_Department_ID)
	{
		if (HR_Department_ID < 1)
			set_Value (COLUMNNAME_HR_Department_ID, null);
		else
			set_Value (COLUMNNAME_HR_Department_ID, Integer.valueOf(HR_Department_ID));
	}

	/** Get Payroll Department.
		@return Payroll Department	  */
	public int getHR_Department_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_Department_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Special Contracts.
		@param HR_SpecialContracts_ID Special Contracts
	*/
	public void setHR_SpecialContracts_ID (int HR_SpecialContracts_ID)
	{
		if (HR_SpecialContracts_ID < 1)
			set_ValueNoCheck (COLUMNNAME_HR_SpecialContracts_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_HR_SpecialContracts_ID, Integer.valueOf(HR_SpecialContracts_ID));
	}

	/** Get Special Contracts.
		@return Special Contracts	  */
	public int getHR_SpecialContracts_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_SpecialContracts_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HR_SpecialContracts_UU.
		@param HR_SpecialContracts_UU HR_SpecialContracts_UU
	*/
	public void setHR_SpecialContracts_UU (String HR_SpecialContracts_UU)
	{
		set_ValueNoCheck (COLUMNNAME_HR_SpecialContracts_UU, HR_SpecialContracts_UU);
	}

	/** Get HR_SpecialContracts_UU.
		@return HR_SpecialContracts_UU	  */
	public String getHR_SpecialContracts_UU()
	{
		return (String)get_Value(COLUMNNAME_HR_SpecialContracts_UU);
	}

	/** Set paymentcountnumeric.
		@param paymentcountnumeric paymentcountnumeric
	*/
	public void setpaymentcountnumeric (int paymentcountnumeric)
	{
		set_Value (COLUMNNAME_paymentcountnumeric, Integer.valueOf(paymentcountnumeric));
	}

	/** Get paymentcountnumeric.
		@return paymentcountnumeric	  */
	public int getpaymentcountnumeric()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_paymentcountnumeric);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set paymentcounttext.
		@param paymentcounttext paymentcounttext
	*/
	public void setpaymentcounttext (String paymentcounttext)
	{
		set_Value (COLUMNNAME_paymentcounttext, paymentcounttext);
	}

	/** Get paymentcounttext.
		@return paymentcounttext	  */
	public String getpaymentcounttext()
	{
		return (String)get_Value(COLUMNNAME_paymentcounttext);
	}

	/** Set subjects.
		@param subjects subjects
	*/
	public void setsubjects (String subjects)
	{
		set_Value (COLUMNNAME_subjects, subjects);
	}

	/** Get subjects.
		@return subjects	  */
	public String getsubjects()
	{
		return (String)get_Value(COLUMNNAME_subjects);
	}

	/** Set totalcontractamountnumeric.
		@param totalcontractamountnumeric totalcontractamountnumeric
	*/
	public void settotalcontractamountnumeric (int totalcontractamountnumeric)
	{
		set_Value (COLUMNNAME_totalcontractamountnumeric, Integer.valueOf(totalcontractamountnumeric));
	}

	/** Get totalcontractamountnumeric.
		@return totalcontractamountnumeric	  */
	public int gettotalcontractamountnumeric()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_totalcontractamountnumeric);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set totalcontractamounttext.
		@param totalcontractamounttext totalcontractamounttext
	*/
	public void settotalcontractamounttext (String totalcontractamounttext)
	{
		set_Value (COLUMNNAME_totalcontractamounttext, totalcontractamounttext);
	}

	/** Get totalcontractamounttext.
		@return totalcontractamounttext	  */
	public String gettotalcontractamounttext()
	{
		return (String)get_Value(COLUMNNAME_totalcontractamounttext);
	}

	/** Set totalhours.
		@param totalhours totalhours
	*/
	public void settotalhours (int totalhours)
	{
		set_Value (COLUMNNAME_totalhours, Integer.valueOf(totalhours));
	}

	/** Get totalhours.
		@return totalhours	  */
	public int gettotalhours()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_totalhours);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set totalpaymentnumeric.
		@param totalpaymentnumeric totalpaymentnumeric
	*/
	public void settotalpaymentnumeric (int totalpaymentnumeric)
	{
		set_Value (COLUMNNAME_totalpaymentnumeric, Integer.valueOf(totalpaymentnumeric));
	}

	/** Get totalpaymentnumeric.
		@return totalpaymentnumeric	  */
	public int gettotalpaymentnumeric()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_totalpaymentnumeric);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set totalpaymenttext.
		@param totalpaymenttext totalpaymenttext
	*/
	public void settotalpaymenttext (String totalpaymenttext)
	{
		set_Value (COLUMNNAME_totalpaymenttext, totalpaymenttext);
	}

	/** Get totalpaymenttext.
		@return totalpaymenttext	  */
	public String gettotalpaymenttext()
	{
		return (String)get_Value(COLUMNNAME_totalpaymenttext);
	}

	/** Set weeksnumeric.
		@param weeksnumeric weeksnumeric
	*/
	public void setweeksnumeric (int weeksnumeric)
	{
		set_Value (COLUMNNAME_weeksnumeric, Integer.valueOf(weeksnumeric));
	}

	/** Get weeksnumeric.
		@return weeksnumeric	  */
	public int getweeksnumeric()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_weeksnumeric);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set weekstext.
		@param weekstext weekstext
	*/
	public void setweekstext (String weekstext)
	{
		set_Value (COLUMNNAME_weekstext, weekstext);
	}

	/** Get weekstext.
		@return weekstext	  */
	public String getweekstext()
	{
		return (String)get_Value(COLUMNNAME_weekstext);
	}
}