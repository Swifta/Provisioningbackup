
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addprofile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addprofile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profiletype" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}profiletype" minOccurs="0"/>
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
@XmlType(name = "addprofile", propOrder = {
    "profilename",
    "profiletype",
    "extensionparameters"
})
public class Addprofile {

    protected String profilename;
    @XmlSchemaType(name = "string")
    protected Profiletype profiletype;
    protected ParameterExtension extensionparameters;

    /**
     * Gets the value of the profilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfilename() {
        return profilename;
    }

    /**
     * Sets the value of the profilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfilename(String value) {
        this.profilename = value;
    }

    /**
     * Gets the value of the profiletype property.
     * 
     * @return
     *     possible object is
     *     {@link Profiletype }
     *     
     */
    public Profiletype getProfiletype() {
        return profiletype;
    }

    /**
     * Sets the value of the profiletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profiletype }
     *     
     */
    public void setProfiletype(Profiletype value) {
        this.profiletype = value;
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
