
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credential" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}credentials" minOccurs="0"/>
 *         &lt;element name="securityquestionanswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificationno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankdomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activation", propOrder = {
    "resourceid",
    "credential",
    "securityquestionanswer",
    "identificationno",
    "bankdomain",
    "currency"
})
public class Activation {

    protected String resourceid;
    protected Credentials credential;
    protected String securityquestionanswer;
    protected String identificationno;
    protected String bankdomain;
    protected String currency;

    /**
     * Gets the value of the resourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceid() {
        return resourceid;
    }

    /**
     * Sets the value of the resourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceid(String value) {
        this.resourceid = value;
    }

    /**
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredential(Credentials value) {
        this.credential = value;
    }

    /**
     * Gets the value of the securityquestionanswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityquestionanswer() {
        return securityquestionanswer;
    }

    /**
     * Sets the value of the securityquestionanswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityquestionanswer(String value) {
        this.securityquestionanswer = value;
    }

    /**
     * Gets the value of the identificationno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationno() {
        return identificationno;
    }

    /**
     * Sets the value of the identificationno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationno(String value) {
        this.identificationno = value;
    }

    /**
     * Gets the value of the bankdomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankdomain() {
        return bankdomain;
    }

    /**
     * Sets the value of the bankdomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankdomain(String value) {
        this.bankdomain = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
