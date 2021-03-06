//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.10 at 05:27:38 PM CET 
//


package com.ibm.ia.xmlns._default.rsa_demobank_bom.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClientSetupEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientSetupEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activePromotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="amountOfExpenses" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="bankingPackage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerSegment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientSetupEvent", propOrder = {
    "activePromotion",
    "age",
    "amountOfExpenses",
    "bankingPackage",
    "client",
    "customerSegment",
    "datetime",
    "language"
})
public class ClientSetupEvent {

    @XmlElement(required = true)
    protected String activePromotion;
    protected double age;
    protected double amountOfExpenses;
    @XmlElement(required = true)
    protected String bankingPackage;
    @XmlElement(required = true)
    protected String client;
    @XmlElement(required = true)
    protected String customerSegment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;
    @XmlElement(required = true)
    protected String language;

    /**
     * Gets the value of the activePromotion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivePromotion() {
        return activePromotion;
    }

    /**
     * Sets the value of the activePromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivePromotion(String value) {
        this.activePromotion = value;
    }

    /**
     * Gets the value of the age property.
     * 
     */
    public double getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     */
    public void setAge(double value) {
        this.age = value;
    }

    /**
     * Gets the value of the amountOfExpenses property.
     * 
     */
    public double getAmountOfExpenses() {
        return amountOfExpenses;
    }

    /**
     * Sets the value of the amountOfExpenses property.
     * 
     */
    public void setAmountOfExpenses(double value) {
        this.amountOfExpenses = value;
    }

    /**
     * Gets the value of the bankingPackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankingPackage() {
        return bankingPackage;
    }

    /**
     * Sets the value of the bankingPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankingPackage(String value) {
        this.bankingPackage = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClient(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the customerSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSegment() {
        return customerSegment;
    }

    /**
     * Sets the value of the customerSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSegment(String value) {
        this.customerSegment = value;
    }

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetime(XMLGregorianCalendar value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
