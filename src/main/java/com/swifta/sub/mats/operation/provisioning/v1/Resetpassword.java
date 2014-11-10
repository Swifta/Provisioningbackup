
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resetpassword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resetpassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forcepasswordchangeafterlogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resetpassword", propOrder = {
    "forcepasswordchangeafterlogin"
})
public class Resetpassword {

    protected Boolean forcepasswordchangeafterlogin;

    /**
     * Gets the value of the forcepasswordchangeafterlogin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcepasswordchangeafterlogin() {
        return forcepasswordchangeafterlogin;
    }

    /**
     * Sets the value of the forcepasswordchangeafterlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcepasswordchangeafterlogin(Boolean value) {
        this.forcepasswordchangeafterlogin = value;
    }

}
