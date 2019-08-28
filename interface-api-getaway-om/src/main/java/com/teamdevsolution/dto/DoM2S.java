
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour doM2S complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="doM2S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subsmsisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mermsisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "doM2S", propOrder = {
    "subsmsisdn",
    "mermsisdn",
    "partnId",
    "transid",
    "currency",
    "amount"
})
public class DoM2S {

    @XmlElement(required = true)
    protected String subsmsisdn;
    @XmlElement(required = true)
    protected String mermsisdn;
    @XmlElement(required = true)
    protected String partnId;
    @XmlElement(required = true)
    protected String transid;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String amount;

    /**
     * Obtient la valeur de la propriété subsmsisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsmsisdn() {
        return subsmsisdn;
    }

    /**
     * Définit la valeur de la propriété subsmsisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsmsisdn(String value) {
        this.subsmsisdn = value;
    }

    /**
     * Obtient la valeur de la propriété mermsisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMermsisdn() {
        return mermsisdn;
    }

    /**
     * Définit la valeur de la propriété mermsisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMermsisdn(String value) {
        this.mermsisdn = value;
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
