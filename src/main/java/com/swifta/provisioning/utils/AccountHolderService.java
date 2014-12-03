package com.swifta.provisioning.utils;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.Provisioningclient;
import com.swifta.sub.mats.operation.data.model.IdentificationType;
import com.swifta.sub.mats.operation.provisioning.v1.Activationresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Linkaccountresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Registrationrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Securityquestions;
import com.swifta.sub.mats.operation.provisioning.v1.Servicefeeandcomissionrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.SetDefaultaccountrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Setparentrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.StatusCode;
import com.swifta.sub.mats.serviceinterface.ActivationdataModel;
import com.swifta.sub.mats.serviceinterface.DataResponse;
import com.swifta.sub.mats.serviceinterface.LinkaccountModel;
import com.swifta.sub.mats.serviceinterface.RegistrationdataModel;
import com.swifta.sub.mats.serviceinterface.ServiceCommission;
import com.swifta.sub.mats.serviceinterface.ServiceFeeModel;
import com.swifta.sub.mats.serviceinterface.ServiceFeematrix;
import com.swifta.sub.mats.serviceinterface.ServiceFees;
import com.swifta.sub.mats.serviceinterface.SetdefaultaccountModel;
import com.swifta.sub.mats.serviceinterface.SetparentModel;

public class AccountHolderService {
	// MatsdataserviceStub matsStub = null;
	Provisioningclient provisioningClient = null;
	private static final Logger logger = Logger
			.getLogger(AccountHolderService.class);

	public com.swifta.sub.mats.operation.provisioning.v1.Servicefeeandcomissionrequestresponse setupservicefeesandcommission(
			java.lang.String spaccountholderid,
			com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeConditionTypes servicefeecondition,
			com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModelTypes servicefeemodel,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails)
			throws RemoteException, DataServiceFault {
		String statusMessage = "";
		Servicefeeandcomissionrequestresponse response = new Servicefeeandcomissionrequestresponse();
		ServiceFeeModel serviceFeeModel = new ServiceFeeModel();

		// serviceFeeModel.setServicefeecondition(servicefeecondition.TRANSACTIONTYPE.toString());
		serviceFeeModel.setServicefeecondition(servicefeecondition.toString());

		serviceFeeModel.setServicefeemodel(servicefeemodel.toString());
		List<ServiceCommission> serviceCommissions = new ArrayList<ServiceCommission>();
		ServiceCommission parseServiceCommission;
		for (com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission newServiceCommission : servicecommissiondetails) {
			parseServiceCommission = new ServiceCommission();
			parseServiceCommission.setCommissionfee(newServiceCommission
					.getCommissionfee());
			parseServiceCommission.setCommissionfeetype(newServiceCommission
					.getCommissionfeetype());
			parseServiceCommission.setMaximumamount(newServiceCommission
					.getMaximumamount());
			parseServiceCommission.setMinimumamount(newServiceCommission
					.getMinimumamount());
			parseServiceCommission
					.setServicecommissioncondition(newServiceCommission
							.getServicecommissioncondition().toString());
			parseServiceCommission
					.setServicecommissionmodeltype(newServiceCommission
							.getServicecommissionmodeltype().toString());
			parseServiceCommission.setTransactiontypeid(newServiceCommission
					.getTransactiontypeid());

			serviceCommissions.add(parseServiceCommission);
		}

		serviceFeeModel.setServicecommissions(serviceCommissions);

		List<ServiceFees> serviceFees = new ArrayList<ServiceFees>();
		ServiceFees parseServiceFees;
		for (com.swifta.sub.mats.operation.provisioning.v1.ServiceFees newServiceFee : servicefeedetails) {

			parseServiceFees = new ServiceFees();
			parseServiceFees.setMaximumamount(newServiceFee.getMaximumamount());
			parseServiceFees.setMinimumamount(newServiceFee.getMinimumamount());
			parseServiceFees.setServicefee(newServiceFee.getServicefee());
			if (newServiceFee
					.getServicefeetype()
					.toString()
					.equalsIgnoreCase(
							newServiceFee.getServicefeetype().PERCENT
									.toString()))
				parseServiceFees.setServicefeetype(ServiceFeematrix.PERCENT);
			else if (newServiceFee
					.getServicefeetype()
					.toString()
					.equalsIgnoreCase(
							newServiceFee.getServicefeetype().FIXED.toString()))
				parseServiceFees.setServicefeetype(ServiceFeematrix.FIXED);

			parseServiceFees.setTransactiontypeid(newServiceFee
					.getTransactiontypeid());

			serviceFees.add(parseServiceFees);
		}
		serviceFeeModel.setServicefees(serviceFees);
		serviceFeeModel
				.setSpaccountholderid(Integer.valueOf(spaccountholderid));
		DataResponse dataResponse = provisioningClient
				.setupfeesandcommission(serviceFeeModel);

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();
			response.setResponsemessage(dataResponse.getStatusDescription());
			switch (dataResponse.getStatusMessage()) {
			case "FAILED":
				response.setStatuscode(StatusCode.FAILED);
				break;
			case "COMPLETE":
				response.setStatuscode(StatusCode.COMPLETED);
				break;
			case "REJECTED":
				response.setStatuscode(StatusCode.REJECTED);
				break;
			default:
				response.setStatuscode(StatusCode.PENDING);
				break;
			}

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return response;

	}

