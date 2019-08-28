
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour doM2M complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="doM2M"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mermsisdn1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mermsisdn2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doM2M", propOrder = {
    "mermsisdn1",
    "mermsisdn2",
    "partnId",
    "transid",
    "currency",
    "amount"
})
public class DoM2M {

    @XmlElement(required = true)
    protected String mermsisdn1;
    @XmlElement(required = true)
    protected String mermsisdn2;
    @XmlElement(required = true)
    protected String partnId;
    @XmlElement(required = true)
    protected String transid;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String amount;

    /**
     * Obtient la valeur de la propriété mermsisdn1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMermsisdn1() {
        return mermsisdn1;
    }

    /**
     * Définit la valeur de la propriété mermsisdn1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMermsisdn1(String value) {
        this.mermsisdn1 = value;
    }

    /**
     * Obtient la valeur de la propriété mermsisdn2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMermsisdn2() {
        return mermsisdn2;
    }

    /**
     * Définit la valeur de la propriété mermsisdn2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMermsisdn2(String value) {
        this.mermsisdn2 = value;
    }

    /**
     * Obtient la valeur de la propriété partnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnId() {
        return partnId;
    }

    /**
     * Définit la valeur de la propriété partnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnId(String value) {
        this.partnId = value;
    }

    /**
     * Obtient la valeur de la propriété transid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransid() {
        return transid;
    }

    /**
     * Définit la valeur de la propriété transid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransid(String value) {
        this.transid = value;
    }

    /**
     * Obtient la valeur de la propriété currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Définit la valeur de la propriété currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtient la valeur de la propriété amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

}
