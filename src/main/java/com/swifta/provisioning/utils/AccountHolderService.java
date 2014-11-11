package com.swifta.provisioning.utils;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;

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
	private static final Logger logger = Logger
			.getLogger(AccountHolderService.class);

	public String linkccountrequest(String childUsername,
			String parentUsername, int profileId, String reason)
			throws RemoteException, DataServiceFault {
		String statusMessage = "";
		matsStub = new MatsdataserviceStub();
		logger.info("---------------Instantiate stub service class");
		Linkccountrequest linkAccountRequest = new Linkccountrequest();
		linkAccountRequest.setChilduserresourceid(childUsername);
		linkAccountRequest.setParentaccountresourceid(parentUsername);
		linkAccountRequest.setProfileid(profileId);
		linkAccountRequest.setReason(reason);
		logger.info("---------------After setting the parameters for link account request");
		LinkaccountresponsesE linkAccountResponses = matsStub
				.linkccountrequest(linkAccountRequest);
		if (linkAccountResponses != null) {
			logger.info("---------------After getting LinkaccountresponsesE class");
			Linkaccountresponses linkAccountResponse = linkAccountResponses
					.getLinkaccountresponses();
			if (linkAccountResponse != null) {
				logger.info("---------------After getting Linkaccountresponses class");
				Linkaccountresponse[] linkResponseArray = linkAccountResponse
						.getLinkaccountresponse();
				if (linkResponseArray != null) {
					logger.info("---------------After getting Linkaccountresponse[] class");
					for (Linkaccountresponse singleResponse : linkResponseArray) {
						statusMessage = singleResponse.getStatusMessage();
						logger.info("---------------After Iterating Linkaccountresponse[] class");
					}
				} else {
					logger.info("---------------After getting linkResponseArray class and its null");
				}
			} else {
				logger.info("---------------After getting linkAccountResponse class and its null");
			}
		} else {

			logger.info("---------------After getting LinkaccountresponsesE class and its null");
		}
		logger.info("---------------Returning message ::::" + statusMessage);
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
