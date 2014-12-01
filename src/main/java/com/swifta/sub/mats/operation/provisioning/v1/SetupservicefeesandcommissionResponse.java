
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setupservicefeesandcommissionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setupservicefeesandcommissionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}servicefeeandcomissionrequestresponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setupservicefeesandcommissionResponse", propOrder = {
    "_return"
})
public class SetupservicefeesandcommissionResponse {

    @XmlElement(name = "return")
    protected Servicefeeandcomissionrequestresponse _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link Servicefeeandcomissionrequestresponse }
     *     
     */
    public Servicefeeandcomissionrequestresponse getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link Servicefeeandcomissionrequestresponse }
     *     
     */
    public void setReturn(Servicefeeandcomissionrequestresponse value) {
        this._return = value;
    }

}
