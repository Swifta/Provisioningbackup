package com.swifta.sub.mats.operation.provisioning.v1_0;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-11-10T13:20:46.468+01:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "provisioning", 
                  wsdlLocation = "/Users/user/Downloads/Provisioning-1.wsdl",
                  targetNamespace = "http://swifta.com/sub/mats/operation/provisioning/v1.0") 
public class Provisioning_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "provisioning");
    public final static QName ProvisioningPort = new QName("http://swifta.com/sub/mats/operation/provisioning/v1.0", "ProvisioningPort");
    static {
        URL url = Provisioning_Service.class.getResource("/Users/user/Downloads/Provisioning-1.wsdl");
        if (url == null) {
            url = Provisioning_Service.class.getClassLoader().getResource("/Users/user/Downloads/Provisioning-1.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(Provisioning_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/Users/user/Downloads/Provisioning-1.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public Provisioning_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Provisioning_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Provisioning_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Provisioning_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Provisioning_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Provisioning_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns Provisioning
     */
    @WebEndpoint(name = "ProvisioningPort")
    public Provisioning getProvisioningPort() {
        return super.getPort(ProvisioningPort, Provisioning.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Provisioning
     */
    @WebEndpoint(name = "ProvisioningPort")
    public Provisioning getProvisioningPort(WebServiceFeature... features) {
        return super.getPort(ProvisioningPort, Provisioning.class, features);
    }

}
