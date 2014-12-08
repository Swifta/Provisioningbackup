/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.swifta.sub.mats.operation.provisioning.v1_0;

import java.util.logging.Logger;

import com.swifta.sub.mats.operation.data.Provisioningclient;
import com.swifta.sub.mats.operation.provisioning.v1.Linkaccountresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Registrationrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Securityquestions;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModel;
import com.swifta.sub.mats.operation.provisioning.v1.Servicefeeandcomissionrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.SetDefaultaccountrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.Setparentrequestresponse;
import com.swifta.sub.mats.operation.provisioning.v1.StatusCode;
import com.swifta.sub.mats.serviceinterface.ActivationdataModel;
import com.swifta.sub.mats.serviceinterface.DataResponse;
import com.swifta.sub.mats.serviceinterface.IdentificationType;
import com.swifta.sub.mats.serviceinterface.LinkaccountModel;
import com.swifta.sub.mats.serviceinterface.RegistrationdataModel;
import com.swifta.sub.mats.serviceinterface.SetdefaultaccountModel;
import com.swifta.sub.mats.serviceinterface.SetparentModel;

/**
 * This class was generated by Apache CXF 3.0.1 2014-12-01T13:37:43.024+03:00
 * Generated source version: 3.0.1
 * 
 */

@javax.jws.WebService(serviceName = "provisioning", portName = "ProvisioningPort", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", wsdlLocation = "/Users/modupealadeojebi/Documents/java2wsdl/version1/PaymentSystemAggregator/target/generated/wsdl/Provisioning.wsdl", endpointInterface = "com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning")
public class ProvisioningPortImpl implements Provisioning {

	private static final Logger LOG = Logger
			.getLogger(ProvisioningPortImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * isProfileauthorised(java.lang.String profilename ,)java.lang.String
	 * operation ,)java.lang.String permission )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Isprofileathresponse isProfileauthorised(
			java.lang.String profilename, java.lang.String operation,
			java.lang.String permission) {
		LOG.info("Executing operation isProfileauthorised");
		System.out.println(profilename);
		System.out.println(operation);
		System.out.println(permission);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Isprofileathresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * linkaccountrequest(java.lang.String userresourceid ,)java.lang.String
	 * profileid ,)java.lang.String paraentaccountresourceid ,)java.lang.String
	 * reason )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Linkaccountresponse linkaccountrequest(
			java.lang.String userresourceid, java.lang.String profileid,
			java.lang.String paraentaccountresourceid, java.lang.String reason) {
		LOG.info("Executing operation linkaccountrequest");
		System.out.println(userresourceid);
		System.out.println(profileid);
		System.out.println(paraentaccountresourceid);
		System.out.println(reason);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Linkaccountresponse linkaccountresponse = new Linkaccountresponse();

			Provisioningclient provisioningclient = new Provisioningclient();

			LinkaccountModel linkaccountModel = new LinkaccountModel();
			linkaccountModel.setLinkchildresourceid(userresourceid);
			linkaccountModel
					.setLinkparentaccountresourceid(paraentaccountresourceid);
			DataResponse dataResponse = provisioningclient
					.linkaccountrequest(linkaccountModel);

			linkaccountresponse.setResponsemessage(dataResponse
					.getStatusMessage());

			return linkaccountresponse;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * suspendaccountholder(java.lang.String resourceid ,)java.lang.String
	 * confirmcredential )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Suspendaccountholderrequestresponse suspendaccountholder(
			java.lang.String resourceid, java.lang.String confirmcredential) {
		LOG.info("Executing operation suspendaccountholder");
		System.out.println(resourceid);
		System.out.println(confirmcredential);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Suspendaccountholderrequestresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#registration
	 * (java.lang.String username ,)java.lang.String msisdn ,)java.lang.String
	 * email ,)int profileid ,)int bankcodeid ,)java.lang.String bankaccount
	 * ,)java.lang.String clearingnumber
	 * ,)com.swifta.sub.mats.operation.provisioning.v1.Accountholderdetails
	 * accountholderdetails ,)java.lang.String currencyid ,)java.lang.String
	 * bankdomainnameid ,)java.lang.String termscondition
	 * ,)java.util.List<com.swifta
	 * .sub.mats.operation.provisioning.v1.Securityquestions> securityquestions
	 * )*
	 */
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
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.Securityquestions> securityquestions) {
		LOG.info("Executing operation registration");
		System.out.println(username);
		System.out.println(msisdn);
		System.out.println(email);
		System.out.println(profileid);
		System.out.println(bankcodeid);
		System.out.println(bankaccount);
		System.out.println(clearingnumber);
		System.out.println(accountholderdetails);
		System.out.println(currencyid);
		System.out.println(bankdomainnameid);
		System.out.println(termscondition);
		System.out.println(securityquestions);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Registrationrequestresponse registrationrequestresponse = new Registrationrequestresponse();

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
				registration.setSecurityquestions(securityquestions2
						.getQuestion());
				registration.setSecurityquestionanswer(securityquestions2
						.getAnswer());
			}

			DataResponse dataResponse = provisioningclient
					.registration(registration);

			registrationrequestresponse.setResponsemessage(dataResponse
					.getStatusMessage());

			return registrationrequestresponse;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#getProfileofUser
	 * (java.lang.String resourceid )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Getuserprofileresponse getProfileofUser(
			java.lang.String resourceid) {
		LOG.info("Executing operation getProfileofUser");
		System.out.println(resourceid);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Getuserprofileresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * addcustodyaccount(java.lang.String currencycode ,)java.lang.String
	 * bankcode ,)java.lang.String accountnumber ,)java.lang.String accountname
	 * ,)java.lang.String bankdomain )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Addcustodyaccountrequestresponse addcustodyaccount(
			java.lang.String currencycode, java.lang.String bankcode,
			java.lang.String accountnumber, java.lang.String accountname,
			java.lang.String bankdomain) {
		LOG.info("Executing operation addcustodyaccount");
		System.out.println(currencycode);
		System.out.println(bankcode);
		System.out.println(accountnumber);
		System.out.println(accountname);
		System.out.println(bankdomain);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Addcustodyaccountrequestresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * setupservicefeesandcommission(java.lang.String spaccountholderid
	 * ,)com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeConditionTypes
	 * servicefeecondition
	 * ,)com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModelTypes
	 * servicefeemodel
	 * ,)java.util.List<com.swifta.sub.mats.operation.provisioning
	 * .v1.ServiceFees> servicefeedetails
	 * ,)java.util.List<com.swifta.sub.mats.operation
	 * .provisioning.v1.ServiceCommission> servicecommissiondetails )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Servicefeeandcomissionrequestresponse setupservicefeesandcommission(
			java.lang.String spaccountholderid,
			com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeConditionTypes servicefeecondition,
			com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModelTypes servicefeemodel,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails,
			java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails) {
		LOG.info("Executing operation setupservicefeesandcommission");
		System.out.println(spaccountholderid);
		System.out.println(servicefeecondition);
		System.out.println(servicefeemodel);
		System.out.println(servicefeedetails);
		System.out.println(servicecommissiondetails);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Servicefeeandcomissionrequestresponse servicefeeandcomissionrequestresponse = new Servicefeeandcomissionrequestresponse();

			Provisioningclient provisioningclient = new Provisioningclient();

			ServiceFeeModel serviceFeeModel = new ServiceFeeModel();
			serviceFeeModel
					.setSpaccountholderid(new Integer(spaccountholderid));
			serviceFeeModel.setServicefeecondition(servicefeecondition
					.toString());
			serviceFeeModel.setServicefeemodel(servicefeemodel.toString());

			serviceFeeModel.setServicefees(servicefeedetails);

			serviceFeeModel.setServicecommissions(servicecommissiondetails);

			DataResponse daResponse = provisioningclient
					.setupfeesandcommission(serviceFeeModel);

			servicefeeandcomissionrequestresponse
					.setStatuscode(StatusCode.COMPLETED);
			servicefeeandcomissionrequestresponse
					.setResponsemessage(daResponse.statusDescription);

			return servicefeeandcomissionrequestresponse;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * activationrequest(java.lang.String resourceid
	 * ,)com.swifta.sub.mats.operation.provisioning.v1.Credentials credential
	 * ,)java.lang.String securityquestionanswer ,)java.lang.String
	 * identificationno ,)java.lang.String bankdomainid ,)java.lang.String
	 * currency )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Activationresponse activationrequest(
			java.lang.String resourceid,
			com.swifta.sub.mats.operation.provisioning.v1.Credentials credential,
			java.lang.String securityquestionanswer,
			java.lang.String identificationno, java.lang.String bankdomainid,
			java.lang.String currency) {
		LOG.info("Executing operation activationrequest");
		System.out.println(resourceid);
		System.out.println(credential);
		System.out.println(securityquestionanswer);
		System.out.println(identificationno);
		System.out.println(bankdomainid);
		System.out.println(currency);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Activationresponse activationrequestresponse = new com.swifta.sub.mats.operation.provisioning.v1.Activationresponse();

			Provisioningclient provisioningclient = new Provisioningclient();

			ActivationdataModel activationdataModel = new ActivationdataModel();
			activationdataModel.setFirstpassword(credential.getFirstpin());
			activationdataModel.setConfirmpassword(credential.getConfirmpin());
			activationdataModel.setCurrency(currency);
			activationdataModel.setIdentificationno(identificationno);
			activationdataModel.setUsername(resourceid);
			activationdataModel
					.setSecurityquestionanswer(securityquestionanswer);

			DataResponse dataResponse = provisioningclient
					.activation(activationdataModel);

			activationrequestresponse.setResponsemessage(dataResponse
					.getStatusMessage());

			return activationrequestresponse;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * setdefaultaccount(java.lang.String userresourceid ,)java.lang.String
	 * paraentaccountresourceid ,)java.lang.String reason )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.SetDefaultaccountrequestresponse setdefaultaccount(
			java.lang.String userresourceid,
			java.lang.String paraentaccountresourceid, java.lang.String reason) {
		LOG.info("Executing operation setdefaultaccount");
		System.out.println(userresourceid);
		System.out.println(paraentaccountresourceid);
		System.out.println(reason);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.SetDefaultaccountrequestresponse setDefaultaccountrequestresponse = new SetDefaultaccountrequestresponse();

			Provisioningclient provisioningclient = new Provisioningclient();

			SetdefaultaccountModel setdefaultaccountModel = new SetdefaultaccountModel();
			setdefaultaccountModel.setDchilduserresourceid(userresourceid);
			setdefaultaccountModel
					.setDparentaccountresourceid(paraentaccountresourceid);

			DataResponse dataResponse = provisioningclient
					.setdefaultaccount(setdefaultaccountModel);

			setDefaultaccountrequestresponse.setResponsemessage(dataResponse
					.getStatusMessage());

			return setDefaultaccountrequestresponse;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#setparentaccount
	 * (java.lang.String userresourceid ,)java.lang.String
	 * paraentaccountresourceid ,)java.lang.String reason )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Setparentrequestresponse setparentaccount(
			java.lang.String userresourceid,
			java.lang.String paraentaccountresourceid, java.lang.String reason) {
		LOG.info("Executing operation setparentaccount");
		System.out.println(userresourceid);
		System.out.println(paraentaccountresourceid);
		System.out.println(reason);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Setparentrequestresponse setparentrequestresponse = new Setparentrequestresponse();

			Provisioningclient provisioningclient = new Provisioningclient();

			SetparentModel setparentModel = new SetparentModel();

			setparentModel.setChilduserresourceid(userresourceid);
			setparentModel.setParentuserresourceid(paraentaccountresourceid);

			DataResponse dataResponse = provisioningclient
					.setparent(setparentModel);

			setparentrequestresponse.setResponsemessage(dataResponse
					.getStatusMessage());

			return setparentrequestresponse;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * disconnectaccount(java.lang.String userresourceid ,)java.lang.String
	 * paraentaccountresourceid ,)java.lang.String reason )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Disconnectaccountrequestresponse disconnectaccount(
			java.lang.String userresourceid,
			java.lang.String paraentaccountresourceid, java.lang.String reason) {
		LOG.info("Executing operation disconnectaccount");
		System.out.println(userresourceid);
		System.out.println(paraentaccountresourceid);
		System.out.println(reason);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Disconnectaccountrequestresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#authenticate
	 * (java.lang.String resourceid ,)java.lang.String password )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Authenticationresponse authenticate(
			java.lang.String resourceid, java.lang.String password) {
		LOG.info("Executing operation authenticate");
		System.out.println(resourceid);
		System.out.println(password);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Authenticationresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#addaccount
	 * (java.lang.String accounttype ,)java.lang.String accountprofileid
	 * ,)java.lang.String accountreferenceprofile )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Addaccountrequestresponse addaccount(
			java.lang.String accounttype, java.lang.String accountprofileid,
			java.lang.String accountreferenceprofile) {
		LOG.info("Executing operation addaccount");
		System.out.println(accounttype);
		System.out.println(accountprofileid);
		System.out.println(accountreferenceprofile);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Addaccountrequestresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.swifta.sub.mats.operation.provisioning.v1_0.Provisioning#
	 * addaccounttoexistinguser(java.lang.String resourceid ,)java.lang.String
	 * accounttype ,)java.lang.String profileid ,)java.lang.String currency )*
	 */
	public com.swifta.sub.mats.operation.provisioning.v1.Addaccounttoexistinguserrequestresponse addaccounttoexistinguser(
			java.lang.String resourceid, java.lang.String accounttype,
			java.lang.String profileid, java.lang.String currency) {
		LOG.info("Executing operation addaccounttoexistinguser");
		System.out.println(resourceid);
		System.out.println(accounttype);
		System.out.println(profileid);
		System.out.println(currency);
		try {
			com.swifta.sub.mats.operation.provisioning.v1.Addaccounttoexistinguserrequestresponse _return = null;
			return _return;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
