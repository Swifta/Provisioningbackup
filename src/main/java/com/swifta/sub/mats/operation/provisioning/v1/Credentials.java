
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="credentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstpin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmpin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credentials", propOrder = {
    "firstpin",
    "confirmpin"
})
public class Credentials {

    protected String firstpin;
    protected String confirmpin;

    /**
     * Gets the value of the firstpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstpin() {
        return firstpin;
    }

    /**
     * Sets the value of the firstpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstpin(String value) {
        this.firstpin = value;
    }

    /**
     * Gets the value of the confirmpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmpin() {
        return confirmpin;
    }

    /**
     * Sets the value of the confirmpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmpin(String value) {
        this.confirmpin = value;
    }

}
