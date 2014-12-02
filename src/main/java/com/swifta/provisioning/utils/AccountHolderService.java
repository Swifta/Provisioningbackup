package com.swifta.provisioning.utils;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.Provisioningclient;
import com.swifta.sub.mats.operation.data.model.IdentificationType;
import com.swifta.sub.mats.operation.provisioning.v1.Credentials;
import com.swifta.sub.mats.operation.provisioning.v1.Securityquestions;
import com.swifta.sub.mats.serviceinterface.ActivationdataModel;
import com.swifta.sub.mats.serviceinterface.DataResponse;
import com.swifta.sub.mats.serviceinterface.LinkaccountModel;
import com.swifta.sub.mats.serviceinterface.RegistrationdataModel;
import com.swifta.sub.mats.serviceinterface.SetdefaultaccountModel;
import com.swifta.sub.mats.serviceinterface.SetparentModel;

public class AccountHolderService {
	// MatsdataserviceStub matsStub = null;
	Provisioningclient provisioningClient = null;
	private static final Logger logger = Logger
			.getLogger(AccountHolderService.class);

	public String linkccountrequest(String childUsername,
			String parentUsername, int profileId, String reason)
			throws RemoteException, DataServiceFault {
		String statusMessage = "";
		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");

		LinkaccountModel linkaccountModel = new LinkaccountModel();
		linkaccountModel.setReason(reason);
		linkaccountModel.setProfileid(profileId);
		linkaccountModel.setLinkchildresourceid(childUsername);
		linkaccountModel.setLinkparentaccountresourceid(parentUsername);
		logger.info("---------------After setting the parameters for link account request");
		DataResponse dataResponse = provisioningClient
				.linkaccountrequest(linkaccountModel);
		// matsStub = new MatsdataserviceStub();

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;
	}

	public String setParentRequest(String childUsername, String parentUsername)
			throws RemoteException, DataServiceFault {
		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");
		SetparentModel parentModel = new SetparentModel();
		parentModel.setChilduserresourceid(childUsername);
		parentModel.setParentuserresourceid(parentUsername);
		logger.info("---------------After setting the parameters for SetparentModel");
		DataResponse dataResponse = provisioningClient.setparent(parentModel);
		String statusMessage = "";

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;
	}

	public String setdefaultaccountrequest(String childUsername,
			String parentUsername) throws RemoteException, DataServiceFault {
		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");
		String statusMessage = "";
		SetdefaultaccountModel setdefaultaccountModel = new SetdefaultaccountModel();
		setdefaultaccountModel.setDchilduserresourceid(childUsername);
		setdefaultaccountModel.setDparentaccountresourceid(parentUsername);
		logger.info("---------------After setting the parameters for Setdefaultaccountrequest");
		DataResponse dataResponse = provisioningClient
				.setdefaultaccount(setdefaultaccountModel);

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;
	}

	public String activateUser(String username, Credentials credential,
			String securityAnswer, String identificaitonNo, String bankNo,
			String currency) throws RemoteException, DataServiceFault {
		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");

		ActivationdataModel activationdataModel = new ActivationdataModel();
		activationdataModel.setConfirmpassword(credential.getConfirmpin());
		activationdataModel.setCurrency(currency);
		activationdataModel.setFirstpassword(credential.getFirstpin());
		activationdataModel.setIdentificationno(identificaitonNo);
		activationdataModel.setSecurityquestionanswer(securityAnswer);
		activationdataModel.setUsername(username);
		DataResponse dataResponse = provisioningClient
				.activation(activationdataModel);

		String statusMessage = "";
		logger.info("---------------After setting the parameters for ActivationdataModel");
		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;
	}

	public String registerUser(
			java.lang.String username,
			java.lang.String msisdn,
			java.lang.String email,
			int profileid,
			int bankcodeid,
			java.lang.String bankaccount,
			java.lang.String clearingnumber,
			com.swifta.sub.mats.operation.provisioning.v1.Accountholderdetails accountholderdetails,
			java.lang.String currencyid, java.lang.String bankdomainnameid,
			java.lang.String termscondition,
			java.util.List<Securityquestions> securityquestions)
			throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		RegistrationdataModel registration = new RegistrationdataModel();
		registration.setPrimarycontactname(accountholderdetails
				.getPrimarycontact().getName());
		registration.setPrimarycontactmobilenumber(accountholderdetails
				.getPrimarycontact().getMobilenumber());
		registration.setPrimarycontactphonenumber(accountholderdetails
				.getPrimarycontact().getPhonenumber());
		registration.setPrimarycontactemail(accountholderdetails
				.getPrimarycontact().getEmail());

		registration.setSecondarycontactname(accountholderdetails
				.getSecondarycontact().getName());
		registration.setSecondarycontactmobilenumber(accountholderdetails
				.getSecondarycontact().getMobilenumber());
		registration.setSecondarycontactphonenumber(accountholderdetails
				.getSecondarycontact().getPhonenumber());
		registration.setSecondarycontactemail(accountholderdetails
				.getSecondarycontact().getEmail());

		registration.setIdentificationnumber(accountholderdetails
				.getIdentification().getIdentificationNo());
		registration.setIdentificationtypeid(IdentificationType.NRIN
				.returnIntvalue());
		registration.setExpirydate(accountholderdetails.getIdentification()
				.getExpirydate().toString());
		registration.setIsssuer(accountholderdetails.getIdentification()
				.getIssuer());
		registration.setIssueDate(accountholderdetails.getIdentification()
				.getIssueDate());

		registration.setStreetaddress(accountholderdetails.getAddress()
				.getStreetaddress());
		registration.setPostalCode(accountholderdetails.getAddress()
				.getPostalCode());
		registration.setCity(accountholderdetails.getAddress().getCity());
		registration.setProvince(accountholderdetails.getAddress()
				.getProvince());

		registration.setFirstname(accountholderdetails.getFirstname());
		registration.setLastname(accountholderdetails.getLastname());
		registration.setMiddlename(accountholderdetails.getMiddlename());
		registration.setSuffix(accountholderdetails.getSuffix());
		registration.setPrefix(accountholderdetails.getPrefix());
		registration.setGenderid(accountholderdetails.getGenderid());
		registration.setCountryid(accountholderdetails.getCountryid());
		registration.setCountrystateid(accountholderdetails.getStateid());
		registration.setCountrystatelgaid(accountholderdetails.getLgaid());
		registration.setLanguageid(accountholderdetails.getLanguageid());
		registration.setOccupation(accountholderdetails.getOccupation());
		registration.setEmployer(accountholderdetails.getEmployer());
		registration.setDateofbirth(accountholderdetails.getDateofbirth()
				.toString());
		registration.setUsername(username);
		registration.setMsisdn(msisdn);
		registration.setEmail(email);
		registration.setProfileid(profileid);
		registration.setBankcodeid(bankcodeid);
		registration.setBankaccount(bankaccount);
		registration.setClearingnumber(clearingnumber);
		registration.setCurrencyid(new Integer(currencyid));
		registration.setTermscondition(termscondition);

		for (Securityquestions securityquestions2 : securityquestions) {
			registration.setSecurityquestions(securityquestions2.getQuestion());
			registration.setSecurityquestionanswer(securityquestions2
					.getAnswer());
		}

		DataResponse dataResponse = provisioningclient
				.registration(registration);
		String statusMessage = "";

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;

	}

}
