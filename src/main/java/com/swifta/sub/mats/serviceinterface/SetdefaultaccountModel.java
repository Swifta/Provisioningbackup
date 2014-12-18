package com.swifta.sub.mats.serviceinterface;

public class SetdefaultaccountModel {

	public String initiatinguserresourceid;
	public String dchilduserresourceid;
	public String dparentaccountresourceid;

	public SetdefaultaccountModel() {
		super();
	}

	public SetdefaultaccountModel(String initiatinguserresourceid,
			String dchilduserresourceid, String dparentaccountresourceid) {
		super();
		this.initiatinguserresourceid = initiatinguserresourceid;
		this.dchilduserresourceid = dchilduserresourceid;
		this.dparentaccountresourceid = dparentaccountresourceid;
	}

	public String getDchilduserresourceid() {
		return dchilduserresourceid;
	}

	public void setDchilduserresourceid(String dchilduserresourceid) {
		this.dchilduserresourceid = dchilduserresourceid;
	}

	public String getDparentaccountresourceid() {
		return dparentaccountresourceid;
	}

	public void setDparentaccountresourceid(String dparentaccountresourceid) {
		this.dparentaccountresourceid = dparentaccountresourceid;
	}

	public String getInitiatinguserresourceid() {
		return initiatinguserresourceid;
	}

	public void setInitiatinguserresourceid(String initiatinguserresourceid) {
		this.initiatinguserresourceid = initiatinguserresourceid;
	}

}
