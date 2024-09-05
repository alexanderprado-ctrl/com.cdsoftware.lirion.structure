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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for GH_Structure
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="GH_Structure")
public class X_GH_Structure extends PO implements I_GH_Structure, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20240905L;

    /** Standard Constructor */
    public X_GH_Structure (Properties ctx, int GH_Structure_ID, String trxName)
    {
      super (ctx, GH_Structure_ID, trxName);
      /** if (GH_Structure_ID == 0)
        {
			setGH_Structure_ID (0);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_GH_Structure (Properties ctx, int GH_Structure_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, GH_Structure_ID, trxName, virtualColumns);
      /** if (GH_Structure_ID == 0)
        {
			setGH_Structure_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_GH_Structure (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_GH_Structure[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_CDS_AdministrativeUnit getCDS_AdministrativeUnit() throws RuntimeException
	{
		return (I_CDS_AdministrativeUnit)MTable.get(getCtx(), I_CDS_AdministrativeUnit.Table_ID)
			.getPO(getCDS_AdministrativeUnit_ID(), get_TrxName());
	}

	/** Set CDS_AdministrativeUnit.
		@param CDS_AdministrativeUnit_ID CDS_AdministrativeUnit
	*/
	public void setCDS_AdministrativeUnit_ID (int CDS_AdministrativeUnit_ID)
	{
		if (CDS_AdministrativeUnit_ID < 1)
			set_Value (COLUMNNAME_CDS_AdministrativeUnit_ID, null);
		else
			set_Value (COLUMNNAME_CDS_AdministrativeUnit_ID, Integer.valueOf(CDS_AdministrativeUnit_ID));
	}

	/** Get CDS_AdministrativeUnit.
		@return CDS_AdministrativeUnit	  */
	public int getCDS_AdministrativeUnit_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CDS_AdministrativeUnit_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Month1.
		@param CDS_Month1 Month1
	*/
	public void setCDS_Month1 (int CDS_Month1)
	{
		set_Value (COLUMNNAME_CDS_Month1, Integer.valueOf(CDS_Month1));
	}

	/** Get Month1.
		@return Month1	  */
	public int getCDS_Month1()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CDS_Month1);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Month2.
		@param CDS_Month2 Month2
	*/
	public void setCDS_Month2 (int CDS_Month2)
	{
		set_Value (COLUMNNAME_CDS_Month2, Integer.valueOf(CDS_Month2));
	}

	/** Get Month2.
		@return Month2	  */
	public int getCDS_Month2()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CDS_Month2);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Month3.
		@param CDS_Month3 Month3
	*/
	public void setCDS_Month3 (int CDS_Month3)
	{
		set_Value (COLUMNNAME_CDS_Month3, Integer.valueOf(CDS_Month3));
	}

	/** Get Month3.
		@return Month3	  */
	public int getCDS_Month3()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CDS_Month3);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Month4.
		@param CDS_Month4 Month4
	*/
	public void setCDS_Month4 (int CDS_Month4)
	{
		set_Value (COLUMNNAME_CDS_Month4, Integer.valueOf(CDS_Month4));
	}

	/** Get Month4.
		@return Month4	  */
	public int getCDS_Month4()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CDS_Month4);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Salary.
		@param CDS_SalaryE1 Salary
	*/
	public void setCDS_SalaryE1 (BigDecimal CDS_SalaryE1)
	{
		set_Value (COLUMNNAME_CDS_SalaryE1, CDS_SalaryE1);
	}

	/** Get Salary.
		@return Salary	  */
	public BigDecimal getCDS_SalaryE1()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CDS_SalaryE1);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Salary.
		@param CDS_SalaryE2 Salary
	*/
	public void setCDS_SalaryE2 (BigDecimal CDS_SalaryE2)
	{
		set_Value (COLUMNNAME_CDS_SalaryE2, CDS_SalaryE2);
	}

	/** Get Salary.
		@return Salary	  */
	public BigDecimal getCDS_SalaryE2()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CDS_SalaryE2);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Salary.
		@param CDS_SalaryE3 Salary
	*/
	public void setCDS_SalaryE3 (BigDecimal CDS_SalaryE3)
	{
		set_Value (COLUMNNAME_CDS_SalaryE3, CDS_SalaryE3);
	}

	/** Get Salary.
		@return Salary	  */
	public BigDecimal getCDS_SalaryE3()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CDS_SalaryE3);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Salary.
		@param CDS_SalaryE4 Salary
	*/
	public void setCDS_SalaryE4 (BigDecimal CDS_SalaryE4)
	{
		set_Value (COLUMNNAME_CDS_SalaryE4, CDS_SalaryE4);
	}

	/** Get Salary.
		@return Salary	  */
	public BigDecimal getCDS_SalaryE4()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CDS_SalaryE4);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Salary.
		@param CDS_SalaryTotal Salary
	*/
	public void setCDS_SalaryTotal (BigDecimal CDS_SalaryTotal)
	{
		set_Value (COLUMNNAME_CDS_SalaryTotal, CDS_SalaryTotal);
	}

	/** Get Salary.
		@return Salary	  */
	public BigDecimal getCDS_SalaryTotal()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CDS_SalaryTotal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException
	{
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_ID)
			.getPO(getC_Year_ID(), get_TrxName());
	}

	/** Set Year.
		@param C_Year_ID Calendar Year
	*/
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1)
			set_Value (COLUMNNAME_C_Year_ID, null);
		else
			set_Value (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Activity.
		@param GH_Activity Activity
	*/
	public void setGH_Activity (String GH_Activity)
	{
		set_Value (COLUMNNAME_GH_Activity, GH_Activity);
	}

	/** Get Activity.
		@return Activity	  */
	public String getGH_Activity()
	{
		return (String)get_Value(COLUMNNAME_GH_Activity);
	}

	/** Set Budget Type.
		@param GH_BudgetType Budget Type
	*/
	public void setGH_BudgetType (String GH_BudgetType)
	{
		set_Value (COLUMNNAME_GH_BudgetType, GH_BudgetType);
	}

	/** Get Budget Type.
		@return Budget Type	  */
	public String getGH_BudgetType()
	{
		return (String)get_Value(COLUMNNAME_GH_BudgetType);
	}

	/** Set GH_EntityCode.
		@param GH_EntityCode GH_EntityCode
	*/
	public void setGH_EntityCode (String GH_EntityCode)
	{
		throw new IllegalArgumentException ("GH_EntityCode is virtual column");	}

	/** Get GH_EntityCode.
		@return GH_EntityCode	  */
	public String getGH_EntityCode()
	{
		return (String)get_Value(COLUMNNAME_GH_EntityCode);
	}

	public I_GH_ExpenseObject getGH_ExpenseObject() throws RuntimeException
	{
		return (I_GH_ExpenseObject)MTable.get(getCtx(), I_GH_ExpenseObject.Table_ID)
			.getPO(getGH_ExpenseObject_ID(), get_TrxName());
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

	public I_GH_PayrollStatus getGH_PayrollStatus() throws RuntimeException
	{
		return (I_GH_PayrollStatus)MTable.get(getCtx(), I_GH_PayrollStatus.Table_ID)
			.getPO(getGH_PayrollStatus_ID(), get_TrxName());
	}

	/** Set Payroll Status List.
		@param GH_PayrollStatus_ID Payroll Status List
	*/
	public void setGH_PayrollStatus_ID (int GH_PayrollStatus_ID)
	{
		if (GH_PayrollStatus_ID < 1)
			set_Value (COLUMNNAME_GH_PayrollStatus_ID, null);
		else
			set_Value (COLUMNNAME_GH_PayrollStatus_ID, Integer.valueOf(GH_PayrollStatus_ID));
	}

	/** Get Payroll Status List.
		@return Payroll Status List	  */
	public int getGH_PayrollStatus_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GH_PayrollStatus_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Program.
		@param GH_Program Program
	*/
	public void setGH_Program (String GH_Program)
	{
		set_Value (COLUMNNAME_GH_Program, GH_Program);
	}

	/** Get Program.
		@return Program	  */
	public String getGH_Program()
	{
		return (String)get_Value(COLUMNNAME_GH_Program);
	}

	/** Set Salary.
		@param GH_Salary Salary
	*/
	public void setGH_Salary (BigDecimal GH_Salary)
	{
		set_Value (COLUMNNAME_GH_Salary, GH_Salary);
	}

	/** Get Salary.
		@return Salary	  */
	public BigDecimal getGH_Salary()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GH_Salary);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Source.
		@param GH_Source Source
	*/
	public void setGH_Source (String GH_Source)
	{
		set_Value (COLUMNNAME_GH_Source, GH_Source);
	}

	/** Get Source.
		@return Source	  */
	public String getGH_Source()
	{
		return (String)get_Value(COLUMNNAME_GH_Source);
	}

	/** Set Structure.
		@param GH_Structure_ID Structure
	*/
	public void setGH_Structure_ID (int GH_Structure_ID)
	{
		if (GH_Structure_ID < 1)
			set_ValueNoCheck (COLUMNNAME_GH_Structure_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_GH_Structure_ID, Integer.valueOf(GH_Structure_ID));
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

	public I_GH_StructurePosition getGH_StructurePosition() throws RuntimeException
	{
		return (I_GH_StructurePosition)MTable.get(getCtx(), I_GH_StructurePosition.Table_ID)
			.getPO(getGH_StructurePosition_ID(), get_TrxName());
	}

	/** Set Positions acording to structure.
		@param GH_StructurePosition_ID Positions acording to structure
	*/
	public void setGH_StructurePosition_ID (int GH_StructurePosition_ID)
	{
		if (GH_StructurePosition_ID < 1)
			set_Value (COLUMNNAME_GH_StructurePosition_ID, null);
		else
			set_Value (COLUMNNAME_GH_StructurePosition_ID, Integer.valueOf(GH_StructurePosition_ID));
	}

	/** Get Positions acording to structure.
		@return Positions acording to structure	  */
	public int getGH_StructurePosition_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GH_StructurePosition_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GH_Structure_UU.
		@param GH_Structure_UU GH_Structure_UU
	*/
	public void setGH_Structure_UU (String GH_Structure_UU)
	{
		set_Value (COLUMNNAME_GH_Structure_UU, GH_Structure_UU);
	}

	/** Get GH_Structure_UU.
		@return GH_Structure_UU	  */
	public String getGH_Structure_UU()
	{
		return (String)get_Value(COLUMNNAME_GH_Structure_UU);
	}

	/** Set SubProgram.
		@param GH_SubProgram SubProgram
	*/
	public void setGH_SubProgram (String GH_SubProgram)
	{
		set_Value (COLUMNNAME_GH_SubProgram, GH_SubProgram);
	}

	/** Get SubProgram.
		@return SubProgram	  */
	public String getGH_SubProgram()
	{
		return (String)get_Value(COLUMNNAME_GH_SubProgram);
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
}