	public com.swifta.sub.mats.operation.provisioning.v1.Registrationrequestresponse registration(
			java.lang.String username,
			java.lang.String msisdn,
			java.lang.String email,
			int profileid,
			int bankcodeid,
			java.lang.String bankaccount,
			java.lang.String clearingnumber,
			com.swifta.sub.mats.operation.provisioning.v1.Accountholderdetails accountholderdetails,
			java.lang.String currencyid,
			java.lang.String bankdomainnameid,
			java.lang.String termscondition,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.Securityquestions> securityquestions)
			throws RemoteException, DataServiceFault {
		Registrationrequestresponse response = new Registrationrequestresponse();
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
			response.setResponsemessage(dataResponse.getStatusDescription());
			switch (dataResponse.getStatusMessage()) {
			case "FAILED":
				response.setStatuscode(StatusCode.FAILED);
				break;
			case "COMPLETE":
				response.setStatuscode(StatusCode.COMPLETED);
				break;
			case "REJECTED":
				response.setStatuscode(StatusCode.REJECTED);
				break;
			default:
				response.setStatuscode(StatusCode.PENDING);
				break;
			}

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return response;

	}

	public com.swifta.sub.mats.operation.provisioning.v1.SetDefaultaccountrequestresponse setdefaultaccount(
			java.lang.String userresourceid,
			java.lang.String paraentaccountresourceid, java.lang.String reason)
			throws RemoteException, DataServiceFault {
		SetDefaultaccountrequestresponse response = new SetDefaultaccountrequestresponse();
		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");
		String statusMessage = "";
		SetdefaultaccountModel setdefaultaccountModel = new SetdefaultaccountModel();
		setdefaultaccountModel.setDchilduserresourceid(userresourceid);
		setdefaultaccountModel
				.setDparentaccountresourceid(paraentaccountresourceid);
		logger.info("---------------After setting the parameters for Setdefaultaccountrequest");
		DataResponse dataResponse = provisioningClient
				.setdefaultaccount(setdefaultaccountModel);

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();
			response.setResponsemessage(dataResponse.getStatusDescription());
			switch (dataResponse.getStatusMessage()) {
			case "FAILED":
				response.setStatuscode(StatusCode.FAILED);
				break;
			case "COMPLETE":
				response.setStatuscode(StatusCode.COMPLETED);
				break;
			case "REJECTED":
				response.setStatuscode(StatusCode.REJECTED);
				break;
			default:
				response.setStatuscode(StatusCode.PENDING);
				break;
			}

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return response;
	}

