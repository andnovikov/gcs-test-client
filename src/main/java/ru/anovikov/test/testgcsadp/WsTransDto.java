
package ru.anovikov.test.testgcsadp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WsTransDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsTransDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reversal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="termId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="termName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="termType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="convAmount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="convCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transType" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="transTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respCode" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="newBal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="oldBal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsTransDto", propOrder = {
    "transDt",
    "sign",
    "amount",
    "currency",
    "authCode",
    "refNum",
    "reversal",
    "termId",
    "termName",
    "city",
    "termType",
    "convAmount",
    "convCurrency",
    "transType",
    "transTypeDesc",
    "respCode",
    "newBal",
    "oldBal"
})
public class WsTransDto {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transDt;
    @XmlElement(required = true)
    protected String sign;
    @XmlElement(required = true)
    protected BigInteger amount;
    @XmlElement(required = true)
    protected String currency;
    @XmlElement(required = true)
    protected String authCode;
    @XmlElement(required = true)
    protected String refNum;
    @XmlElement(required = true)
    protected BigInteger reversal;
    @XmlElement(required = true)
    protected String termId;
    @XmlElement(required = true)
    protected String termName;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    protected String termType;
    @XmlElement(required = true)
    protected BigInteger convAmount;
    @XmlElement(required = true)
    protected String convCurrency;
    @XmlElement(required = true)
    protected BigInteger transType;
    @XmlElement(required = true)
    protected String transTypeDesc;
    @XmlElement(required = true)
    protected BigInteger respCode;
    @XmlElement(required = true)
    protected BigInteger newBal;
    @XmlElement(required = true)
    protected BigInteger oldBal;

    /**
     * Gets the value of the transDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransDt() {
        return transDt;
    }

    /**
     * Sets the value of the transDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransDt(XMLGregorianCalendar value) {
        this.transDt = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
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
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the refNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum() {
        return refNum;
    }

    /**
     * Sets the value of the refNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum(String value) {
        this.refNum = value;
    }

    /**
     * Gets the value of the reversal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReversal() {
        return reversal;
    }

    /**
     * Sets the value of the reversal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReversal(BigInteger value) {
        this.reversal = value;
    }

    /**
     * Gets the value of the termId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermId() {
        return termId;
    }

    /**
     * Sets the value of the termId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermId(String value) {
        this.termId = value;
    }

    /**
     * Gets the value of the termName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermName() {
        return termName;
    }

    /**
     * Sets the value of the termName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermName(String value) {
        this.termName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the termType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermType() {
        return termType;
    }

    /**
     * Sets the value of the termType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermType(String value) {
        this.termType = value;
    }

    /**
     * Gets the value of the convAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConvAmount() {
        return convAmount;
    }

    /**
     * Sets the value of the convAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConvAmount(BigInteger value) {
        this.convAmount = value;
    }

    /**
     * Gets the value of the convCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvCurrency() {
        return convCurrency;
    }

    /**
     * Sets the value of the convCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvCurrency(String value) {
        this.convCurrency = value;
    }

    /**
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransType(BigInteger value) {
        this.transType = value;
    }

    /**
     * Gets the value of the transTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransTypeDesc() {
        return transTypeDesc;
    }

    /**
     * Sets the value of the transTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransTypeDesc(String value) {
        this.transTypeDesc = value;
    }

    /**
     * Gets the value of the respCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRespCode(BigInteger value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the newBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewBal() {
        return newBal;
    }

    /**
     * Sets the value of the newBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewBal(BigInteger value) {
        this.newBal = value;
    }

    /**
     * Gets the value of the oldBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOldBal() {
        return oldBal;
    }

    /**
     * Sets the value of the oldBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOldBal(BigInteger value) {
        this.oldBal = value;
    }

}
