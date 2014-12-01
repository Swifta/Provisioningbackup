package com.swifta.sub.mats.operation.provisioning.v1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-12-01T13:58:01.115+01:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "Provisioning")
@XmlSeeAlso({com.swifta.sub.mats.operation.provisioning.v1.ObjectFactory.class})
public interface Provisioning {

    @WebMethod(action = "isProfileauthorised")
    @RequestWrapper(localName = "isProfileauthorised", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.IsProfileauthorised")
    @ResponseWrapper(localName = "isProfileauthorisedResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.IsProfileauthorisedResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Isprofileathresponse isProfileauthorised(
        @WebParam(name = "profilename", targetNamespace = "")
        java.lang.String profilename,
        @WebParam(name = "operation", targetNamespace = "")
        java.lang.String operation,
        @WebParam(name = "permission", targetNamespace = "")
        java.lang.String permission
    );

    @WebMethod(action = "setufeeandcommission")
    @RequestWrapper(localName = "setupservicefeesandcommission", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Setupservicefeesandcommission")
    @ResponseWrapper(localName = "setupservicefeesandcommissionResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetupservicefeesandcommissionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Servicefeeandcomissionrequestresponse setupservicefeesandcommission(
        @WebParam(name = "spaccountholderid", targetNamespace = "")
        java.lang.String spaccountholderid,
        @WebParam(name = "servicefeecondition", targetNamespace = "")
        com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeConditionTypes servicefeecondition,
        @WebParam(name = "servicefeemodel", targetNamespace = "")
        com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModelTypes servicefeemodel,
        @WebParam(name = "servicefeedetails", targetNamespace = "")
        java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceFees> servicefeedetails,
        @WebParam(name = "servicecommissiondetails", targetNamespace = "")
        java.util.List<com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission> servicecommissiondetails
    );

    @WebMethod(action = "registration")
    @RequestWrapper(localName = "registration", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Registration")
    @ResponseWrapper(localName = "registrationResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.RegistrationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Registrationrequestresponse registration(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username,
        @WebParam(name = "msisdn", targetNamespace = "")
        java.lang.String msisdn,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "profileid", targetNamespace = "")
        int profileid,
        @WebParam(name = "bankcodeid", targetNamespace = "")
        int bankcodeid,
        @WebParam(name = "bankaccount", targetNamespace = "")
        java.lang.String bankaccount,
        @WebParam(name = "clearingnumber", targetNamespace = "")
        java.lang.String clearingnumber,
        @WebParam(name = "accountholderdetails", targetNamespace = "")
        com.swifta.sub.mats.operation.provisioning.v1.Accountholderdetails accountholderdetails,
        @WebParam(name = "currencyid", targetNamespace = "")
        java.lang.String currencyid,
        @WebParam(name = "bankdomainnameid", targetNamespace = "")
        java.lang.String bankdomainnameid,
        @WebParam(name = "termscondition", targetNamespace = "")
        java.lang.String termscondition,
        @WebParam(name = "securityquestions", targetNamespace = "")
        java.util.List<com.swifta.sub.mats.operation.provisioning.v1.Securityquestions> securityquestions
    );

    @WebMethod(action = "addaccounttoexistinguser")
    @RequestWrapper(localName = "addaccounttoexistinguser", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Addaccounttoexistinguser")
    @ResponseWrapper(localName = "addaccounttoexistinguserResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddaccounttoexistinguserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Addaccounttoexistinguserrequestresponse addaccounttoexistinguser(
        @WebParam(name = "resourceid", targetNamespace = "")
        java.lang.String resourceid,
        @WebParam(name = "accounttype", targetNamespace = "")
        java.lang.String accounttype,
        @WebParam(name = "profileid", targetNamespace = "")
        java.lang.String profileid,
        @WebParam(name = "currency", targetNamespace = "")
        java.lang.String currency
    );

    @WebMethod(action = "suspendaccountholder")
    @RequestWrapper(localName = "suspendaccountholder", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Suspendaccountholder")
    @ResponseWrapper(localName = "suspendaccountholderResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SuspendaccountholderResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Suspendaccountholderrequestresponse suspendaccountholder(
        @WebParam(name = "resourceid", targetNamespace = "")
        java.lang.String resourceid,
        @WebParam(name = "confirmcredential", targetNamespace = "")
        java.lang.String confirmcredential
    );

    @WebMethod(action = "setdefaultaccount")
    @RequestWrapper(localName = "setdefaultaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Setdefaultaccount")
    @ResponseWrapper(localName = "setdefaultaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetdefaultaccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.SetDefaultaccountrequestresponse setdefaultaccount(
        @WebParam(name = "userresourceid", targetNamespace = "")
        java.lang.String userresourceid,
        @WebParam(name = "paraentaccountresourceid", targetNamespace = "")
        java.lang.String paraentaccountresourceid,
        @WebParam(name = "reason", targetNamespace = "")
        java.lang.String reason
    );

    @WebMethod(action = "addaccount")
    @RequestWrapper(localName = "addaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Addaccount")
    @ResponseWrapper(localName = "addaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddaccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Addaccountrequestresponse addaccount(
        @WebParam(name = "accounttype", targetNamespace = "")
        java.lang.String accounttype,
        @WebParam(name = "accountprofileid", targetNamespace = "")
        java.lang.String accountprofileid,
        @WebParam(name = "accountreferenceprofile", targetNamespace = "")
        java.lang.String accountreferenceprofile
    );

    @WebMethod(action = "setparentaccount")
    @RequestWrapper(localName = "setparentaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Setparentaccount")
    @ResponseWrapper(localName = "setparentaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.SetparentaccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Setparentrequestresponse setparentaccount(
        @WebParam(name = "userresourceid", targetNamespace = "")
        java.lang.String userresourceid,
        @WebParam(name = "paraentaccountresourceid", targetNamespace = "")
        java.lang.String paraentaccountresourceid,
        @WebParam(name = "reason", targetNamespace = "")
        java.lang.String reason
    );

    @WebMethod(action = "disconnectaccount")
    @RequestWrapper(localName = "disconnectaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Disconnectaccount")
    @ResponseWrapper(localName = "disconnectaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.DisconnectaccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Disconnectaccountrequestresponse disconnectaccount(
        @WebParam(name = "userresourceid", targetNamespace = "")
        java.lang.String userresourceid,
        @WebParam(name = "paraentaccountresourceid", targetNamespace = "")
        java.lang.String paraentaccountresourceid,
        @WebParam(name = "reason", targetNamespace = "")
        java.lang.String reason
    );

    @WebMethod(action = "addcustodyaccount")
    @RequestWrapper(localName = "addcustodyaccount", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Addcustodyaccount")
    @ResponseWrapper(localName = "addcustodyaccountResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AddcustodyaccountResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Addcustodyaccountrequestresponse addcustodyaccount(
        @WebParam(name = "currencycode", targetNamespace = "")
        java.lang.String currencycode,
        @WebParam(name = "bankcode", targetNamespace = "")
        java.lang.String bankcode,
        @WebParam(name = "accountnumber", targetNamespace = "")
        java.lang.String accountnumber,
        @WebParam(name = "accountname", targetNamespace = "")
        java.lang.String accountname,
        @WebParam(name = "bankdomain", targetNamespace = "")
        java.lang.String bankdomain
    );

    @WebMethod(action = "linkaccountrequest")
    @RequestWrapper(localName = "linkaccountrequest", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Linkaccountrequest")
    @ResponseWrapper(localName = "linkaccountrequestResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.LinkaccountrequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Linkaccountresponse linkaccountrequest(
        @WebParam(name = "userresourceid", targetNamespace = "")
        java.lang.String userresourceid,
        @WebParam(name = "profileid", targetNamespace = "")
        java.lang.String profileid,
        @WebParam(name = "paraentaccountresourceid", targetNamespace = "")
        java.lang.String paraentaccountresourceid,
        @WebParam(name = "reason", targetNamespace = "")
        java.lang.String reason
    );

    @WebMethod(action = "getProfileofUser")
    @RequestWrapper(localName = "getProfileofUser", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.GetProfileofUser")
    @ResponseWrapper(localName = "getProfileofUserResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.GetProfileofUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Getuserprofileresponse getProfileofUser(
        @WebParam(name = "resourceid", targetNamespace = "")
        java.lang.String resourceid
    );

    @WebMethod(action = "authenticate")
    @RequestWrapper(localName = "authenticate", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Authenticate")
    @ResponseWrapper(localName = "authenticateResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.AuthenticateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Authenticationresponse authenticate(
        @WebParam(name = "resourceid", targetNamespace = "")
        java.lang.String resourceid,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password
    );

    @WebMethod(action = "activationrequest")
    @RequestWrapper(localName = "activationrequest", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.Activationrequest")
    @ResponseWrapper(localName = "activationrequestResponse", targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", className = "com.swifta.sub.mats.operation.provisioning.v1.ActivationrequestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.swifta.sub.mats.operation.provisioning.v1.Activationresponse activationrequest(
        @WebParam(name = "resourceid", targetNamespace = "")
        java.lang.String resourceid,
        @WebParam(name = "credential", targetNamespace = "")
        com.swifta.sub.mats.operation.provisioning.v1.Credentials credential,
        @WebParam(name = "securityquestionanswer", targetNamespace = "")
        java.lang.String securityquestionanswer,
        @WebParam(name = "identificationno", targetNamespace = "")
        java.lang.String identificationno,
        @WebParam(name = "bankdomainid", targetNamespace = "")
        java.lang.String bankdomainid,
        @WebParam(name = "currency", targetNamespace = "")
        java.lang.String currency
    );
}
