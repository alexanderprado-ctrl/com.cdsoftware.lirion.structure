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

/** Generated Model for GH_StructurePosition
 *  @author iDempiere (generated) 
 *  @version Release 10 - $Id$ */
@org.adempiere.base.Model(table="GH_StructurePosition")
public class X_GH_StructurePosition extends PO implements I_GH_StructurePosition, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20240918L;

    /** Standard Constructor */
    public X_GH_StructurePosition (Properties ctx, int GH_StructurePosition_ID, String trxName)
    {
      super (ctx, GH_StructurePosition_ID, trxName);
      /** if (GH_StructurePosition_ID == 0)
        {
			setGH_StructurePosition_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_GH_StructurePosition (Properties ctx, int GH_StructurePosition_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, GH_StructurePosition_ID, trxName, virtualColumns);
      /** if (GH_StructurePosition_ID == 0)
        {
			setGH_StructurePosition_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_GH_StructurePosition (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_GH_StructurePosition[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set Positions acording to structure.
		@param GH_StructurePosition_ID Positions acording to structure
	*/
	public void setGH_StructurePosition_ID (int GH_StructurePosition_ID)
	{
		if (GH_StructurePosition_ID < 1)
			set_ValueNoCheck (COLUMNNAME_GH_StructurePosition_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_GH_StructurePosition_ID, Integer.valueOf(GH_StructurePosition_ID));
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

	/** Set GH_StructurePosition_UU.
		@param GH_StructurePosition_UU GH_StructurePosition_UU
	*/
	public void setGH_StructurePosition_UU (String GH_StructurePosition_UU)
	{
		set_Value (COLUMNNAME_GH_StructurePosition_UU, GH_StructurePosition_UU);
	}

	/** Get GH_StructurePosition_UU.
		@return GH_StructurePosition_UU	  */
	public String getGH_StructurePosition_UU()
	{
		return (String)get_Value(COLUMNNAME_GH_StructurePosition_UU);
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