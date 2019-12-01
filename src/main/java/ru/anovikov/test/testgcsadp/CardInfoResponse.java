
package ru.anovikov.test.testgcsadp;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardInfoResult" type="{http://ws.ibank.gate.inter.gcs/types}WsCardInfoResponseDto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardInfoResult"
})
@XmlRootElement(name = "cardInfoResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class CardInfoResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsCardInfoResponseDto cardInfoResult;

    /**
     * Gets the value of the cardInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsCardInfoResponseDto }
     *     
     */
    public WsCardInfoResponseDto getCardInfoResult() {
        return cardInfoResult;
    }

    /**
     * Sets the value of the cardInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCardInfoResponseDto }
     *     
     */
    public void setCardInfoResult(WsCardInfoResponseDto value) {
        this.cardInfoResult = value;
    }

}
