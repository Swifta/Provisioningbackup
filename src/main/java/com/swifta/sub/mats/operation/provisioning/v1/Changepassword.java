
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changepassword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changepassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changepassword", propOrder = {
    "currentpassword",
    "newpassword",
    "confirmpassword"
})
public class Changepassword {

    protected String currentpassword;
    protected String newpassword;
    protected String confirmpassword;

    /**
     * Gets the value of the currentpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentpassword() {
        return currentpassword;
    }

    /**
     * Sets the value of the currentpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentpassword(String value) {
        this.currentpassword = value;
    }

    /**
     * Gets the value of the newpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewpassword() {
        return newpassword;
    }

    /**
     * Sets the value of the newpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewpassword(String value) {
        this.newpassword = value;
    }

    /**
     * Gets the value of the confirmpassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmpassword() {
        return confirmpassword;
    }

    /**
     * Sets the value of the confirmpassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmpassword(String value) {
        this.confirmpassword = value;
    }

}
