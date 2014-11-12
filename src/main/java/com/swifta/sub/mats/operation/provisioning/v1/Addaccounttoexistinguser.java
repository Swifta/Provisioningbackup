
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addaccounttoexistinguser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addaccounttoexistinguser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accounttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "addaccounttoexistinguser", propOrder = {
    "resourceid",
    "accounttype",
    "profileid",
    "currency"
})
public class Addaccounttoexistinguser {

    protected String resourceid;
    protected String accounttype;
    protected String profileid;
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
     * Gets the value of the accounttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccounttype() {
        return accounttype;
    }

    /**
     * Sets the value of the accounttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccounttype(String value) {
        this.accounttype = value;
    }

    /**
     * Gets the value of the profileid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileid() {
        return profileid;
    }

    /**
     * Sets the value of the profileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileid(String value) {
        this.profileid = value;
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
