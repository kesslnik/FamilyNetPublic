//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.02 at 11:16:17 AM CET 
//


package com.ibm.ia.xmlns._default.rsa_demobank_bom.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterImpulse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterImpulse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ibm.com/ia/xmlns/default/RSA_DemoBank_BOM/model}Impulse">
 *       &lt;sequence>
 *         &lt;element name="deliveryChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="letterInputKeyValuePair" type="{http://www.ibm.com/ia/xmlns/default/RSA_DemoBank_BOM/model}LetterInputKeyValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="letterTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterImpulse", propOrder = {
    "deliveryChannel",
    "letterInputKeyValuePair",
    "letterTemplate"
})
public class LetterImpulse
    extends Impulse
{

    @XmlElement(required = true)
    protected String deliveryChannel;
    protected List<LetterInputKeyValuePair> letterInputKeyValuePair;
    @XmlElement(required = true)
    protected String letterTemplate;

    /**
     * Gets the value of the deliveryChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryChannel() {
        return deliveryChannel;
    }

    /**
     * Sets the value of the deliveryChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryChannel(String value) {
        this.deliveryChannel = value;
    }

    /**
     * Gets the value of the letterInputKeyValuePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the letterInputKeyValuePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLetterInputKeyValuePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LetterInputKeyValuePair }
     * 
     * 
     */
    public List<LetterInputKeyValuePair> getLetterInputKeyValuePair() {
        if (letterInputKeyValuePair == null) {
            letterInputKeyValuePair = new ArrayList<LetterInputKeyValuePair>();
        }
        return this.letterInputKeyValuePair;
    }

    /**
     * Gets the value of the letterTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterTemplate() {
        return letterTemplate;
    }

    /**
     * Sets the value of the letterTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterTemplate(String value) {
        this.letterTemplate = value;
    }

}