	public com.swifta.sub.mats.operation.provisioning.v1.Setparentrequestresponse setparentaccount(
			java.lang.String userresourceid,
			java.lang.String paraentaccountresourceid, java.lang.String reason)
			throws RemoteException, DataServiceFault {
		Setparentrequestresponse response = new Setparentrequestresponse();

		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");
		SetparentModel parentModel = new SetparentModel();
		parentModel.setChilduserresourceid(userresourceid);
		parentModel.setParentuserresourceid(paraentaccountresourceid);
		logger.info("---------------After setting the parameters for SetparentModel");
		DataResponse dataResponse = provisioningClient.setparent(parentModel);
		String statusMessage = "";

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();
			response.setResponsemessage(dataResponse.getStatusDescription());
			switch (dataResponse.getStatusMessage()) {
			case "FAILED":
				response.setStatuscode(StatusCode.FAILED);
				break;
			case "COMPLETE":
				response.setStatuscode(StatusCode.COMPLETED);
				break;
			case "REJECTED":
				response.setStatuscode(StatusCode.REJECTED);
				break;
			default:
				response.setStatuscode(StatusCode.PENDING);
				break;
			}

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return response;
	}

	public com.swifta.sub.mats.operation.provisioning.v1.Linkaccountresponse linkaccountrequest(
			java.lang.String userresourceid, java.lang.String profileid,
			java.lang.String paraentaccountresourceid, java.lang.String reason)
			throws RemoteException, DataServiceFault {
		Linkaccountresponse response = new Linkaccountresponse();
		String statusMessage = "";
		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");

		LinkaccountModel linkaccountModel = new LinkaccountModel();
		linkaccountModel.setReason(reason);
		linkaccountModel.setProfileid(Integer.valueOf(profileid));
		linkaccountModel.setLinkchildresourceid(userresourceid);
		linkaccountModel
				.setLinkparentaccountresourceid(paraentaccountresourceid);
		logger.info("---------------After setting the parameters for link account request");
		DataResponse dataResponse = provisioningClient
				.linkaccountrequest(linkaccountModel);
		// matsStub = new MatsdataserviceStub();

		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();
			response.setResponsemessage(dataResponse.getStatusDescription());
			switch (dataResponse.getStatusMessage()) {
			case "FAILED":
				response.setStatuscode(StatusCode.FAILED);
				break;
			case "COMPLETE":
				response.setStatuscode(StatusCode.COMPLETED);
				break;
			case "REJECTED":
				response.setStatuscode(StatusCode.REJECTED);
				break;
			default:
				response.setStatuscode(StatusCode.PENDING);
				break;
			}

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return response;

	}

	public com.swifta.sub.mats.operation.provisioning.v1.Activationresponse activationrequest(
			java.lang.String resourceid,
			com.swifta.sub.mats.operation.provisioning.v1.Credentials credential,
			java.lang.String securityquestionanswer,
			java.lang.String identificationno, java.lang.String bankdomainid,
			java.lang.String currency) throws RemoteException, DataServiceFault {
		Activationresponse response = new Activationresponse();
		provisioningClient = new Provisioningclient();
		logger.info("---------------Instantiate stub service class");

		ActivationdataModel activationdataModel = new ActivationdataModel();
		activationdataModel.setConfirmpassword(credential.getConfirmpin());
		activationdataModel.setCurrency(currency);
		activationdataModel.setFirstpassword(credential.getFirstpin());
		activationdataModel.setIdentificationno(identificationno);
		activationdataModel.setSecurityquestionanswer(securityquestionanswer);
		activationdataModel.setUsername(resourceid);
		DataResponse dataResponse = provisioningClient
				.activation(activationdataModel);

		String statusMessage = "";
		logger.info("---------------After setting the parameters for ActivationdataModel");
		if (dataResponse != null) {
			logger.info("---------------After getting dataResponse class");
			statusMessage = dataResponse.getStatusMessage();
			response.setResponsemessage(dataResponse.getStatusDescription());
			switch (dataResponse.getStatusMessage()) {
			case "FAILED":
				response.setStatuscode(StatusCode.FAILED);
				break;
			case "COMPLETE":
				response.setStatuscode(StatusCode.COMPLETED);
				break;
			case "REJECTED":
				response.setStatuscode(StatusCode.REJECTED);
				break;
			default:
				response.setStatuscode(StatusCode.PENDING);
				break;
			}

		} else {
			logger.info("---------------After getting dataResponse class and its null");

		}
		logger.info("---------------Returning message ::::" + statusMessage);
		return response;

	}
}
