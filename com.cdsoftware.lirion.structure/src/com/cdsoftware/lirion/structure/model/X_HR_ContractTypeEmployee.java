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

/** Generated Model for HR_ContractTypeEmployee
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="HR_ContractTypeEmployee")
public class X_HR_ContractTypeEmployee extends PO implements I_HR_ContractTypeEmployee, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241017L;

    /** Standard Constructor */
    public X_HR_ContractTypeEmployee (Properties ctx, int HR_ContractTypeEmployee_ID, String trxName)
    {
      super (ctx, HR_ContractTypeEmployee_ID, trxName);
      /** if (HR_ContractTypeEmployee_ID == 0)
        {
			setHR_ContractTypeEmployee_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_HR_ContractTypeEmployee (Properties ctx, int HR_ContractTypeEmployee_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, HR_ContractTypeEmployee_ID, trxName, virtualColumns);
      /** if (HR_ContractTypeEmployee_ID == 0)
        {
			setHR_ContractTypeEmployee_ID (0);
        } */
    }

    /** Load Constructor */
    public X_HR_ContractTypeEmployee (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_HR_ContractTypeEmployee[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocType_ID(), get_TrxName());
	}

	/** Set Document Type.
		@param C_DocType_ID Document type or rules
	*/
	public void setC_DocType_ID (int C_DocType_ID)
	{
		throw new IllegalArgumentException ("C_DocType_ID is virtual column");	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Eventual = EVE */
	public static final String CDS_STATUS_Eventual = "EVE";
	/** Interim = INT */
	public static final String CDS_STATUS_Interim = "INT";
	/** Permanent = PER */
	public static final String CDS_STATUS_Permanent = "PER";
	/** Professional Services = PRO */
	public static final String CDS_STATUS_ProfessionalServices = "PRO";
	/** Set Status.
		@param CDS_Status Status
	*/
	public void setCDS_Status (String CDS_Status)
	{

		set_Value (COLUMNNAME_CDS_Status, CDS_Status);
	}

	/** Get Status.
		@return Status	  */
	public String getCDS_Status()
	{
		return (String)get_Value(COLUMNNAME_CDS_Status);
	}

	/** Set Document Date.
		@param DateDoc Date of the Document
	*/
	public void setDateDoc (Timestamp DateDoc)
	{
		throw new IllegalArgumentException ("DateDoc is virtual column");	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
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

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		throw new IllegalArgumentException ("DocumentNo is virtual column");	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set GH_Act.
		@param GH_Act_ID GH_Act
	*/
	public void setGH_Act_ID (int GH_Act_ID)
	{
		if (GH_Act_ID < 1)
			set_Value (COLUMNNAME_GH_Act_ID, null);
		else
			set_Value (COLUMNNAME_GH_Act_ID, Integer.valueOf(GH_Act_ID));
	}

	/** Get GH_Act.
		@return GH_Act	  */
	public int getGH_Act_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GH_Act_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Expense Object.
		@param GH_ExpenseObject_ID Expense Object
	*/
	public void setGH_ExpenseObject_ID (int GH_ExpenseObject_ID)
	{
		if (GH_ExpenseObject_ID < 1)
			set_Value (COLUMNNAME_GH_ExpenseObject_ID, null);
		else
			set_Value (COLUMNNAME_GH_ExpenseObject_ID, Integer.valueOf(GH_ExpenseObject_ID));
	}

	/** Get Expense Object.
		@return Expense Object	  */
	public int getGH_ExpenseObject_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GH_ExpenseObject_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Structure.
		@param GH_Structure_ID Structure
	*/
	public void setGH_Structure_ID (int GH_Structure_ID)
	{
		if (GH_Structure_ID < 1)
			set_Value (COLUMNNAME_GH_Structure_ID, null);
		else
			set_Value (COLUMNNAME_GH_Structure_ID, Integer.valueOf(GH_Structure_ID));
	}

	/** Get Structure.
		@return Structure	  */
	public int getGH_Structure_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GH_Structure_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HR_ContractClasification.
		@param HR_ContractClasification_ID HR_ContractClasification
	*/
	public void setHR_ContractClasification_ID (int HR_ContractClasification_ID)
	{
		if (HR_ContractClasification_ID < 1)
			set_Value (COLUMNNAME_HR_ContractClasification_ID, null);
		else
			set_Value (COLUMNNAME_HR_ContractClasification_ID, Integer.valueOf(HR_ContractClasification_ID));
	}

	/** Get HR_ContractClasification.
		@return HR_ContractClasification	  */
	public int getHR_ContractClasification_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_ContractClasification_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HR_ContractTypeCategory.
		@param HR_ContractTypeCategory_ID HR_ContractTypeCategory
	*/
	public void setHR_ContractTypeCategory_ID (int HR_ContractTypeCategory_ID)
	{
		if (HR_ContractTypeCategory_ID < 1)
			set_Value (COLUMNNAME_HR_ContractTypeCategory_ID, null);
		else
			set_Value (COLUMNNAME_HR_ContractTypeCategory_ID, Integer.valueOf(HR_ContractTypeCategory_ID));
	}

	/** Get HR_ContractTypeCategory.
		@return HR_ContractTypeCategory	  */
	public int getHR_ContractTypeCategory_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_ContractTypeCategory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HR_ContractTypeEmployee.
		@param HR_ContractTypeEmployee_ID HR_ContractTypeEmployee
	*/
	public void setHR_ContractTypeEmployee_ID (int HR_ContractTypeEmployee_ID)
	{
		if (HR_ContractTypeEmployee_ID < 1)
			set_ValueNoCheck (COLUMNNAME_HR_ContractTypeEmployee_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_HR_ContractTypeEmployee_ID, Integer.valueOf(HR_ContractTypeEmployee_ID));
	}

	/** Get HR_ContractTypeEmployee.
		@return HR_ContractTypeEmployee	  */
	public int getHR_ContractTypeEmployee_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_ContractTypeEmployee_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HR_ContractTypeEmployee_UU.
		@param HR_ContractTypeEmployee_UU HR_ContractTypeEmployee_UU
	*/
	public void setHR_ContractTypeEmployee_UU (String HR_ContractTypeEmployee_UU)
	{
		set_Value (COLUMNNAME_HR_ContractTypeEmployee_UU, HR_ContractTypeEmployee_UU);
	}

	/** Get HR_ContractTypeEmployee_UU.
		@return HR_ContractTypeEmployee_UU	  */
	public String getHR_ContractTypeEmployee_UU()
	{
		return (String)get_Value(COLUMNNAME_HR_ContractTypeEmployee_UU);
	}

	/** Set Contract Type.
		@param HR_ContractType_ID Contract Type
	*/
	public void setHR_ContractType_ID (int HR_ContractType_ID)
	{
		if (HR_ContractType_ID < 1)
			set_Value (COLUMNNAME_HR_ContractType_ID, null);
		else
			set_Value (COLUMNNAME_HR_ContractType_ID, Integer.valueOf(HR_ContractType_ID));
	}

	/** Get Contract Type.
		@return Contract Type	  */
	public int getHR_ContractType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_ContractType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set HR_ContractTypeSubCategory.
		@param HR_ContractTypeSubCategory_ID HR_ContractTypeSubCategory
	*/
	public void setHR_ContractTypeSubCategory_ID (int HR_ContractTypeSubCategory_ID)
	{
		if (HR_ContractTypeSubCategory_ID < 1)
			set_Value (COLUMNNAME_HR_ContractTypeSubCategory_ID, null);
		else
			set_Value (COLUMNNAME_HR_ContractTypeSubCategory_ID, Integer.valueOf(HR_ContractTypeSubCategory_ID));
	}

	/** Get HR_ContractTypeSubCategory.
		@return HR_ContractTypeSubCategory	  */
	public int getHR_ContractTypeSubCategory_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_ContractTypeSubCategory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public org.eevolution.model.I_HR_Job getHR_Job() throws RuntimeException
	{
		return (org.eevolution.model.I_HR_Job)MTable.get(getCtx(), org.eevolution.model.I_HR_Job.Table_ID)
			.getPO(getHR_Job_ID(), get_TrxName());
	}

	/** Set Payroll Job.
		@param HR_Job_ID Payroll Job
	*/
	public void setHR_Job_ID (int HR_Job_ID)
	{
		if (HR_Job_ID < 1)
			set_Value (COLUMNNAME_HR_Job_ID, null);
		else
			set_Value (COLUMNNAME_HR_Job_ID, Integer.valueOf(HR_Job_ID));
	}

	/** Get Payroll Job.
		@return Payroll Job	  */
	public int getHR_Job_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_Job_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	@Override
	public I_GH_ExpenseObject getGH_ExpenseObject() throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public I_HR_ContractTypeCategory getHR_ContractTypeCategory() throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public I_HR_ContractTypeSubCategory getHR_ContractTypeSubCategory() throws RuntimeException {
		// TODO Auto-generated method stub
		return null;
	}
}