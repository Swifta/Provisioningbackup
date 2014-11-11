package com.swifta.provisioning.utils;

import java.rmi.RemoteException;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.ActivationresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Linkaccountresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Linkaccountresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.LinkaccountresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Linkccountrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetdefaultaccountresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetparentresponsesE;
import com.swifta.sub.mats.operation.provisioning.v1.Credentials;

public class AccountHolderService {
	MatsdataserviceStub matsStub = null;

	public String linkAccount(String childUsername, String parentUsername,
			int profileId, String reason) throws RemoteException,
			DataServiceFault {
		String statusMessage = "";
		matsStub = new MatsdataserviceStub();
		Linkccountrequest linkAccountRequest = new Linkccountrequest();
		linkAccountRequest.setChilduserresourceid(childUsername);
		linkAccountRequest.setParentaccountresourceid(parentUsername);
		linkAccountRequest.setProfileid(profileId);
		linkAccountRequest.setReason(reason);
		LinkaccountresponsesE linkAccountResponses = matsStub
				.linkccountrequest(linkAccountRequest);
		Linkaccountresponses linkAccountResponse = linkAccountResponses
				.getLinkaccountresponses();
		Linkaccountresponse[] linkResponseArray = linkAccountResponse
				.getLinkaccountresponse();
		for (Linkaccountresponse singleResponse : linkResponseArray) {
			statusMessage = singleResponse.getStatusMessage();
		}
		return statusMessage;
	}

	public String setParentRequest(String childUsername, String parentUsername)
			throws RemoteException, DataServiceFault {
		String statusMessage = "";
		matsStub = new MatsdataserviceStub();
		Setparentrequest setParentRequest = new Setparentrequest();
		setParentRequest.setChilduserresourceid(childUsername);
		setParentRequest.setParentuserresourceid(parentUsername);
		SetparentresponsesE setParentResponses = matsStub
				.setparentrequest(setParentRequest);
		Setparentresponses parentResponses = setParentResponses
				.getSetparentresponses();
		Setparentresponse[] parentResponseArray = parentResponses
				.getSetparentresponse();
		for (Setparentresponse singleResponse : parentResponseArray) {
			statusMessage = singleResponse.getStatusMessage();
		}
		return statusMessage;
	}

	public String setdefaultaccountrequest(String childUsername,
			String parentUsername) throws RemoteException, DataServiceFault {
		matsStub = new MatsdataserviceStub();
		String statusMessage = "";
		Setdefaultaccountrequest setdefaultaccountrequest = new Setdefaultaccountrequest();
		setdefaultaccountrequest.setChilduserresourceid(childUsername);
		setdefaultaccountrequest.setParentaccountresourceid(parentUsername);
		SetdefaultaccountresponsesE defaultAccountResponses = matsStub
				.setdefaultaccountrequest(setdefaultaccountrequest);
		Setdefaultaccountresponses defaultResponses = defaultAccountResponses
				.getSetdefaultaccountresponses();
		Setdefaultaccountresponse[] defaultResponseArray = defaultResponses
				.getSetdefaultaccountresponse();
		for (Setdefaultaccountresponse singleResponse : defaultResponseArray) {
			statusMessage = singleResponse.getStatusMessage();
		}
		return statusMessage;
	}

	public String activateUser(String username, Credentials credential,
			String securityAnswer, String identificaitonNo, String bankNo,
			String currency) throws RemoteException, DataServiceFault {
		matsStub = new MatsdataserviceStub();
		String statusMessage = "";
		Activationrequest activationRequest = new Activationrequest();
		activationRequest.setUsername(username);
		activationRequest.setConfirmpassword(credential.getConfirmpin());
		activationRequest.setCurrencyid(currency);
		activationRequest.setIbankdomainid(bankNo);
		activationRequest.setSecurityquestionanswer(securityAnswer);
		activationRequest.setIdentificationno(identificaitonNo);
		activationRequest.setFirstpassword(credential.getFirstpin());
		ActivationresponsesE activationResponses = matsStub
				.activationrequest(activationRequest);
		Activationresponses activationResponse = activationResponses
				.getActivationresponses();
		Activationresponse[] response = activationResponse
				.getActivationresponse();
		for (Activationresponse singleResponse : response) {
			statusMessage = singleResponse.getStatusMessage();
		}
		return statusMessage;
	}

}
