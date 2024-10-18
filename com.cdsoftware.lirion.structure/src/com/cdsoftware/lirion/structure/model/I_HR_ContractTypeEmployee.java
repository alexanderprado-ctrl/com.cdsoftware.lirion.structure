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

/** Generated Interface for HR_ContractTypeEmployee
 *  @author iDempiere (generated) 
 *  @version Release 10
 */
@SuppressWarnings("all")
public interface I_HR_ContractTypeEmployee 
{

    /** TableName=HR_ContractTypeEmployee */
    public static final String Table_Name = "HR_ContractTypeEmployee";

    /** AD_Table_ID=1000082 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name CDS_Status */
    public static final String COLUMNNAME_CDS_Status = "CDS_Status";

	/** Set Status	  */
	public void setCDS_Status (String CDS_Status);

	/** Get Status	  */
	public String getCDS_Status();

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

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

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

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name GH_Act_ID */
    public static final String COLUMNNAME_GH_Act_ID = "GH_Act_ID";

	/** Set GH_Act	  */
	public void setGH_Act_ID (int GH_Act_ID);

	/** Get GH_Act	  */
	public int getGH_Act_ID();

    /** Column name GH_ExpenseObject_ID */
    public static final String COLUMNNAME_GH_ExpenseObject_ID = "GH_ExpenseObject_ID";

	/** Set Expense Object	  */
	public void setGH_ExpenseObject_ID (int GH_ExpenseObject_ID);

	/** Get Expense Object	  */
	public int getGH_ExpenseObject_ID();

    /** Column name GH_Structure_ID */
    public static final String COLUMNNAME_GH_Structure_ID = "GH_Structure_ID";

	/** Set Structure	  */
	public void setGH_Structure_ID (int GH_Structure_ID);

	/** Get Structure	  */
	public int getGH_Structure_ID();

    /** Column name HR_ContractClasification_ID */
    public static final String COLUMNNAME_HR_ContractClasification_ID = "HR_ContractClasification_ID";

	/** Set HR_ContractClasification	  */
	public void setHR_ContractClasification_ID (int HR_ContractClasification_ID);

	/** Get HR_ContractClasification	  */
	public int getHR_ContractClasification_ID();

    /** Column name HR_ContractTypeCategory_ID */
    public static final String COLUMNNAME_HR_ContractTypeCategory_ID = "HR_ContractTypeCategory_ID";

	/** Set HR_ContractTypeCategory	  */
	public void setHR_ContractTypeCategory_ID (int HR_ContractTypeCategory_ID);

	/** Get HR_ContractTypeCategory	  */
	public int getHR_ContractTypeCategory_ID();

    /** Column name HR_ContractTypeEmployee_ID */
    public static final String COLUMNNAME_HR_ContractTypeEmployee_ID = "HR_ContractTypeEmployee_ID";

	/** Set HR_ContractTypeEmployee	  */
	public void setHR_ContractTypeEmployee_ID (int HR_ContractTypeEmployee_ID);

	/** Get HR_ContractTypeEmployee	  */
	public int getHR_ContractTypeEmployee_ID();

    /** Column name HR_ContractTypeEmployee_UU */
    public static final String COLUMNNAME_HR_ContractTypeEmployee_UU = "HR_ContractTypeEmployee_UU";

	/** Set HR_ContractTypeEmployee_UU	  */
	public void setHR_ContractTypeEmployee_UU (String HR_ContractTypeEmployee_UU);

	/** Get HR_ContractTypeEmployee_UU	  */
	public String getHR_ContractTypeEmployee_UU();

    /** Column name HR_ContractType_ID */
    public static final String COLUMNNAME_HR_ContractType_ID = "HR_ContractType_ID";

	/** Set Contract Type	  */
	public void setHR_ContractType_ID (int HR_ContractType_ID);

	/** Get Contract Type	  */
	public int getHR_ContractType_ID();

    /** Column name HR_ContractTypeSubCategory_ID */
    public static final String COLUMNNAME_HR_ContractTypeSubCategory_ID = "HR_ContractTypeSubCategory_ID";

	/** Set HR_ContractTypeSubCategory	  */
	public void setHR_ContractTypeSubCategory_ID (int HR_ContractTypeSubCategory_ID);

	/** Get HR_ContractTypeSubCategory	  */
	public int getHR_ContractTypeSubCategory_ID();

    /** Column name HR_Department_ID */
    public static final String COLUMNNAME_HR_Department_ID = "HR_Department_ID";

	/** Set Payroll Department	  */
	public void setHR_Department_ID (int HR_Department_ID);

	/** Get Payroll Department	  */
	public int getHR_Department_ID();

	public org.eevolution.model.I_HR_Department getHR_Department() throws RuntimeException;

    /** Column name HR_Job_ID */
    public static final String COLUMNNAME_HR_Job_ID = "HR_Job_ID";

	/** Set Payroll Job	  */
	public void setHR_Job_ID (int HR_Job_ID);

	/** Get Payroll Job	  */
	public int getHR_Job_ID();

	public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException;

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

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

	I_GH_ExpenseObject getGH_ExpenseObject() throws RuntimeException;

	I_HR_ContractTypeCategory getHR_ContractTypeCategory() throws RuntimeException;

	I_HR_ContractTypeSubCategory getHR_ContractTypeSubCategory() throws RuntimeException;
}
