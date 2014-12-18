package com.swifta.sub.mats.serviceinterface;

public class LinkaccountModel {
	public String linkchildresourceid;
	public String linkparentaccountresourceid;
	public int profileid;
	public String initiatinguserresourceid;

	public LinkaccountModel() {
		super();
	}

	public LinkaccountModel(String linkchildresourceid,
			String linkparentaccountresourceid, int profileid,
			String initiatinguserresourceid) {
		super();
		this.linkchildresourceid = linkchildresourceid;
		this.linkparentaccountresourceid = linkparentaccountresourceid;
		this.profileid = profileid;
		this.initiatinguserresourceid = initiatinguserresourceid;

	}

	public String getLinkchildresourceid() {
		return linkchildresourceid;
	}

	public void setLinkchildresourceid(String linkchildresourceid) {
		this.linkchildresourceid = linkchildresourceid;
	}

	public String getLinkparentaccountresourceid() {
		return linkparentaccountresourceid;
	}

	public void setLinkparentaccountresourceid(
			String linkparentaccountresourceid) {
		this.linkparentaccountresourceid = linkparentaccountresourceid;
	}

	public int getProfileid() {
		return profileid;
	}

	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}

	public String getinitiatinguserresourceid() {
		return initiatinguserresourceid;
	}

	public void setinitiatinguserresourceid(String initiatinguserresourceid) {
		this.initiatinguserresourceid = initiatinguserresourceid;
	}

}
