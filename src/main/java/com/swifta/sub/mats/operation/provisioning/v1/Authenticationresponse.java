
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticationresponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authenticationresponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://swifta.com/sub/mats/operation/provisioning/v1.0}operationresponse">
 *       &lt;sequence>
 *         &lt;element name="extension" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}extension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authenticationresponse", propOrder = {
    "extension"
})
public class Authenticationresponse
    extends Operationresponse
{

    protected Extension extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Extension }
     *     
     */
    public Extension getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extension }
     *     
     */
    public void setExtension(Extension value) {
        this.extension = value;
    }

}
