
package ru.anovikov.test.testgcsadp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsRequestDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsRequestDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsMessageDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsRequestDto", propOrder = {
    "cardNo"
})
@XmlSeeAlso({
    CardChgGeoRestriction.class,
    CardGeoRestrictionInfo.class,
    CardInfoExt.class,
    CardChgLmt.class,
    CardChgStatus.class,
    PmntEx.class,
    PmntRev.class,
    Pmnt.class,
    PmntCheck.class,
    TransInfo.class,
    HoldInfo.class,
    TlcInfo.class,
    CardBal.class,
    CardInfo.class
})
public class WsRequestDto
    extends WsMessageDto
{

    @XmlElement(required = true)
    protected String cardNo;

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

}
