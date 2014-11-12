
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suspendaccountholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suspendaccountholder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmcredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suspendaccountholder", propOrder = {
    "resourceid",
    "confirmcredential"
})
public class Suspendaccountholder {

    protected String resourceid;
    protected String confirmcredential;

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
     * Gets the value of the confirmcredential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmcredential() {
        return confirmcredential;
    }

    /**
     * Sets the value of the confirmcredential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmcredential(String value) {
        this.confirmcredential = value;
    }

}
