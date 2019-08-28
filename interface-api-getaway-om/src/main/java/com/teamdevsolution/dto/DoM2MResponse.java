
package com.teamdevsolution.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour doM2MResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="doM2MResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doM2MResponse", propOrder = {
    "resultCode",
    "resultDesc",
    "partnId",
    "transId",
    "systemId"
})
public class DoM2MResponse {

    @XmlElement(required = true)
    protected String resultCode;
    @XmlElement(required = true)
    protected String resultDesc;
    @XmlElement(required = true)
    protected String partnId;
    @XmlElement(required = true)
    protected String transId;
    @XmlElement(required = true)
    protected String systemId;

    /**
     * Obtient la valeur de la propriété resultCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Définit la valeur de la propriété resultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Obtient la valeur de la propriété resultDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * Définit la valeur de la propriété resultDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDesc(String value) {
        this.resultDesc = value;
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
     * Obtient la valeur de la propriété transId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Définit la valeur de la propriété transId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Obtient la valeur de la propriété systemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Définit la valeur de la propriété systemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

}
