
package com.swifta.sub.mats.operation.provisioning.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountholderdetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountholderdetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}gender" minOccurs="0"/>
 *         &lt;element name="countryid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="stateid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lgaid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="languageid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identification" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}identification" minOccurs="0"/>
 *         &lt;element name="address" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}address" minOccurs="0"/>
 *         &lt;element name="dateofbirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="primarycontact" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}primaryContactInfo" minOccurs="0"/>
 *         &lt;element name="secondarycontact" type="{http://swifta.com/sub/mats/operation/provisioning/v1.0}secondaryContactInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountholderdetails", propOrder = {
    "firstname",
    "lastname",
    "middlename",
    "suffix",
    "prefix",
    "gender",
    "countryid",
    "stateid",
    "lgaid",
    "languageid",
    "occupation",
    "employer",
    "identification",
    "address",
    "dateofbirth",
    "primarycontact",
    "secondarycontact"
})
public class Accountholderdetails {

    protected String firstname;
    protected String lastname;
    protected String middlename;
    protected String suffix;
    protected String prefix;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    protected int countryid;
    protected int stateid;
    protected int lgaid;
    protected int languageid;
    protected String occupation;
    protected String employer;
    protected Identification identification;
    protected Address address;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateofbirth;
    protected PrimaryContactInfo primarycontact;
    protected SecondaryContactInfo secondarycontact;

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the countryid property.
     * 
     */
    public int getCountryid() {
        return countryid;
    }

    /**
     * Sets the value of the countryid property.
     * 
     */
    public void setCountryid(int value) {
        this.countryid = value;
    }

    /**
     * Gets the value of the stateid property.
     * 
     */
    public int getStateid() {
        return stateid;
    }

    /**
     * Sets the value of the stateid property.
     * 
     */
    public void setStateid(int value) {
        this.stateid = value;
    }

    /**
     * Gets the value of the lgaid property.
     * 
     */
    public int getLgaid() {
        return lgaid;
    }

    /**
     * Sets the value of the lgaid property.
     * 
     */
    public void setLgaid(int value) {
        this.lgaid = value;
    }

    /**
     * Gets the value of the languageid property.
     * 
     */
    public int getLanguageid() {
        return languageid;
    }

    /**
     * Sets the value of the languageid property.
     * 
     */
    public void setLanguageid(int value) {
        this.languageid = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployer(String value) {
        this.employer = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the dateofbirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateofbirth() {
        return dateofbirth;
    }

    /**
     * Sets the value of the dateofbirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateofbirth(XMLGregorianCalendar value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the primarycontact property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryContactInfo }
     *     
     */
    public PrimaryContactInfo getPrimarycontact() {
        return primarycontact;
    }

    /**
     * Sets the value of the primarycontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryContactInfo }
     *     
     */
    public void setPrimarycontact(PrimaryContactInfo value) {
        this.primarycontact = value;
    }

    /**
     * Gets the value of the secondarycontact property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryContactInfo }
     *     
     */
    public SecondaryContactInfo getSecondarycontact() {
        return secondarycontact;
    }

    /**
     * Sets the value of the secondarycontact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryContactInfo }
     *     
     */
    public void setSecondarycontact(SecondaryContactInfo value) {
        this.secondarycontact = value;
    }

}
