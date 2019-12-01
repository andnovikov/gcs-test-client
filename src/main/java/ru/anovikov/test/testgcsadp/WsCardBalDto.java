
package ru.anovikov.test.testgcsadp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsCardBalDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsCardBalDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsResponseDataDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actBal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="exceedLmt" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "WsCardBalDto", propOrder = {
    "actBal",
    "exceedLmt",
    "currency"
})
public class WsCardBalDto
    extends WsResponseDataDto
{

    @XmlElement(required = true)
    protected BigInteger actBal;
    @XmlElement(required = true)
    protected BigInteger exceedLmt;
    @XmlElement(required = true)
    protected String currency;

    /**
     * Gets the value of the actBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActBal() {
        return actBal;
    }

    /**
     * Sets the value of the actBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActBal(BigInteger value) {
        this.actBal = value;
    }

    /**
     * Gets the value of the exceedLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExceedLmt() {
        return exceedLmt;
    }

    /**
     * Sets the value of the exceedLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExceedLmt(BigInteger value) {
        this.exceedLmt = value;
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
