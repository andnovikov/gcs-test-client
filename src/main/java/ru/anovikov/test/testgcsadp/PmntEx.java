
package ru.anovikov.test.testgcsadp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="pmntMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pmntType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pmntData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="params" type="{http://ws.ibank.gate.inter.gcs/types}WsKeyPairDto" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pmntMode",
    "pmntType",
    "pmntData",
    "amount",
    "currency",
    "params"
})
@XmlRootElement(name = "pmntEx", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class PmntEx
    extends WsRequestDto
{

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String pmntExtId;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String pmntMode;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String pmntType;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String pmntData;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected BigInteger amount;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String currency;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    protected List<WsKeyPairDto> params;

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
     * Gets the value of the pmntMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmntMode() {
        return pmntMode;
    }

    /**
     * Sets the value of the pmntMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmntMode(String value) {
        this.pmntMode = value;
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

    /**
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsKeyPairDto }
     * 
     * 
     */
    public List<WsKeyPairDto> getParams() {
        if (params == null) {
            params = new ArrayList<WsKeyPairDto>();
        }
        return this.params;
    }

}
