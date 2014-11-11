package com.swifta.provisioning.utils;

import java.rmi.RemoteException;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.ActivationresponsesE;
import com.swifta.sub.mats.operation.provisioning.v1.Credentials;

public class AccountHolderService {
	MatsdataserviceStub matsStub = null;

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
