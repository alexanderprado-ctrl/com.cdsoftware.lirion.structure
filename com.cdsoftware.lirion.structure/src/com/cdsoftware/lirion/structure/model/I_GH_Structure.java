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

/** Generated Interface for GH_Structure
 *  @author iDempiere (generated) 
 *  @version Release 10
 */
@SuppressWarnings("all")
public interface I_GH_Structure 
{

    /** TableName=GH_Structure */
    public static final String Table_Name = "GH_Structure";

    /** AD_Table_ID=1000061 */
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

    /** Column name CDS_AdministrativeUnit_ID */
    public static final String COLUMNNAME_CDS_AdministrativeUnit_ID = "CDS_AdministrativeUnit_ID";

	/** Set CDS_AdministrativeUnit	  */
	public void setCDS_AdministrativeUnit_ID (int CDS_AdministrativeUnit_ID);

	/** Get CDS_AdministrativeUnit	  */
	public int getCDS_AdministrativeUnit_ID();

	public I_CDS_AdministrativeUnit getCDS_AdministrativeUnit() throws RuntimeException;

    /** Column name CDS_Month1 */
    public static final String COLUMNNAME_CDS_Month1 = "CDS_Month1";

	/** Set Month1	  */
	public void setCDS_Month1 (int CDS_Month1);

	/** Get Month1	  */
	public int getCDS_Month1();

    /** Column name CDS_Month2 */
    public static final String COLUMNNAME_CDS_Month2 = "CDS_Month2";

	/** Set Month2	  */
	public void setCDS_Month2 (int CDS_Month2);

	/** Get Month2	  */
	public int getCDS_Month2();

    /** Column name CDS_Month3 */
    public static final String COLUMNNAME_CDS_Month3 = "CDS_Month3";

	/** Set Month3	  */
	public void setCDS_Month3 (int CDS_Month3);

	/** Get Month3	  */
	public int getCDS_Month3();

    /** Column name CDS_Month4 */
    public static final String COLUMNNAME_CDS_Month4 = "CDS_Month4";

	/** Set Month4	  */
	public void setCDS_Month4 (int CDS_Month4);

	/** Get Month4	  */
	public int getCDS_Month4();

    /** Column name CDS_SalaryE1 */
    public static final String COLUMNNAME_CDS_SalaryE1 = "CDS_SalaryE1";

	/** Set Salary	  */
	public void setCDS_SalaryE1 (BigDecimal CDS_SalaryE1);

	/** Get Salary	  */
	public BigDecimal getCDS_SalaryE1();

    /** Column name CDS_SalaryE2 */
    public static final String COLUMNNAME_CDS_SalaryE2 = "CDS_SalaryE2";

	/** Set Salary	  */
	public void setCDS_SalaryE2 (BigDecimal CDS_SalaryE2);

	/** Get Salary	  */
	public BigDecimal getCDS_SalaryE2();

    /** Column name CDS_SalaryE3 */
    public static final String COLUMNNAME_CDS_SalaryE3 = "CDS_SalaryE3";

	/** Set Salary	  */
	public void setCDS_SalaryE3 (BigDecimal CDS_SalaryE3);

	/** Get Salary	  */
	public BigDecimal getCDS_SalaryE3();

    /** Column name CDS_SalaryE4 */
    public static final String COLUMNNAME_CDS_SalaryE4 = "CDS_SalaryE4";

	/** Set Salary	  */
	public void setCDS_SalaryE4 (BigDecimal CDS_SalaryE4);

	/** Get Salary	  */
	public BigDecimal getCDS_SalaryE4();

    /** Column name CDS_SalaryTotal */
    public static final String COLUMNNAME_CDS_SalaryTotal = "CDS_SalaryTotal";

	/** Set Salary	  */
	public void setCDS_SalaryTotal (BigDecimal CDS_SalaryTotal);

	/** Get Salary	  */
	public BigDecimal getCDS_SalaryTotal();

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

    /** Column name C_Year_ID */
    public static final String COLUMNNAME_C_Year_ID = "C_Year_ID";

