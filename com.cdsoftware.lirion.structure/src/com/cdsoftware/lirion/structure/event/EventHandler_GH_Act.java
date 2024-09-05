package com.cdsoftware.lirion.structure.event;

import org.adempiere.base.annotation.EventTopicDelegate;
import org.adempiere.base.annotation.ModelEventTopic;
import org.adempiere.base.event.annotations.ModelEventDelegate;
import org.adempiere.base.event.annotations.doc.AfterComplete;
import org.adempiere.base.event.annotations.doc.BeforeComplete;
import org.adempiere.base.event.annotations.po.BeforeChange;
import org.compiere.model.MDocType;
import org.osgi.service.event.Event;

import com.cdsoftware.lirion.act.model.MGH_Act;
import com.cdsoftware.lirion.structure.model.X_HR_ContractTypeEmployee;


@EventTopicDelegate
@ModelEventTopic(modelClass = MGH_Act.class)
public class EventHandler_GH_Act  extends ModelEventDelegate<MGH_Act> {

	public EventHandler_GH_Act(MGH_Act po, Event event) {
		super(po, event);
	}

	@BeforeChange
	public void CreateHR_ContractTypeEmployee() {
		MGH_Act act = this.getModel();
		MDocType doc = new MDocType(act.getCtx(), act.getC_DocType_ID(), act.get_TrxName());
		if(!doc.get_ValueAsBoolean("CreateStructureRecord"))
			return;
		if(act.getDocStatus().compareTo("CO")!=0)
			return;
		if(act.getC_BPartner_ID()==0)
			return;
		
		X_HR_ContractTypeEmployee record = new X_HR_ContractTypeEmployee(act.getCtx(), 0, act.get_TrxName());
		record.setAD_Org_ID(act.getAD_Org_ID());
		record.setC_BPartner_ID(act.getC_BPartner_ID());
		record.setGH_Act_ID(act.get_ID());
		record.saveEx();
	}
}
