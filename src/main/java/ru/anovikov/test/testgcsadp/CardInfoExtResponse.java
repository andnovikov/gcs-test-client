
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
 *         &lt;element name="cardInfoExtResult" type="{http://ws.ibank.gate.inter.gcs/types}WsCardInfoExtResponseDto"/&gt;
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
    "cardInfoExtResult"
})
@XmlRootElement(name = "cardInfoExtResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class CardInfoExtResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsCardInfoExtResponseDto cardInfoExtResult;

    /**
     * Gets the value of the cardInfoExtResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsCardInfoExtResponseDto }
     *     
     */
    public WsCardInfoExtResponseDto getCardInfoExtResult() {
        return cardInfoExtResult;
    }

    /**
     * Sets the value of the cardInfoExtResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCardInfoExtResponseDto }
     *     
     */
    public void setCardInfoExtResult(WsCardInfoExtResponseDto value) {
        this.cardInfoExtResult = value;
    }

}
