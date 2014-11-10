
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connectaccountrequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="connectaccountrequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paraentaccountresourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "connectaccountrequest", propOrder = {
    "userresourceid",
    "profileid",
    "paraentaccountresourceid",
    "reason"
})
public class Connectaccountrequest {

    protected String userresourceid;
    protected String profileid;
    protected String paraentaccountresourceid;
    protected String reason;

    /**
     * Gets the value of the userresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserresourceid() {
        return userresourceid;
    }

    /**
     * Sets the value of the userresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserresourceid(String value) {
        this.userresourceid = value;
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
     * Gets the value of the paraentaccountresourceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaentaccountresourceid() {
        return paraentaccountresourceid;
    }

    /**
     * Sets the value of the paraentaccountresourceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaentaccountresourceid(String value) {
        this.paraentaccountresourceid = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
