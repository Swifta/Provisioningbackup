
package com.swifta.sub.mats.operation.provisioning.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceCommission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceCommission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servicecommissioncondition" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceCommissionConditionTypes" minOccurs="0"/>
 *         &lt;element name="servicecommissionmodeltype" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceCommissionModelTypes" minOccurs="0"/>
 *         &lt;element name="transactiontypeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minimumamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maximumamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="commissionfee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="commissionfeetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceCommission", propOrder = {
    "servicecommissioncondition",
    "servicecommissionmodeltype",
    "transactiontypeid",
    "minimumamount",
    "maximumamount",
    "commissionfee",
    "commissionfeetype"
})
public class ServiceCommission {

    @XmlSchemaType(name = "string")
    protected ServiceCommissionConditionTypes servicecommissioncondition;
    @XmlSchemaType(name = "string")
    protected ServiceCommissionModelTypes servicecommissionmodeltype;
    protected int transactiontypeid;
    protected BigDecimal minimumamount;
    protected BigDecimal maximumamount;
    protected BigDecimal commissionfee;
    protected String commissionfeetype;

    /**
     * Gets the value of the servicecommissioncondition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCommissionConditionTypes }
     *     
     */
    public ServiceCommissionConditionTypes getServicecommissioncondition() {
        return servicecommissioncondition;
    }

    /**
     * Sets the value of the servicecommissioncondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCommissionConditionTypes }
     *     
     */
    public void setServicecommissioncondition(ServiceCommissionConditionTypes value) {
        this.servicecommissioncondition = value;
    }

    /**
     * Gets the value of the servicecommissionmodeltype property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCommissionModelTypes }
     *     
     */
    public ServiceCommissionModelTypes getServicecommissionmodeltype() {
        return servicecommissionmodeltype;
    }

    /**
     * Sets the value of the servicecommissionmodeltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCommissionModelTypes }
     *     
     */
    public void setServicecommissionmodeltype(ServiceCommissionModelTypes value) {
        this.servicecommissionmodeltype = value;
    }

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
     * Gets the value of the commissionfee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommissionfee() {
        return commissionfee;
    }

    /**
     * Sets the value of the commissionfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommissionfee(BigDecimal value) {
        this.commissionfee = value;
    }

    /**
     * Gets the value of the commissionfeetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionfeetype() {
        return commissionfeetype;
    }

    /**
     * Sets the value of the commissionfeetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionfeetype(String value) {
        this.commissionfeetype = value;
    }

}
