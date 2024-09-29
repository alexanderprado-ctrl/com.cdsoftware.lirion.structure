package com.cdsoftware.lirion.structure.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MGH_Structure  extends X_GH_Structure{

	private static final long serialVersionUID = -2366441574089895545L;

	public MGH_Structure(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MGH_Structure(Properties ctx, int GH_Structure_ID, String trxName, String[] virtualColumns) {
		super(ctx, GH_Structure_ID, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	public MGH_Structure(Properties ctx, int GH_Structure_ID, String trxName) {
		super(ctx, GH_Structure_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
