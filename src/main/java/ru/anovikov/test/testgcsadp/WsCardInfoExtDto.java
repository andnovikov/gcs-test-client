
package ru.anovikov.test.testgcsadp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsCardInfoExtDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsCardInfoExtDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsResponseDataDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expDt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acctNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acctCur" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actBal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="limits" type="{http://ws.ibank.gate.inter.gcs/types}WsLimitDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tlcCards" type="{http://ws.ibank.gate.inter.gcs/types}WsTlcCardDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsCardInfoExtDto", propOrder = {
    "status",
    "expDt",
    "acctNo",
    "acctCur",
    "actBal",
    "limits",
    "tlcCards"
})
public class WsCardInfoExtDto
    extends WsResponseDataDto
{

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String expDt;
    @XmlElement(required = true)
    protected String acctNo;
    @XmlElement(required = true)
    protected String acctCur;
    @XmlElement(required = true)
    protected BigInteger actBal;
    protected List<WsLimitDto> limits;
    protected List<WsTlcCardDto> tlcCards;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDt(String value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the acctNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Sets the value of the acctNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Gets the value of the acctCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCur() {
        return acctCur;
    }

    /**
     * Sets the value of the acctCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCur(String value) {
        this.acctCur = value;
    }

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
     * Gets the value of the limits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsLimitDto }
     * 
     * 
     */
    public List<WsLimitDto> getLimits() {
        if (limits == null) {
            limits = new ArrayList<WsLimitDto>();
        }
        return this.limits;
    }

    /**
     * Gets the value of the tlcCards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tlcCards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTlcCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsTlcCardDto }
     * 
     * 
     */
    public List<WsTlcCardDto> getTlcCards() {
        if (tlcCards == null) {
            tlcCards = new ArrayList<WsTlcCardDto>();
        }
        return this.tlcCards;
    }

}
