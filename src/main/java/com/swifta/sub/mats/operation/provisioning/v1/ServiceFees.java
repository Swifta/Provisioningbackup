
package com.swifta.sub.mats.operation.provisioning.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceFees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceFees">
 *   &lt;complexContent>
 *     &lt;extension base="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceFeesInterface">
 *       &lt;sequence>
 *         &lt;element name="transactiontypeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minimumamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maximumamount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="servicefee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="servicefeetype" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}serviceFeematrix" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceFees", propOrder = {
    "rest"
})
public class ServiceFees
    extends ServiceFeesInterface
{

    @XmlElementRefs({
        @XmlElementRef(name = "transactiontypeid", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "servicefee", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "maximumamount", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "minimumamount", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "servicefeetype", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Transactiontypeid" is used by two different parts of a schema. See: 
     * line 249 of file:/Users/user/git/Provisioning/src/main/webapp/WEB-INF/wsdl/Provisioning.wsdl
     * line 260 of file:/Users/user/git/Provisioning/src/main/webapp/WEB-INF/wsdl/Provisioning.wsdl
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceFeematrix }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
