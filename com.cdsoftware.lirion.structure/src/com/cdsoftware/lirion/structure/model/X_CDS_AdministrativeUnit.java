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
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for CDS_AdministrativeUnit
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="CDS_AdministrativeUnit")
public class X_CDS_AdministrativeUnit extends PO implements I_CDS_AdministrativeUnit, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20240905L;

    /** Standard Constructor */
    public X_CDS_AdministrativeUnit (Properties ctx, int CDS_AdministrativeUnit_ID, String trxName)
    {
      super (ctx, CDS_AdministrativeUnit_ID, trxName);
      /** if (CDS_AdministrativeUnit_ID == 0)
        {
			setCDS_AdministrativeUnit_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_CDS_AdministrativeUnit (Properties ctx, int CDS_AdministrativeUnit_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, CDS_AdministrativeUnit_ID, trxName, virtualColumns);
      /** if (CDS_AdministrativeUnit_ID == 0)
        {
			setCDS_AdministrativeUnit_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_CDS_AdministrativeUnit (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_CDS_AdministrativeUnit[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set CDS_AdministrativeUnit.
		@param CDS_AdministrativeUnit_ID CDS_AdministrativeUnit
	*/
	public void setCDS_AdministrativeUnit_ID (int CDS_AdministrativeUnit_ID)
	{
		if (CDS_AdministrativeUnit_ID < 1)
			set_ValueNoCheck (COLUMNNAME_CDS_AdministrativeUnit_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_CDS_AdministrativeUnit_ID, Integer.valueOf(CDS_AdministrativeUnit_ID));
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

	/** Set CDS_AdministrativeUnit_UU.
		@param CDS_AdministrativeUnit_UU CDS_AdministrativeUnit_UU
	*/
	public void setCDS_AdministrativeUnit_UU (String CDS_AdministrativeUnit_UU)
	{
		set_Value (COLUMNNAME_CDS_AdministrativeUnit_UU, CDS_AdministrativeUnit_UU);
	}

	/** Get CDS_AdministrativeUnit_UU.
		@return CDS_AdministrativeUnit_UU	  */
	public String getCDS_AdministrativeUnit_UU()
	{
		return (String)get_Value(COLUMNNAME_CDS_AdministrativeUnit_UU);
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

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
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