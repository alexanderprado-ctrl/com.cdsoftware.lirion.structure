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
package com.cdsoftware.lirion.structure.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HR_SpecialContracts
 *  @author iDempiere (generated) 
 *  @version Release 10
 */
@SuppressWarnings("all")
public interface I_HR_SpecialContracts 
{

    /** TableName=HR_SpecialContracts */
    public static final String Table_Name = "HR_SpecialContracts";

    /** AD_Table_ID=1000039 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name academiccalendar */
    public static final String COLUMNNAME_academiccalendar = "academiccalendar";

	/** Set academiccalendar	  */
	public void setacademiccalendar (String academiccalendar);

	/** Get academiccalendar	  */
	public String getacademiccalendar();

    /** Column name AccountNo */
    public static final String COLUMNNAME_AccountNo = "AccountNo";

	/** Set Account No.
	  * Account Number
	  */
	public void setAccountNo (String AccountNo);

	/** Get Account No.
	  * Account Number
	  */
	public String getAccountNo();

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name budgetpartno */
    public static final String COLUMNNAME_budgetpartno = "budgetpartno";

	/** Set budgetpartno	  */
	public void setbudgetpartno (String budgetpartno);

	/** Get budgetpartno	  */
	public String getbudgetpartno();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name contractno */
    public static final String COLUMNNAME_contractno = "contractno";

	/** Set contractno	  */
	public void setcontractno (String contractno);

	/** Get contractno	  */
	public String getcontractno();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DateFrom */
    public static final String COLUMNNAME_DateFrom = "DateFrom";

	/** Set Date From.
	  * Starting date for a range
	  */
	public void setDateFrom (Timestamp DateFrom);

	/** Get Date From.
	  * Starting date for a range
	  */
	public Timestamp getDateFrom();

    /** Column name DateTo */
    public static final String COLUMNNAME_DateTo = "DateTo";

	/** Set Date To.
	  * End date of a date range
	  */
	public void setDateTo (Timestamp DateTo);

	/** Get Date To.
	  * End date of a date range
	  */
	public Timestamp getDateTo();

    /** Column name fiscalstampamountnumeric */
    public static final String COLUMNNAME_fiscalstampamountnumeric = "fiscalstampamountnumeric";

	/** Set fiscalstampamountnumeric	  */
	public void setfiscalstampamountnumeric (int fiscalstampamountnumeric);

	/** Get fiscalstampamountnumeric	  */
	public int getfiscalstampamountnumeric();

    /** Column name fiscalstampamounttext */
    public static final String COLUMNNAME_fiscalstampamounttext = "fiscalstampamounttext";

	/** Set fiscalstampamounttext	  */
	public void setfiscalstampamounttext (String fiscalstampamounttext);

	/** Get fiscalstampamounttext	  */
	public String getfiscalstampamounttext();

    /** Column name hourlycostnumeric */
    public static final String COLUMNNAME_hourlycostnumeric = "hourlycostnumeric";

	/** Set hourlycostnumeric	  */
	public void sethourlycostnumeric (int hourlycostnumeric);

	/** Get hourlycostnumeric	  */
	public int gethourlycostnumeric();

    /** Column name hourlycosttext */
    public static final String COLUMNNAME_hourlycosttext = "hourlycosttext";

	/** Set hourlycosttext	  */
	public void sethourlycosttext (String hourlycosttext);

	/** Get hourlycosttext	  */
	public String gethourlycosttext();

    /** Column name hoursnumeric */
    public static final String COLUMNNAME_hoursnumeric = "hoursnumeric";

	/** Set hoursnumeric	  */
	public void sethoursnumeric (int hoursnumeric);

	/** Get hoursnumeric	  */
	public int gethoursnumeric();

    /** Column name hourstext */
    public static final String COLUMNNAME_hourstext = "hourstext";

	/** Set hourstext	  */
	public void sethourstext (String hourstext);

	/** Get hourstext	  */
	public String gethourstext();

