
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addglobalsetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addglobalsetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultuserprofile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultuseraccountprofile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addglobalsetting", propOrder = {
    "defaultuserprofile",
    "defaultuseraccountprofile"
})
public class Addglobalsetting {

    protected String defaultuserprofile;
    protected String defaultuseraccountprofile;

    /**
     * Gets the value of the defaultuserprofile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultuserprofile() {
        return defaultuserprofile;
    }

    /**
     * Sets the value of the defaultuserprofile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultuserprofile(String value) {
        this.defaultuserprofile = value;
    }

    /**
     * Gets the value of the defaultuseraccountprofile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultuseraccountprofile() {
        return defaultuseraccountprofile;
    }

    /**
     * Sets the value of the defaultuseraccountprofile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultuseraccountprofile(String value) {
        this.defaultuseraccountprofile = value;
    }

}
