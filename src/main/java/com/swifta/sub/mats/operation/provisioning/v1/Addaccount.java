
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addaccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addaccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accounttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountprofileid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountreferenceprofile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addaccount", propOrder = {
    "accounttype",
    "accountprofileid",
    "accountreferenceprofile"
})
public class Addaccount {

    protected String accounttype;
    protected String accountprofileid;
    protected String accountreferenceprofile;

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
     * Gets the value of the accountprofileid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountprofileid() {
        return accountprofileid;
    }

    /**
     * Sets the value of the accountprofileid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountprofileid(String value) {
        this.accountprofileid = value;
    }

    /**
     * Gets the value of the accountreferenceprofile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountreferenceprofile() {
        return accountreferenceprofile;
    }

    /**
     * Sets the value of the accountreferenceprofile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountreferenceprofile(String value) {
        this.accountreferenceprofile = value;
    }

}
