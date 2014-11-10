
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addthresholdtouserprofile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addthresholdtouserprofile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thresholdname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thresholdtype" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}thresholdtype" minOccurs="0"/>
 *         &lt;element name="transactiontype" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}transactiontype" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thresholdmessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensionparameters" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}parameterExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addthresholdtouserprofile", propOrder = {
    "profile",
    "thresholdname",
    "description",
    "thresholdtype",
    "transactiontype",
    "value",
    "thresholdmessage",
    "extensionparameters"
})
public class Addthresholdtouserprofile {

    protected String profile;
    protected String thresholdname;
    protected String description;
    @XmlSchemaType(name = "string")
    protected Thresholdtype thresholdtype;
    @XmlSchemaType(name = "string")
    protected Transactiontype transactiontype;
    protected String value;
    protected String thresholdmessage;
    protected ParameterExtension extensionparameters;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the thresholdname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThresholdname() {
        return thresholdname;
    }

    /**
     * Sets the value of the thresholdname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThresholdname(String value) {
        this.thresholdname = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the thresholdtype property.
     * 
     * @return
     *     possible object is
     *     {@link Thresholdtype }
     *     
     */
    public Thresholdtype getThresholdtype() {
        return thresholdtype;
    }

    /**
     * Sets the value of the thresholdtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thresholdtype }
     *     
     */
    public void setThresholdtype(Thresholdtype value) {
        this.thresholdtype = value;
    }

    /**
     * Gets the value of the transactiontype property.
     * 
     * @return
     *     possible object is
     *     {@link Transactiontype }
     *     
     */
    public Transactiontype getTransactiontype() {
        return transactiontype;
    }

    /**
     * Sets the value of the transactiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transactiontype }
     *     
     */
    public void setTransactiontype(Transactiontype value) {
        this.transactiontype = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the thresholdmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThresholdmessage() {
        return thresholdmessage;
    }

    /**
     * Sets the value of the thresholdmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThresholdmessage(String value) {
        this.thresholdmessage = value;
    }

    /**
     * Gets the value of the extensionparameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterExtension }
     *     
     */
    public ParameterExtension getExtensionparameters() {
        return extensionparameters;
    }

    /**
     * Sets the value of the extensionparameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterExtension }
     *     
     */
    public void setExtensionparameters(ParameterExtension value) {
        this.extensionparameters = value;
    }

}
