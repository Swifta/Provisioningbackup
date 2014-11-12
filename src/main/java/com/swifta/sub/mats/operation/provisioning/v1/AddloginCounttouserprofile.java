
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addloginCounttouserprofile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addloginCounttouserprofile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoresetcounter" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}autoresetcounterevery" minOccurs="0"/>
 *         &lt;element name="limitmessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "addloginCounttouserprofile", propOrder = {
    "profile",
    "countername",
    "description",
    "limit",
    "autoresetcounter",
    "limitmessage",
    "extensionparameters"
})
public class AddloginCounttouserprofile {

    protected String profile;
    protected String countername;
    protected String description;
    protected String limit;
    @XmlSchemaType(name = "string")
    protected Autoresetcounterevery autoresetcounter;
    protected String limitmessage;
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
     * Gets the value of the countername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountername() {
        return countername;
    }

    /**
     * Sets the value of the countername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountername(String value) {
        this.countername = value;
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
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimit(String value) {
        this.limit = value;
    }

    /**
     * Gets the value of the autoresetcounter property.
     * 
     * @return
     *     possible object is
     *     {@link Autoresetcounterevery }
     *     
     */
    public Autoresetcounterevery getAutoresetcounter() {
        return autoresetcounter;
    }

    /**
     * Sets the value of the autoresetcounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autoresetcounterevery }
     *     
     */
    public void setAutoresetcounter(Autoresetcounterevery value) {
        this.autoresetcounter = value;
    }

    /**
     * Gets the value of the limitmessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitmessage() {
        return limitmessage;
    }

    /**
     * Sets the value of the limitmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitmessage(String value) {
        this.limitmessage = value;
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
