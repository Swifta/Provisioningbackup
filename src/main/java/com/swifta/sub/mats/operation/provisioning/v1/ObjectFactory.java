
package com.swifta.sub.mats.operation.provisioning.v1;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.swifta.sub.mats.operation.provisioning.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SuspendaccountholderResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "suspendaccountholderResponse");
    private final static QName _Setupservicefeesandcommission_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "setupservicefeesandcommission");
    private final static QName _AddaccounttoexistinguserResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "addaccounttoexistinguserResponse");
    private final static QName _RegistrationResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "registrationResponse");
    private final static QName _Registration_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "registration");
    private final static QName _Setdefaultaccount_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "setdefaultaccount");
    private final static QName _Suspendaccountholder_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "suspendaccountholder");
    private final static QName _Addaccount_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "addaccount");
    private final static QName _Setparentaccount_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "setparentaccount");
    private final static QName _ActivationrequestResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "activationrequestResponse");
    private final static QName _Disconnectaccount_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "disconnectaccount");
    private final static QName _Addcustodyaccount_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "addcustodyaccount");
    private final static QName _AuthenticateResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "authenticateResponse");
    private final static QName _GetProfileofUser_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "getProfileofUser");
    private final static QName _LinkaccountrequestResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "linkaccountrequestResponse");
    private final static QName _IsProfileauthorisedResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "isProfileauthorisedResponse");
    private final static QName _SetparentaccountResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "setparentaccountResponse");
    private final static QName _Activationrequest_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "activationrequest");
    private final static QName _AddcustodyaccountResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "addcustodyaccountResponse");
    private final static QName _DisconnectaccountResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "disconnectaccountResponse");
    private final static QName _IsProfileauthorised_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "isProfileauthorised");
    private final static QName _GetProfileofUserResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "getProfileofUserResponse");
    private final static QName _Addaccounttoexistinguser_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "addaccounttoexistinguser");
    private final static QName _SetupservicefeesandcommissionResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "setupservicefeesandcommissionResponse");
    private final static QName _SetdefaultaccountResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "setdefaultaccountResponse");
    private final static QName _AddaccountResponse_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "addaccountResponse");
    private final static QName _Linkaccountrequest_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "linkaccountrequest");
    private final static QName _Authenticate_QNAME = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "authenticate");
    private final static QName _AddaccounttoexistinguserrequestresponseStatuscode_QNAME = new QName("", "statuscode");
    private final static QName _AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME = new QName("", "extensionparameters");
    private final static QName _AddaccounttoexistinguserrequestresponseAccountnumber_QNAME = new QName("", "accountnumber");
    private final static QName _SetDefaultaccountrequestresponseResponsemessage_QNAME = new QName("", "responsemessage");
    private final static QName _ServiceFeesTransactiontypeid_QNAME = new QName("", "transactiontypeid");
    private final static QName _ServiceFeesMaximumamount_QNAME = new QName("", "maximumamount");
    private final static QName _ServiceFeesServicefee_QNAME = new QName("", "servicefee");
    private final static QName _ServiceFeesServicefeetype_QNAME = new QName("", "servicefeetype");
    private final static QName _ServiceFeesMinimumamount_QNAME = new QName("", "minimumamount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.swifta.sub.mats.operation.provisioning.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link Linkaccountrequest }
     * 
     */
    public Linkaccountrequest createLinkaccountrequest() {
        return new Linkaccountrequest();
    }

    /**
     * Create an instance of {@link AddaccountResponse }
     * 
     */
    public AddaccountResponse createAddaccountResponse() {
        return new AddaccountResponse();
    }

    /**
     * Create an instance of {@link SetdefaultaccountResponse }
     * 
     */
    public SetdefaultaccountResponse createSetdefaultaccountResponse() {
        return new SetdefaultaccountResponse();
    }

    /**
     * Create an instance of {@link SetupservicefeesandcommissionResponse }
     * 
     */
    public SetupservicefeesandcommissionResponse createSetupservicefeesandcommissionResponse() {
        return new SetupservicefeesandcommissionResponse();
    }

    /**
     * Create an instance of {@link Addaccounttoexistinguser }
     * 
     */
    public Addaccounttoexistinguser createAddaccounttoexistinguser() {
        return new Addaccounttoexistinguser();
    }

    /**
     * Create an instance of {@link GetProfileofUserResponse }
     * 
     */
    public GetProfileofUserResponse createGetProfileofUserResponse() {
        return new GetProfileofUserResponse();
    }

    /**
     * Create an instance of {@link IsProfileauthorised }
     * 
     */
    public IsProfileauthorised createIsProfileauthorised() {
        return new IsProfileauthorised();
    }

    /**
     * Create an instance of {@link DisconnectaccountResponse }
     * 
     */
    public DisconnectaccountResponse createDisconnectaccountResponse() {
        return new DisconnectaccountResponse();
    }

    /**
     * Create an instance of {@link AddcustodyaccountResponse }
     * 
     */
    public AddcustodyaccountResponse createAddcustodyaccountResponse() {
        return new AddcustodyaccountResponse();
    }

    /**
     * Create an instance of {@link Activationrequest }
     * 
     */
    public Activationrequest createActivationrequest() {
        return new Activationrequest();
    }

    /**
     * Create an instance of {@link IsProfileauthorisedResponse }
     * 
     */
    public IsProfileauthorisedResponse createIsProfileauthorisedResponse() {
        return new IsProfileauthorisedResponse();
    }

    /**
     * Create an instance of {@link SetparentaccountResponse }
     * 
     */
    public SetparentaccountResponse createSetparentaccountResponse() {
        return new SetparentaccountResponse();
    }

    /**
     * Create an instance of {@link GetProfileofUser }
     * 
     */
    public GetProfileofUser createGetProfileofUser() {
        return new GetProfileofUser();
    }

    /**
     * Create an instance of {@link LinkaccountrequestResponse }
     * 
     */
    public LinkaccountrequestResponse createLinkaccountrequestResponse() {
        return new LinkaccountrequestResponse();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link Addcustodyaccount }
     * 
     */
    public Addcustodyaccount createAddcustodyaccount() {
        return new Addcustodyaccount();
    }

    /**
     * Create an instance of {@link Disconnectaccount }
     * 
     */
    public Disconnectaccount createDisconnectaccount() {
        return new Disconnectaccount();
    }

    /**
     * Create an instance of {@link ActivationrequestResponse }
     * 
     */
    public ActivationrequestResponse createActivationrequestResponse() {
        return new ActivationrequestResponse();
    }

    /**
     * Create an instance of {@link Setparentaccount }
     * 
     */
    public Setparentaccount createSetparentaccount() {
        return new Setparentaccount();
    }

    /**
     * Create an instance of {@link Addaccount }
     * 
     */
    public Addaccount createAddaccount() {
        return new Addaccount();
    }

    /**
     * Create an instance of {@link Setdefaultaccount }
     * 
     */
    public Setdefaultaccount createSetdefaultaccount() {
        return new Setdefaultaccount();
    }

    /**
     * Create an instance of {@link Suspendaccountholder }
     * 
     */
    public Suspendaccountholder createSuspendaccountholder() {
        return new Suspendaccountholder();
    }

    /**
     * Create an instance of {@link Registration }
     * 
     */
    public Registration createRegistration() {
        return new Registration();
    }

    /**
     * Create an instance of {@link AddaccounttoexistinguserResponse }
     * 
     */
    public AddaccounttoexistinguserResponse createAddaccounttoexistinguserResponse() {
        return new AddaccounttoexistinguserResponse();
    }

    /**
     * Create an instance of {@link RegistrationResponse }
     * 
     */
    public RegistrationResponse createRegistrationResponse() {
        return new RegistrationResponse();
    }

    /**
     * Create an instance of {@link Setupservicefeesandcommission }
     * 
     */
    public Setupservicefeesandcommission createSetupservicefeesandcommission() {
        return new Setupservicefeesandcommission();
    }

    /**
     * Create an instance of {@link SuspendaccountholderResponse }
     * 
     */
    public SuspendaccountholderResponse createSuspendaccountholderResponse() {
        return new SuspendaccountholderResponse();
    }

    /**
     * Create an instance of {@link Setparentrequestresponse }
     * 
     */
    public Setparentrequestresponse createSetparentrequestresponse() {
        return new Setparentrequestresponse();
    }

    /**
     * Create an instance of {@link ServiceFees }
     * 
     */
    public ServiceFees createServiceFees() {
        return new ServiceFees();
    }

    /**
     * Create an instance of {@link Identification }
     * 
     */
    public Identification createIdentification() {
        return new Identification();
    }

    /**
     * Create an instance of {@link Getuserprofileresponse }
     * 
     */
    public Getuserprofileresponse createGetuserprofileresponse() {
        return new Getuserprofileresponse();
    }

    /**
     * Create an instance of {@link Linkaccountresponse }
     * 
     */
    public Linkaccountresponse createLinkaccountresponse() {
        return new Linkaccountresponse();
    }

    /**
     * Create an instance of {@link Servicefeeandcomissionrequestresponse }
     * 
     */
    public Servicefeeandcomissionrequestresponse createServicefeeandcomissionrequestresponse() {
        return new Servicefeeandcomissionrequestresponse();
    }

    /**
     * Create an instance of {@link Registrationrequestresponse }
     * 
     */
    public Registrationrequestresponse createRegistrationrequestresponse() {
        return new Registrationrequestresponse();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link SetDefaultaccountrequestresponse }
     * 
     */
    public SetDefaultaccountrequestresponse createSetDefaultaccountrequestresponse() {
        return new SetDefaultaccountrequestresponse();
    }

    /**
     * Create an instance of {@link Authenticationresponse }
     * 
     */
    public Authenticationresponse createAuthenticationresponse() {
        return new Authenticationresponse();
    }

    /**
     * Create an instance of {@link Accountholderdetails }
     * 
     */
    public Accountholderdetails createAccountholderdetails() {
        return new Accountholderdetails();
    }

    /**
     * Create an instance of {@link ParameterExtension }
     * 
     */
    public ParameterExtension createParameterExtension() {
        return new ParameterExtension();
    }

    /**
     * Create an instance of {@link SecondaryContactInfo }
     * 
     */
    public SecondaryContactInfo createSecondaryContactInfo() {
        return new SecondaryContactInfo();
    }

    /**
     * Create an instance of {@link Addcustodyaccountrequestresponse }
     * 
     */
    public Addcustodyaccountrequestresponse createAddcustodyaccountrequestresponse() {
        return new Addcustodyaccountrequestresponse();
    }

    /**
     * Create an instance of {@link Isprofileathresponse }
     * 
     */
    public Isprofileathresponse createIsprofileathresponse() {
        return new Isprofileathresponse();
    }

    /**
     * Create an instance of {@link Disconnectaccountrequestresponse }
     * 
     */
    public Disconnectaccountrequestresponse createDisconnectaccountrequestresponse() {
        return new Disconnectaccountrequestresponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Activationresponse }
     * 
     */
    public Activationresponse createActivationresponse() {
        return new Activationresponse();
    }

    /**
     * Create an instance of {@link Addaccountrequestresponse }
     * 
     */
    public Addaccountrequestresponse createAddaccountrequestresponse() {
        return new Addaccountrequestresponse();
    }

    /**
     * Create an instance of {@link Securityquestions }
     * 
     */
    public Securityquestions createSecurityquestions() {
        return new Securityquestions();
    }

    /**
     * Create an instance of {@link PrimaryContactInfo }
     * 
     */
    public PrimaryContactInfo createPrimaryContactInfo() {
        return new PrimaryContactInfo();
    }

    /**
     * Create an instance of {@link Suspendaccountholderrequestresponse }
     * 
     */
    public Suspendaccountholderrequestresponse createSuspendaccountholderrequestresponse() {
        return new Suspendaccountholderrequestresponse();
    }

    /**
     * Create an instance of {@link Addaccounttoexistinguserrequestresponse }
     * 
     */
    public Addaccounttoexistinguserrequestresponse createAddaccounttoexistinguserrequestresponse() {
        return new Addaccounttoexistinguserrequestresponse();
    }

    /**
     * Create an instance of {@link ServiceCommission }
     * 
     */
    public ServiceCommission createServiceCommission() {
        return new ServiceCommission();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuspendaccountholderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "suspendaccountholderResponse")
    public JAXBElement<SuspendaccountholderResponse> createSuspendaccountholderResponse(SuspendaccountholderResponse value) {
        return new JAXBElement<SuspendaccountholderResponse>(_SuspendaccountholderResponse_QNAME, SuspendaccountholderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Setupservicefeesandcommission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "setupservicefeesandcommission")
    public JAXBElement<Setupservicefeesandcommission> createSetupservicefeesandcommission(Setupservicefeesandcommission value) {
        return new JAXBElement<Setupservicefeesandcommission>(_Setupservicefeesandcommission_QNAME, Setupservicefeesandcommission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddaccounttoexistinguserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "addaccounttoexistinguserResponse")
    public JAXBElement<AddaccounttoexistinguserResponse> createAddaccounttoexistinguserResponse(AddaccounttoexistinguserResponse value) {
        return new JAXBElement<AddaccounttoexistinguserResponse>(_AddaccounttoexistinguserResponse_QNAME, AddaccounttoexistinguserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "registrationResponse")
    public JAXBElement<RegistrationResponse> createRegistrationResponse(RegistrationResponse value) {
        return new JAXBElement<RegistrationResponse>(_RegistrationResponse_QNAME, RegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "registration")
    public JAXBElement<Registration> createRegistration(Registration value) {
        return new JAXBElement<Registration>(_Registration_QNAME, Registration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Setdefaultaccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "setdefaultaccount")
    public JAXBElement<Setdefaultaccount> createSetdefaultaccount(Setdefaultaccount value) {
        return new JAXBElement<Setdefaultaccount>(_Setdefaultaccount_QNAME, Setdefaultaccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suspendaccountholder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "suspendaccountholder")
    public JAXBElement<Suspendaccountholder> createSuspendaccountholder(Suspendaccountholder value) {
        return new JAXBElement<Suspendaccountholder>(_Suspendaccountholder_QNAME, Suspendaccountholder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addaccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "addaccount")
    public JAXBElement<Addaccount> createAddaccount(Addaccount value) {
        return new JAXBElement<Addaccount>(_Addaccount_QNAME, Addaccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Setparentaccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "setparentaccount")
    public JAXBElement<Setparentaccount> createSetparentaccount(Setparentaccount value) {
        return new JAXBElement<Setparentaccount>(_Setparentaccount_QNAME, Setparentaccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivationrequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "activationrequestResponse")
    public JAXBElement<ActivationrequestResponse> createActivationrequestResponse(ActivationrequestResponse value) {
        return new JAXBElement<ActivationrequestResponse>(_ActivationrequestResponse_QNAME, ActivationrequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Disconnectaccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "disconnectaccount")
    public JAXBElement<Disconnectaccount> createDisconnectaccount(Disconnectaccount value) {
        return new JAXBElement<Disconnectaccount>(_Disconnectaccount_QNAME, Disconnectaccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addcustodyaccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "addcustodyaccount")
    public JAXBElement<Addcustodyaccount> createAddcustodyaccount(Addcustodyaccount value) {
        return new JAXBElement<Addcustodyaccount>(_Addcustodyaccount_QNAME, Addcustodyaccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "authenticateResponse")
    public JAXBElement<AuthenticateResponse> createAuthenticateResponse(AuthenticateResponse value) {
        return new JAXBElement<AuthenticateResponse>(_AuthenticateResponse_QNAME, AuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfileofUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "getProfileofUser")
    public JAXBElement<GetProfileofUser> createGetProfileofUser(GetProfileofUser value) {
        return new JAXBElement<GetProfileofUser>(_GetProfileofUser_QNAME, GetProfileofUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkaccountrequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "linkaccountrequestResponse")
    public JAXBElement<LinkaccountrequestResponse> createLinkaccountrequestResponse(LinkaccountrequestResponse value) {
        return new JAXBElement<LinkaccountrequestResponse>(_LinkaccountrequestResponse_QNAME, LinkaccountrequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsProfileauthorisedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "isProfileauthorisedResponse")
    public JAXBElement<IsProfileauthorisedResponse> createIsProfileauthorisedResponse(IsProfileauthorisedResponse value) {
        return new JAXBElement<IsProfileauthorisedResponse>(_IsProfileauthorisedResponse_QNAME, IsProfileauthorisedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetparentaccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "setparentaccountResponse")
    public JAXBElement<SetparentaccountResponse> createSetparentaccountResponse(SetparentaccountResponse value) {
        return new JAXBElement<SetparentaccountResponse>(_SetparentaccountResponse_QNAME, SetparentaccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activationrequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "activationrequest")
    public JAXBElement<Activationrequest> createActivationrequest(Activationrequest value) {
        return new JAXBElement<Activationrequest>(_Activationrequest_QNAME, Activationrequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddcustodyaccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "addcustodyaccountResponse")
    public JAXBElement<AddcustodyaccountResponse> createAddcustodyaccountResponse(AddcustodyaccountResponse value) {
        return new JAXBElement<AddcustodyaccountResponse>(_AddcustodyaccountResponse_QNAME, AddcustodyaccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisconnectaccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "disconnectaccountResponse")
    public JAXBElement<DisconnectaccountResponse> createDisconnectaccountResponse(DisconnectaccountResponse value) {
        return new JAXBElement<DisconnectaccountResponse>(_DisconnectaccountResponse_QNAME, DisconnectaccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsProfileauthorised }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "isProfileauthorised")
    public JAXBElement<IsProfileauthorised> createIsProfileauthorised(IsProfileauthorised value) {
        return new JAXBElement<IsProfileauthorised>(_IsProfileauthorised_QNAME, IsProfileauthorised.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfileofUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "getProfileofUserResponse")
    public JAXBElement<GetProfileofUserResponse> createGetProfileofUserResponse(GetProfileofUserResponse value) {
        return new JAXBElement<GetProfileofUserResponse>(_GetProfileofUserResponse_QNAME, GetProfileofUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addaccounttoexistinguser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "addaccounttoexistinguser")
    public JAXBElement<Addaccounttoexistinguser> createAddaccounttoexistinguser(Addaccounttoexistinguser value) {
        return new JAXBElement<Addaccounttoexistinguser>(_Addaccounttoexistinguser_QNAME, Addaccounttoexistinguser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetupservicefeesandcommissionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "setupservicefeesandcommissionResponse")
    public JAXBElement<SetupservicefeesandcommissionResponse> createSetupservicefeesandcommissionResponse(SetupservicefeesandcommissionResponse value) {
        return new JAXBElement<SetupservicefeesandcommissionResponse>(_SetupservicefeesandcommissionResponse_QNAME, SetupservicefeesandcommissionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetdefaultaccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "setdefaultaccountResponse")
    public JAXBElement<SetdefaultaccountResponse> createSetdefaultaccountResponse(SetdefaultaccountResponse value) {
        return new JAXBElement<SetdefaultaccountResponse>(_SetdefaultaccountResponse_QNAME, SetdefaultaccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddaccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "addaccountResponse")
    public JAXBElement<AddaccountResponse> createAddaccountResponse(AddaccountResponse value) {
        return new JAXBElement<AddaccountResponse>(_AddaccountResponse_QNAME, AddaccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Linkaccountrequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "linkaccountrequest")
    public JAXBElement<Linkaccountrequest> createLinkaccountrequest(Linkaccountrequest value) {
        return new JAXBElement<Linkaccountrequest>(_Linkaccountrequest_QNAME, Linkaccountrequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0", name = "authenticate")
    public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
        return new JAXBElement<Authenticate>(_Authenticate_QNAME, Authenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Addaccounttoexistinguserrequestresponse.class)
    public JAXBElement<StatusCode> createAddaccounttoexistinguserrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Addaccounttoexistinguserrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Addaccounttoexistinguserrequestresponse.class)
    public JAXBElement<ParameterExtension> createAddaccounttoexistinguserrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Addaccounttoexistinguserrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountnumber", scope = Addaccounttoexistinguserrequestresponse.class)
    public JAXBElement<String> createAddaccounttoexistinguserrequestresponseAccountnumber(String value) {
        return new JAXBElement<String>(_AddaccounttoexistinguserrequestresponseAccountnumber_QNAME, String.class, Addaccounttoexistinguserrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = SetDefaultaccountrequestresponse.class)
    public JAXBElement<StatusCode> createSetDefaultaccountrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, SetDefaultaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = SetDefaultaccountrequestresponse.class)
    public JAXBElement<ParameterExtension> createSetDefaultaccountrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, SetDefaultaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responsemessage", scope = SetDefaultaccountrequestresponse.class)
    public JAXBElement<String> createSetDefaultaccountrequestresponseResponsemessage(String value) {
        return new JAXBElement<String>(_SetDefaultaccountrequestresponseResponsemessage_QNAME, String.class, SetDefaultaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Servicefeeandcomissionrequestresponse.class)
    public JAXBElement<StatusCode> createServicefeeandcomissionrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Servicefeeandcomissionrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Servicefeeandcomissionrequestresponse.class)
    public JAXBElement<ParameterExtension> createServicefeeandcomissionrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Servicefeeandcomissionrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responsemessage", scope = Servicefeeandcomissionrequestresponse.class)
    public JAXBElement<String> createServicefeeandcomissionrequestresponseResponsemessage(String value) {
        return new JAXBElement<String>(_SetDefaultaccountrequestresponseResponsemessage_QNAME, String.class, Servicefeeandcomissionrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Disconnectaccountrequestresponse.class)
    public JAXBElement<StatusCode> createDisconnectaccountrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Disconnectaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Disconnectaccountrequestresponse.class)
    public JAXBElement<ParameterExtension> createDisconnectaccountrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Disconnectaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responsemessage", scope = Disconnectaccountrequestresponse.class)
    public JAXBElement<String> createDisconnectaccountrequestresponseResponsemessage(String value) {
        return new JAXBElement<String>(_SetDefaultaccountrequestresponseResponsemessage_QNAME, String.class, Disconnectaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Suspendaccountholderrequestresponse.class)
    public JAXBElement<StatusCode> createSuspendaccountholderrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Suspendaccountholderrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Suspendaccountholderrequestresponse.class)
    public JAXBElement<ParameterExtension> createSuspendaccountholderrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Suspendaccountholderrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responsemessage", scope = Suspendaccountholderrequestresponse.class)
    public JAXBElement<String> createSuspendaccountholderrequestresponseResponsemessage(String value) {
        return new JAXBElement<String>(_SetDefaultaccountrequestresponseResponsemessage_QNAME, String.class, Suspendaccountholderrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "transactiontypeid", scope = ServiceFees.class)
    public JAXBElement<Integer> createServiceFeesTransactiontypeid(Integer value) {
        return new JAXBElement<Integer>(_ServiceFeesTransactiontypeid_QNAME, Integer.class, ServiceFees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "maximumamount", scope = ServiceFees.class)
    public JAXBElement<BigDecimal> createServiceFeesMaximumamount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ServiceFeesMaximumamount_QNAME, BigDecimal.class, ServiceFees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "servicefee", scope = ServiceFees.class)
    public JAXBElement<BigDecimal> createServiceFeesServicefee(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ServiceFeesServicefee_QNAME, BigDecimal.class, ServiceFees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFeematrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "servicefeetype", scope = ServiceFees.class)
    public JAXBElement<ServiceFeematrix> createServiceFeesServicefeetype(ServiceFeematrix value) {
        return new JAXBElement<ServiceFeematrix>(_ServiceFeesServicefeetype_QNAME, ServiceFeematrix.class, ServiceFees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "minimumamount", scope = ServiceFees.class)
    public JAXBElement<BigDecimal> createServiceFeesMinimumamount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ServiceFeesMinimumamount_QNAME, BigDecimal.class, ServiceFees.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Addcustodyaccountrequestresponse.class)
    public JAXBElement<StatusCode> createAddcustodyaccountrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Addcustodyaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Addcustodyaccountrequestresponse.class)
    public JAXBElement<ParameterExtension> createAddcustodyaccountrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Addcustodyaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountnumber", scope = Addcustodyaccountrequestresponse.class)
    public JAXBElement<String> createAddcustodyaccountrequestresponseAccountnumber(String value) {
        return new JAXBElement<String>(_AddaccounttoexistinguserrequestresponseAccountnumber_QNAME, String.class, Addcustodyaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Addaccountrequestresponse.class)
    public JAXBElement<StatusCode> createAddaccountrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Addaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Addaccountrequestresponse.class)
    public JAXBElement<ParameterExtension> createAddaccountrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Addaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "accountnumber", scope = Addaccountrequestresponse.class)
    public JAXBElement<String> createAddaccountrequestresponseAccountnumber(String value) {
        return new JAXBElement<String>(_AddaccounttoexistinguserrequestresponseAccountnumber_QNAME, String.class, Addaccountrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Registrationrequestresponse.class)
    public JAXBElement<StatusCode> createRegistrationrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Registrationrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Registrationrequestresponse.class)
    public JAXBElement<ParameterExtension> createRegistrationrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Registrationrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responsemessage", scope = Registrationrequestresponse.class)
    public JAXBElement<String> createRegistrationrequestresponseResponsemessage(String value) {
        return new JAXBElement<String>(_SetDefaultaccountrequestresponseResponsemessage_QNAME, String.class, Registrationrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Linkaccountresponse.class)
    public JAXBElement<StatusCode> createLinkaccountresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Linkaccountresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Linkaccountresponse.class)
    public JAXBElement<ParameterExtension> createLinkaccountresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Linkaccountresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responsemessage", scope = Linkaccountresponse.class)
    public JAXBElement<String> createLinkaccountresponseResponsemessage(String value) {
        return new JAXBElement<String>(_SetDefaultaccountrequestresponseResponsemessage_QNAME, String.class, Linkaccountresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statuscode", scope = Setparentrequestresponse.class)
    public JAXBElement<StatusCode> createSetparentrequestresponseStatuscode(StatusCode value) {
        return new JAXBElement<StatusCode>(_AddaccounttoexistinguserrequestresponseStatuscode_QNAME, StatusCode.class, Setparentrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterExtension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extensionparameters", scope = Setparentrequestresponse.class)
    public JAXBElement<ParameterExtension> createSetparentrequestresponseExtensionparameters(ParameterExtension value) {
        return new JAXBElement<ParameterExtension>(_AddaccounttoexistinguserrequestresponseExtensionparameters_QNAME, ParameterExtension.class, Setparentrequestresponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "responsemessage", scope = Setparentrequestresponse.class)
    public JAXBElement<String> createSetparentrequestresponseResponsemessage(String value) {
        return new JAXBElement<String>(_SetDefaultaccountrequestresponseResponsemessage_QNAME, String.class, Setparentrequestresponse.class, value);
    }

}
