
package ru.anovikov.test.testgcsadp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsRequestDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pmntExtId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pmntType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pmntData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pmntExtId",
    "pmntType",
    "pmntData",
    "amount",
    "currency"
})
@XmlRootElement(name = "pmnt", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class Pmnt
    extends WsRequestDto
{

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String pmntExtId;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String pmntType;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String pmntData;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected BigInteger amount;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String currency;

    /**
     * Gets the value of the pmntExtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmntExtId() {
        return pmntExtId;
    }

    /**
     * Sets the value of the pmntExtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmntExtId(String value) {
        this.pmntExtId = value;
    }

    /**
     * Gets the value of the pmntType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmntType() {
        return pmntType;
    }

    /**
     * Sets the value of the pmntType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmntType(String value) {
        this.pmntType = value;
    }

    /**
     * Gets the value of the pmntData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmntData() {
        return pmntData;
    }

    /**
     * Sets the value of the pmntData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmntData(String value) {
        this.pmntData = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
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
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
