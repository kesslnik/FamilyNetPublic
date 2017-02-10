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
 * <p>Java class for PromotionDecision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionDecision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="client" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastImpulseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latestReaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promotionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestedMoment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionDecision", propOrder = {
    "channel",
    "client",
    "datetime",
    "lastImpulseName",
    "latestReaction",
    "promotionName",
    "requestedMoment"
})
public class PromotionDecision {

    @XmlElement(required = true)
    protected String channel;
    @XmlElement(required = true)
    protected String client;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datetime;
    @XmlElement(required = true)
    protected String lastImpulseName;
    @XmlElement(required = true)
    protected String latestReaction;
    @XmlElement(required = true)
    protected String promotionName;
    @XmlElement(required = true)
    protected String requestedMoment;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
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
     * Gets the value of the lastImpulseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastImpulseName() {
        return lastImpulseName;
    }

    /**
     * Sets the value of the lastImpulseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastImpulseName(String value) {
        this.lastImpulseName = value;
    }

    /**
     * Gets the value of the latestReaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestReaction() {
        return latestReaction;
    }

    /**
     * Sets the value of the latestReaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestReaction(String value) {
        this.latestReaction = value;
    }

    /**
     * Gets the value of the promotionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Sets the value of the promotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionName(String value) {
        this.promotionName = value;
    }

    /**
     * Gets the value of the requestedMoment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedMoment() {
        return requestedMoment;
    }

    /**
     * Sets the value of the requestedMoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedMoment(String value) {
        this.requestedMoment = value;
    }

}