	/** Set Year.
	  * Calendar Year
	  */
	public void setC_Year_ID (int C_Year_ID);

	/** Get Year.
	  * Calendar Year
	  */
	public int getC_Year_ID();

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException;

    /** Column name GH_Activity */
    public static final String COLUMNNAME_GH_Activity = "GH_Activity";

	/** Set Activity	  */
	public void setGH_Activity (String GH_Activity);

	/** Get Activity	  */
	public String getGH_Activity();

    /** Column name GH_BudgetType */
    public static final String COLUMNNAME_GH_BudgetType = "GH_BudgetType";

	/** Set Budget Type	  */
	public void setGH_BudgetType (String GH_BudgetType);

	/** Get Budget Type	  */
	public String getGH_BudgetType();

    /** Column name GH_EntityCode */
    public static final String COLUMNNAME_GH_EntityCode = "GH_EntityCode";

	/** Set GH_EntityCode	  */
	public void setGH_EntityCode (String GH_EntityCode);

	/** Get GH_EntityCode	  */
	public String getGH_EntityCode();

    /** Column name GH_ExpenseObject_ID */
    public static final String COLUMNNAME_GH_ExpenseObject_ID = "GH_ExpenseObject_ID";

	/** Set Expense Object	  */
	public void setGH_ExpenseObject_ID (int GH_ExpenseObject_ID);

	/** Get Expense Object	  */
	public int getGH_ExpenseObject_ID();

	public I_GH_ExpenseObject getGH_ExpenseObject() throws RuntimeException;

    /** Column name GH_PayrollStatus_ID */
    public static final String COLUMNNAME_GH_PayrollStatus_ID = "GH_PayrollStatus_ID";

	/** Set Payroll Status List	  */
	public void setGH_PayrollStatus_ID (int GH_PayrollStatus_ID);

	/** Get Payroll Status List	  */
	public int getGH_PayrollStatus_ID();

	public I_GH_PayrollStatus getGH_PayrollStatus() throws RuntimeException;

    /** Column name GH_Program */
    public static final String COLUMNNAME_GH_Program = "GH_Program";

	/** Set Program	  */
	public void setGH_Program (String GH_Program);

	/** Get Program	  */
	public String getGH_Program();

    /** Column name GH_Salary */
    public static final String COLUMNNAME_GH_Salary = "GH_Salary";

	/** Set Salary	  */
	public void setGH_Salary (BigDecimal GH_Salary);

	/** Get Salary	  */
	public BigDecimal getGH_Salary();

    /** Column name GH_Source */
    public static final String COLUMNNAME_GH_Source = "GH_Source";

	/** Set Source	  */
	public void setGH_Source (String GH_Source);

	/** Get Source	  */
	public String getGH_Source();

    /** Column name GH_Structure_ID */
    public static final String COLUMNNAME_GH_Structure_ID = "GH_Structure_ID";

	/** Set Structure	  */
	public void setGH_Structure_ID (int GH_Structure_ID);

	/** Get Structure	  */
	public int getGH_Structure_ID();

    /** Column name GH_StructurePosition_ID */
    public static final String COLUMNNAME_GH_StructurePosition_ID = "GH_StructurePosition_ID";

	/** Set Positions acording to structure	  */
	public void setGH_StructurePosition_ID (int GH_StructurePosition_ID);

	/** Get Positions acording to structure	  */
	public int getGH_StructurePosition_ID();

	public I_GH_StructurePosition getGH_StructurePosition() throws RuntimeException;

    /** Column name GH_Structure_UU */
    public static final String COLUMNNAME_GH_Structure_UU = "GH_Structure_UU";

	/** Set GH_Structure_UU	  */
	public void setGH_Structure_UU (String GH_Structure_UU);

	/** Get GH_Structure_UU	  */
	public String getGH_Structure_UU();

    /** Column name GH_SubProgram */
    public static final String COLUMNNAME_GH_SubProgram = "GH_SubProgram";

	/** Set SubProgram	  */
	public void setGH_SubProgram (String GH_SubProgram);

	/** Get SubProgram	  */
	public String getGH_SubProgram();

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
}
