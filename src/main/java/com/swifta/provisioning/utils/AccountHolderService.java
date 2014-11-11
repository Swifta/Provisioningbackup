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
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Registration;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Registrationresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Registrationresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.RegistrationresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetdefaultaccountresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetparentresponsesE;
import com.swifta.sub.mats.operation.provisioning.v1.Credentials;
import com.swifta.sub.mats.operation.provisioning.v1.Securityquestions;

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
		logger.info("---------------Instantiate stub service class");
		Setparentrequest setParentRequest = new Setparentrequest();
		setParentRequest.setChilduserresourceid(childUsername);
		setParentRequest.setParentuserresourceid(parentUsername);
		logger.info("---------------After setting the parameters for setParentRequest");
		SetparentresponsesE setParentResponses = matsStub
				.setparentrequest(setParentRequest);
		if (setParentResponses != null) {
			logger.info("---------------After getting SetparentresponsesE class");
			Setparentresponses parentResponses = setParentResponses
					.getSetparentresponses();
			if (parentResponses != null) {
				logger.info("---------------After getting Setparentresponses class");
				Setparentresponse[] parentResponseArray = parentResponses
						.getSetparentresponse();
				if (parentResponseArray != null) {
					logger.info("---------------After getting Setparentresponse[] class");
					for (Setparentresponse singleResponse : parentResponseArray) {
						statusMessage = singleResponse.getStatusMessage();
						logger.info("---------------After Iterating Setparentresponse[] class");
					}
				} else {
					logger.info("---------------After getting Setparentresponse[] class and its null");
				}
			} else {
				logger.info("---------------After getting Setparentresponses class and its null");
			}
		} else {
			logger.info("---------------After getting SetparentresponsesE class and its null");
		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;
	}

	public String setdefaultaccountrequest(String childUsername,
			String parentUsername) throws RemoteException, DataServiceFault {
		matsStub = new MatsdataserviceStub();
		logger.info("---------------Instantiate stub service class");
		String statusMessage = "";
		Setdefaultaccountrequest setdefaultaccountrequest = new Setdefaultaccountrequest();
		setdefaultaccountrequest.setChilduserresourceid(childUsername);
		setdefaultaccountrequest.setParentaccountresourceid(parentUsername);
		logger.info("---------------After setting the parameters for Setdefaultaccountrequest");
		SetdefaultaccountresponsesE defaultAccountResponses = matsStub
				.setdefaultaccountrequest(setdefaultaccountrequest);
		if (defaultAccountResponses != null) {
			logger.info("---------------After getting SetdefaultaccountresponsesE class");
			Setdefaultaccountresponses defaultResponses = defaultAccountResponses
					.getSetdefaultaccountresponses();
			if (defaultResponses != null) {
				logger.info("---------------After getting Setdefaultaccountresponses class");
				Setdefaultaccountresponse[] defaultResponseArray = defaultResponses
						.getSetdefaultaccountresponse();
				if (defaultResponseArray != null) {
					logger.info("---------------After getting Setdefaultaccountresponse[] class");
					for (Setdefaultaccountresponse singleResponse : defaultResponseArray) {
						statusMessage = singleResponse.getStatusMessage();
						logger.info("---------------After Iterating Setdefaultaccountresponse[] class");
					}
				} else {
					logger.info("---------------After getting Setdefaultaccountresponse[] class and its null");
				}
			} else {
				logger.info("---------------After getting Setdefaultaccountresponses class and its null");
			}
		} else {
			logger.info("---------------After getting SetdefaultaccountresponsesE class and its null");
		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;
	}

	public String activateUser(String username, Credentials credential,
			String securityAnswer, String identificaitonNo, String bankNo,
			String currency) throws RemoteException, DataServiceFault {
		matsStub = new MatsdataserviceStub();
		logger.info("---------------Instantiate stub service class");
		String statusMessage = "";
		Activationrequest activationRequest = new Activationrequest();
		activationRequest.setUsername(username);
		activationRequest.setConfirmpassword(credential.getConfirmpin());
		activationRequest.setCurrencyid(currency);
		activationRequest.setIbankdomainid(bankNo);
		activationRequest.setSecurityquestionanswer(securityAnswer);
		activationRequest.setIdentificationno(identificaitonNo);
		activationRequest.setFirstpassword(credential.getFirstpin());
		logger.info("---------------After setting the parameters for Activationrequest");
		ActivationresponsesE activationResponses = matsStub
				.activationrequest(activationRequest);
		if (activationResponses != null) {
			logger.info("---------------After getting ActivationresponsesE class");
			Activationresponses activationResponse = activationResponses
					.getActivationresponses();
			if (activationResponse != null) {
				logger.info("---------------After getting Activationresponses class");
				Activationresponse[] response = activationResponse
						.getActivationresponse();
				if (response != null) {
					logger.info("---------------After getting Activationresponse[] class");
					for (Activationresponse singleResponse : response) {
						statusMessage = singleResponse.getStatusMessage();
						logger.info("---------------After Iterating Activationresponse[] class");
					}
				} else {
					logger.info("---------------After getting Activationresponse[] class and its null");
				}
			} else {
				logger.info("---------------After getting Activationresponses class and its null");
			}
		} else {
			logger.info("---------------After getting ActivationresponsesE class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return statusMessage;
	}

	public String registerUser(
			com.swifta.sub.mats.operation.provisioning.v1.Accountholderdetails AccountHolderDetails,
			String bankAccount,
			int bankcodeid,
			int bankDomainid,
			String clearingNumber,
			int currencyid,
			String email,
			String msisdn,
			int profileid,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.Securityquestions> securityquestions,
			String termscondition, String username) throws RemoteException,
			DataServiceFault {
		matsStub = new MatsdataserviceStub();
		Registration registration8 = new Registration();
		String securityQues = "";
		String securityAns = "";
		String statusMessage = "";
		String Message = "";

		registration8.setBankaccount(bankAccount);
		registration8.setBankcodeid(bankcodeid);
		registration8.setBankdomainid(bankDomainid);
		registration8.setCity(AccountHolderDetails.getAddress().getCity());
		registration8.setClearingnumber(clearingNumber);
		registration8.setCountryid(AccountHolderDetails.getCountryid());
		registration8.setCountrystateid(AccountHolderDetails.getStateid());
		registration8.setCountrystatelgaid(AccountHolderDetails.getLgaid());
		registration8.setCurrencyid(currencyid);
		registration8.setDateofbirth(AccountHolderDetails.getDateofbirth()
				.toString());
		registration8.setEmail(email);
		registration8.setEmployer(AccountHolderDetails.getEmployer());
		registration8.setExpirydate(AccountHolderDetails.getIdentification()
				.getExpirydate().toString());
		registration8.setFirstname(AccountHolderDetails.getFirstname());
		registration8.setGenderid(AccountHolderDetails.getGenderid());
		registration8.setIdentificationnumber(AccountHolderDetails
				.getIdentification().getIdentificationNo());
		// registration8.setIdentificationtypeid();
		registration8.setIsssuer(AccountHolderDetails.getIdentification()
				.getIssuer());
		registration8.setIssueDate(AccountHolderDetails.getIdentification()
				.getIssueDate());
		registration8.setLanguageid(AccountHolderDetails.getLanguageid());
		registration8.setLastname(AccountHolderDetails.getLastname());
		registration8.setMiddlename(AccountHolderDetails.getMiddlename());
		registration8.setMsisdn(msisdn);
		registration8.setOccupation(AccountHolderDetails.getOccupation());
		registration8.setPostalCode(AccountHolderDetails.getAddress()
				.getPostalCode());
		registration8.setPrefix(AccountHolderDetails.getPrefix());
		registration8.setPrimarycontactemail(AccountHolderDetails
				.getPrimarycontact().getEmail());
		registration8.setPrimarycontactmobilenumber(AccountHolderDetails
				.getPrimarycontact().getMobilenumber());
		registration8.setPrimarycontactname(AccountHolderDetails
				.getPrimarycontact().getName());
		registration8.setPrimarycontactphonenumber(AccountHolderDetails
				.getPrimarycontact().getPhonenumber());
		registration8.setProfileid(profileid);
		registration8.setProvince(AccountHolderDetails.getAddress()
				.getProvince());
		registration8.setSecondarycontactemail(AccountHolderDetails
				.getSecondarycontact().getEmail());
		registration8.setSecondarycontactmobilenumber(AccountHolderDetails
				.getSecondarycontact().getMobilenumber());
		registration8.setSecondarycontactname(AccountHolderDetails
				.getSecondarycontact().getName());
		registration8.setSecondarycontactphonenumber(AccountHolderDetails
				.getSecondarycontact().getPhonenumber());
		if (securityquestions != null) {
			for (Securityquestions singleResponse : securityquestions) {
				securityQues = singleResponse.getQuestion();
				securityAns = singleResponse.getAnswer();
			}
		}

		registration8.setSecurityquestionanswer(securityQues);
		registration8.setSecurityquestions(securityQues);
		// registration8.setStatusMessage();
		registration8.setStreetaddress(AccountHolderDetails.getAddress()
				.getStreetaddress());
		registration8.setSuffix(AccountHolderDetails.getSuffix());
		registration8.setTermscondition(termscondition);
		registration8.setUsername(username);

		RegistrationresponsesE response = matsStub.registration(registration8);
		if (response != null) {
			Registrationresponses response2 = response
					.getRegistrationresponses();
			if (response2 != null) {
				Registrationresponse[] response3 = response2
						.getRegistrationresponse();
				if (response3 != null) {
					for (Registrationresponse singleResponse : response3) {
						Message = singleResponse.getStatusMessage();
					}
					statusMessage = Message;
				} else {
					statusMessage = "Response is empty";
				}

			} else {
				statusMessage = "Response is empty";
			}
		} else {
			statusMessage = "Response is empty";
		}

		return statusMessage;

	}

}
