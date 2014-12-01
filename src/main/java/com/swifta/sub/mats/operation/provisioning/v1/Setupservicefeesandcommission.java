
package com.swifta.sub.mats.operation.provisioning.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setupservicefeesandcommission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setupservicefeesandcommission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spaccountholderid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicefeecondition" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceFeeConditionTypes" minOccurs="0"/>
 *         &lt;element name="servicefeemodel" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceFeeModelTypes" minOccurs="0"/>
 *         &lt;element name="servicefeedetails" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceFees" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servicecommissiondetails" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceCommission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setupservicefeesandcommission", propOrder = {
    "spaccountholderid",
    "servicefeecondition",
    "servicefeemodel",
    "servicefeedetails",
    "servicecommissiondetails"
})
public class Setupservicefeesandcommission {

    protected String spaccountholderid;
    @XmlSchemaType(name = "string")
    protected ServiceFeeConditionTypes servicefeecondition;
    @XmlSchemaType(name = "string")
    protected ServiceFeeModelTypes servicefeemodel;
    protected List<ServiceFees> servicefeedetails;
    protected List<ServiceCommission> servicecommissiondetails;

    /**
     * Gets the value of the spaccountholderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaccountholderid() {
        return spaccountholderid;
    }

    /**
     * Sets the value of the spaccountholderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaccountholderid(String value) {
        this.spaccountholderid = value;
    }

    /**
     * Gets the value of the servicefeecondition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeConditionTypes }
     *     
     */
    public ServiceFeeConditionTypes getServicefeecondition() {
        return servicefeecondition;
    }

    /**
     * Sets the value of the servicefeecondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeConditionTypes }
     *     
     */
    public void setServicefeecondition(ServiceFeeConditionTypes value) {
        this.servicefeecondition = value;
    }

    /**
     * Gets the value of the servicefeemodel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeModelTypes }
     *     
     */
    public ServiceFeeModelTypes getServicefeemodel() {
        return servicefeemodel;
    }

    /**
     * Sets the value of the servicefeemodel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeModelTypes }
     *     
     */
    public void setServicefeemodel(ServiceFeeModelTypes value) {
        this.servicefeemodel = value;
    }

    /**
     * Gets the value of the servicefeedetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicefeedetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicefeedetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFees }
     * 
     * 
     */
    public List<ServiceFees> getServicefeedetails() {
        if (servicefeedetails == null) {
            servicefeedetails = new ArrayList<ServiceFees>();
        }
        return this.servicefeedetails;
    }

    /**
     * Gets the value of the servicecommissiondetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicecommissiondetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicecommissiondetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCommission }
     * 
     * 
     */
    public List<ServiceCommission> getServicecommissiondetails() {
        if (servicecommissiondetails == null) {
            servicecommissiondetails = new ArrayList<ServiceCommission>();
        }
        return this.servicecommissiondetails;
    }

}
