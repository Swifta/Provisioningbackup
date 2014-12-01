
package com.swifta.sub.mats.operation.provisioning.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceFeesInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceFeesInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactiontypeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minimumamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maximumamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="servicefee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="servicefeetype" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceFeematrix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceFeesInterface", propOrder = {
    "transactiontypeid",
    "minimumamount",
    "maximumamount",
    "servicefee",
    "servicefeetype"
})
@XmlSeeAlso({
    ServiceFees.class
})
public abstract class ServiceFeesInterface {

    protected int transactiontypeid;
    protected BigDecimal minimumamount;
    protected BigDecimal maximumamount;
    protected BigDecimal servicefee;
    @XmlSchemaType(name = "string")
    protected ServiceFeematrix servicefeetype;

    /**
     * Gets the value of the transactiontypeid property.
     * 
     */
    public int getTransactiontypeid() {
        return transactiontypeid;
    }

    /**
     * Sets the value of the transactiontypeid property.
     * 
     */
    public void setTransactiontypeid(int value) {
        this.transactiontypeid = value;
    }

    /**
     * Gets the value of the minimumamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumamount() {
        return minimumamount;
    }

    /**
     * Sets the value of the minimumamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumamount(BigDecimal value) {
        this.minimumamount = value;
    }

    /**
     * Gets the value of the maximumamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumamount() {
        return maximumamount;
    }

    /**
     * Sets the value of the maximumamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumamount(BigDecimal value) {
        this.maximumamount = value;
    }

    /**
     * Gets the value of the servicefee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicefee() {
        return servicefee;
    }

    /**
     * Sets the value of the servicefee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServicefee(BigDecimal value) {
        this.servicefee = value;
    }

    /**
     * Gets the value of the servicefeetype property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeematrix }
     *     
     */
    public ServiceFeematrix getServicefeetype() {
        return servicefeetype;
    }

    /**
     * Sets the value of the servicefeetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeematrix }
     *     
     */
    public void setServicefeetype(ServiceFeematrix value) {
        this.servicefeetype = value;
    }

}
