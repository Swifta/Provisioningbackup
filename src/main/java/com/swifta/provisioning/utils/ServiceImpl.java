package com.swifta.provisioning.utils;

import java.rmi.RemoteException;

import com.swifta.sub.mats.operation.data.DataServiceFault;
import com.swifta.sub.mats.operation.data.Provisioningclient;
import com.swifta.sub.mats.operation.provisioning.v1.Securityquestions;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModel;
import com.swifta.sub.mats.serviceinterface.ActivationdataModel;
import com.swifta.sub.mats.serviceinterface.DataResponse;
import com.swifta.sub.mats.serviceinterface.IdentificationType;
import com.swifta.sub.mats.serviceinterface.LinkaccountModel;
import com.swifta.sub.mats.serviceinterface.RegistrationdataModel;
import com.swifta.sub.mats.serviceinterface.SetdefaultaccountModel;

public class ServiceImpl {

	public static DataResponse linkaccountrequest(String childuserresourceid,
			String parentresourceid, String initiatingresourceid,
			String profileid) throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		LinkaccountModel linkaccountModel = new LinkaccountModel();
		linkaccountModel.setLinkchildresourceid(childuserresourceid);
		linkaccountModel.setLinkparentaccountresourceid(parentresourceid);
		linkaccountModel.setinitiatinguserresourceid(initiatingresourceid);
		linkaccountModel.setProfileid(new Integer(profileid));
		DataResponse dataResponse = provisioningclient
				.linkaccountrequest(linkaccountModel);
		return dataResponse;
	}

	public static DataResponse registration(
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
		registration.setGender(accountholderdetails.getGender().toString());
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
		registration.setStatusMessage("1");
		registration.setReason("1");
		registration.setTransactionid(-1);

		for (Securityquestions securityquestions2 : securityquestions) {
			registration.setSecurityquestions(securityquestions2.getQuestion());
			registration.setSecurityquestionanswer(securityquestions2
					.getAnswer());
		}

		DataResponse dataResponse = provisioningclient
				.registration(registration);

		return dataResponse;

	}

	public static DataResponse servicefeecommission(
			java.lang.String spaccountholderid,
			com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeConditionTypes servicefeecondition,
			com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModelTypes servicefeemodel,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails)
			throws RemoteException, DataServiceFault {
		Provisioningclient provisioningclient = new Provisioningclient();

		ServiceFeeModel serviceFeeModel = new ServiceFeeModel();
		serviceFeeModel.setSpaccountholderid(new Integer(spaccountholderid));
		serviceFeeModel.setServicefeecondition(servicefeecondition.toString());
		serviceFeeModel.setServicefeemodel(servicefeemodel.toString());

		serviceFeeModel.setServicefees(servicefeedetails);

		serviceFeeModel.setServicecommissions(servicecommissiondetails);

		DataResponse daResponse = provisioningclient
				.setupfeesandcommission(serviceFeeModel);

		return daResponse;

	}

	public static DataResponse activationrequest(
			java.lang.String resourceid,
			com.swifta.sub.mats.operation.provisioning.v1.Credentials credential,
			java.lang.String securityquestionanswer,
			java.lang.String identificationno, java.lang.String bankdomainid,
			java.lang.String currency) throws RemoteException, DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ActivationdataModel activationdataModel = new ActivationdataModel();
		activationdataModel.setFirstpassword(credential.getFirstpin());
		activationdataModel.setConfirmpassword(credential.getConfirmpin());
		activationdataModel.setCurrency(currency);
		activationdataModel.setIdentificationno(identificationno);
		activationdataModel.setUsername(resourceid);
		activationdataModel.setSecurityquestionanswer(securityquestionanswer);

		DataResponse dataResponse = provisioningclient
				.activation(activationdataModel);

		return dataResponse;
	}

	public static DataResponse setdefaultaccount(
			java.lang.String childuserresourceid,
			java.lang.String paraentaccountresourceid,
			java.lang.String initiatinguserresourceid) throws RemoteException,
			DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		SetdefaultaccountModel setdefaultaccountModel = new SetdefaultaccountModel();
		setdefaultaccountModel.setDchilduserresourceid(childuserresourceid);
		setdefaultaccountModel
				.setDparentaccountresourceid(paraentaccountresourceid);
		setdefaultaccountModel
				.setInitiatinguserresourceid(initiatinguserresourceid);

		DataResponse dataResponse = provisioningclient
				.setdefaultaccount(setdefaultaccountModel);

		return dataResponse;
	}
}
