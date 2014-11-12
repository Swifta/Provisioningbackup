
package com.swifta.sub.mats.operation.provisioning.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addtransferCounttouserprofile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addtransferCounttouserprofile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countertype" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}transfercounttype" minOccurs="0"/>
 *         &lt;element name="transactiontype" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "addtransferCounttouserprofile", propOrder = {
    "profile",
    "countername",
    "description",
    "countertype",
    "transactiontype",
    "limit",
    "autoresetcounter",
    "limitmessage",
    "extensionparameters"
})
public class AddtransferCounttouserprofile {

    protected String profile;
    protected String countername;
    protected String description;
    @XmlSchemaType(name = "string")
    protected Transfercounttype countertype;
    protected List<String> transactiontype;
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
     * Gets the value of the countertype property.
     * 
     * @return
     *     possible object is
     *     {@link Transfercounttype }
     *     
     */
    public Transfercounttype getCountertype() {
        return countertype;
    }

    /**
     * Sets the value of the countertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfercounttype }
     *     
     */
    public void setCountertype(Transfercounttype value) {
        this.countertype = value;
    }

    /**
     * Gets the value of the transactiontype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactiontype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactiontype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransactiontype() {
        if (transactiontype == null) {
            transactiontype = new ArrayList<String>();
        }
        return this.transactiontype;
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