    /** Column name HR_Department_ID */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";

	/** Set Payroll Department	  */
	public void setHR_Department_ID (int HR_Department_ID);

	/** Get Payroll Department	  */
	public int getHR_Department_ID();

	public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException;

    /** Column name HR_SpecialContracts_ID */
    public static final String COLUMNNAME_HR_SpecialContracts_ID = "HR_SpecialContracts_ID";

	/** Set Special Contracts	  */
	public void setHR_SpecialContracts_ID (int HR_SpecialContracts_ID);

	/** Get Special Contracts	  */
	public int getHR_SpecialContracts_ID();

    /** Column name HR_SpecialContracts_UU */
    public static final String COLUMNNAME_HR_SpecialContracts_UU = "HR_SpecialContracts_UU";

	/** Set HR_SpecialContracts_UU	  */
	public void setHR_SpecialContracts_UU (String HR_SpecialContracts_UU);

	/** Get HR_SpecialContracts_UU	  */
	public String getHR_SpecialContracts_UU();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name paymentcountnumeric */
    public static final String COLUMNNAME_paymentcountnumeric = "paymentcountnumeric";

	/** Set paymentcountnumeric	  */
	public void setpaymentcountnumeric (int paymentcountnumeric);

	/** Get paymentcountnumeric	  */
	public int getpaymentcountnumeric();

    /** Column name paymentcounttext */
    public static final String COLUMNNAME_paymentcounttext = "paymentcounttext";

	/** Set paymentcounttext	  */
	public void setpaymentcounttext (String paymentcounttext);

	/** Get paymentcounttext	  */
	public String getpaymentcounttext();

    /** Column name subjects */
    public static final String COLUMNNAME_subjects = "subjects";

	/** Set subjects	  */
	public void setsubjects (String subjects);

	/** Get subjects	  */
	public String getsubjects();

    /** Column name totalcontractamountnumeric */
    public static final String COLUMNNAME_totalcontractamountnumeric = "totalcontractamountnumeric";

	/** Set totalcontractamountnumeric	  */
	public void settotalcontractamountnumeric (int totalcontractamountnumeric);

	/** Get totalcontractamountnumeric	  */
	public int gettotalcontractamountnumeric();

    /** Column name totalcontractamounttext */
    public static final String COLUMNNAME_totalcontractamounttext = "totalcontractamounttext";

	/** Set totalcontractamounttext	  */
	public void settotalcontractamounttext (String totalcontractamounttext);

	/** Get totalcontractamounttext	  */
	public String gettotalcontractamounttext();

    /** Column name totalhours */
    public static final String COLUMNNAME_totalhours = "totalhours";

	/** Set totalhours	  */
	public void settotalhours (int totalhours);

	/** Get totalhours	  */
	public int gettotalhours();

    /** Column name totalpaymentnumeric */
    public static final String COLUMNNAME_totalpaymentnumeric = "totalpaymentnumeric";

	/** Set totalpaymentnumeric	  */
	public void settotalpaymentnumeric (int totalpaymentnumeric);

	/** Get totalpaymentnumeric	  */
	public int gettotalpaymentnumeric();

    /** Column name totalpaymenttext */
    public static final String COLUMNNAME_totalpaymenttext = "totalpaymenttext";

	/** Set totalpaymenttext	  */
	public void settotalpaymenttext (String totalpaymenttext);

	/** Get totalpaymenttext	  */
	public String gettotalpaymenttext();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name weeksnumeric */
    public static final String COLUMNNAME_weeksnumeric = "weeksnumeric";

	/** Set weeksnumeric	  */
	public void setweeksnumeric (int weeksnumeric);

	/** Get weeksnumeric	  */
	public int getweeksnumeric();

    /** Column name weekstext */
    public static final String COLUMNNAME_weekstext = "weekstext";

	/** Set weekstext	  */
	public void setweekstext (String weekstext);

	/** Get weekstext	  */
	public String getweekstext();
}
