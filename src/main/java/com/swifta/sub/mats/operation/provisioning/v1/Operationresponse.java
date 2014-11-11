
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operationresponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responsemessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statuscode" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}statusCode" minOccurs="0"/>
 *         &lt;element name="parameterextension" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}parameterExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationresponse", propOrder = {
    "responsemessage",
    "statuscode",
    "parameterextension"
})
@XmlSeeAlso({
    Setparentrequestresponse.class,
    Getuserprofileresponse.class,
    Linkaccountresponse.class,
    Registrationrequestresponse.class,
    Activationrequestresponse.class,
    Addcustodyaccountrequestresponse.class,
    Disconnectaccountrequestresponse.class,
    Addaccountrequestresponse.class,
    Suspendaccountholderrequestresponse.class,
    SetDefaultaccountrequestresponse.class,
    Authenticationresponse.class,
    Isprofileathresponse.class,
    Addaccounttoexistinguserrequestresponse.class
})
public abstract class Operationresponse {

    protected String responsemessage;
    @XmlSchemaType(name = "string")
    protected StatusCode statuscode;
    protected ParameterExtension parameterextension;

    /**
     * Gets the value of the responsemessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsemessage() {
        return responsemessage;
    }

    /**
     * Sets the value of the responsemessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsemessage(String value) {
        this.responsemessage = value;
    }

    /**
     * Gets the value of the statuscode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatuscode() {
        return statuscode;
    }

    /**
     * Sets the value of the statuscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatuscode(StatusCode value) {
        this.statuscode = value;
    }

    /**
     * Gets the value of the parameterextension property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterExtension }
     *     
     */
    public ParameterExtension getParameterextension() {
        return parameterextension;
    }

    /**
     * Sets the value of the parameterextension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterExtension }
     *     
     */
    public void setParameterextension(ParameterExtension value) {
        this.parameterextension = value;
    }

}
