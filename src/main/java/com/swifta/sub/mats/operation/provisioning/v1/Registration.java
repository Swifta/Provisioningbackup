
package com.swifta.sub.mats.operation.provisioning.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bankcodeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bankaccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearingnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountholderdetails" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}accountholderdetails" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankdomainname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termscondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="securityquestions" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}securityquestions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registration", propOrder = {
    "username",
    "msisdn",
    "email",
    "profileid",
    "bankcodeid",
    "bankaccount",
    "clearingnumber",
    "accountholderdetails",
    "currency",
    "bankdomainname",
    "termscondition",
    "securityquestions"
})
public class Registration {

    protected String username;
    protected String msisdn;
    protected String email;
    protected int profileid;
    protected int bankcodeid;
    protected String bankaccount;
    protected String clearingnumber;
    protected Accountholderdetails accountholderdetails;
    protected String currency;
    protected String bankdomainname;
    protected String termscondition;
    protected List<Securityquestions> securityquestions;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the profileid property.
     * 
     */
    public int getProfileid() {
        return profileid;
    }

    /**
     * Sets the value of the profileid property.
     * 
     */
    public void setProfileid(int value) {
        this.profileid = value;
    }

    /**
     * Gets the value of the bankcodeid property.
     * 
     */
    public int getBankcodeid() {
        return bankcodeid;
    }

    /**
     * Sets the value of the bankcodeid property.
     * 
     */
    public void setBankcodeid(int value) {
        this.bankcodeid = value;
    }

    /**
     * Gets the value of the bankaccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
     * Sets the value of the bankaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankaccount(String value) {
        this.bankaccount = value;
    }

    /**
     * Gets the value of the clearingnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingnumber() {
        return clearingnumber;
    }

    /**
     * Sets the value of the clearingnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingnumber(String value) {
        this.clearingnumber = value;
    }

    /**
     * Gets the value of the accountholderdetails property.
     * 
     * @return
     *     possible object is
     *     {@link Accountholderdetails }
     *     
     */
    public Accountholderdetails getAccountholderdetails() {
        return accountholderdetails;
    }

    /**
     * Sets the value of the accountholderdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accountholderdetails }
     *     
     */
    public void setAccountholderdetails(Accountholderdetails value) {
        this.accountholderdetails = value;
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

    /**
     * Gets the value of the bankdomainname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankdomainname() {
        return bankdomainname;
    }

    /**
     * Sets the value of the bankdomainname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankdomainname(String value) {
        this.bankdomainname = value;
    }

    /**
     * Gets the value of the termscondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermscondition() {
        return termscondition;
    }

    /**
     * Sets the value of the termscondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermscondition(String value) {
        this.termscondition = value;
    }

    /**
     * Gets the value of the securityquestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityquestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityquestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Securityquestions }
     * 
     * 
     */
    public List<Securityquestions> getSecurityquestions() {
        if (securityquestions == null) {
            securityquestions = new ArrayList<Securityquestions>();
        }
        return this.securityquestions;
    }

}
