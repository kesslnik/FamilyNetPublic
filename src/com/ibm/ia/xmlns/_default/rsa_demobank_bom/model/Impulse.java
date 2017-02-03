//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.02 at 11:16:17 AM CET 
//


package com.ibm.ia.xmlns._default.rsa_demobank_bom.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Impulse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Impulse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="impulseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impulseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relatedPromotionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Impulse", propOrder = {
    "client",
    "datetime",
    "impulseId",
    "impulseName",
    "reason",
    "relatedPromotionName"
})
@XmlSeeAlso({
    CRMImpulse.class,
    WebImpulse.class,
    LetterImpulse.class
})
public class Impulse {

    @XmlElement(required = true)
    protected String client;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;
    @XmlElement(required = true)
    protected String impulseId;
    @XmlElement(required = true)
    protected String impulseName;
    @XmlElement(required = true)
    protected String reason;
    @XmlElement(required = true)
    protected String relatedPromotionName;

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
     * Gets the value of the impulseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpulseId() {
        return impulseId;
    }

    /**
     * Sets the value of the impulseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpulseId(String value) {
        this.impulseId = value;
    }

    /**
     * Gets the value of the impulseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpulseName() {
        return impulseName;
    }

    /**
     * Sets the value of the impulseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpulseName(String value) {
        this.impulseName = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the relatedPromotionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedPromotionName() {
        return relatedPromotionName;
    }

    /**
     * Sets the value of the relatedPromotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedPromotionName(String value) {
        this.relatedPromotionName = value;
    }

}