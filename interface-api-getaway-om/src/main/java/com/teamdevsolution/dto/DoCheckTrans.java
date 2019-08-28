
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour doCheckTrans complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="doCheckTrans"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mermsisdn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doCheckTrans", propOrder = {
    "mermsisdn",
    "partnid",
    "transid"
})
public class DoCheckTrans {

    @XmlElement(required = true)
    protected String mermsisdn;
    @XmlElement(required = true)
    protected String partnid;
    @XmlElement(required = true)
    protected String transid;

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
     * Obtient la valeur de la propriété partnid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnid() {
        return partnid;
    }

    /**
     * Définit la valeur de la propriété partnid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnid(String value) {
        this.partnid = value;
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

}
