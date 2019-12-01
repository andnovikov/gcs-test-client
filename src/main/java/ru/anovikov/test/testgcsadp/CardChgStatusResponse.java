
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
 *         &lt;element name="cardChgStatusResult" type="{http://ws.ibank.gate.inter.gcs/types}WsCardChgStatusResponseDto"/&gt;
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
    "cardChgStatusResult"
})
@XmlRootElement(name = "cardChgStatusResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class CardChgStatusResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsCardChgStatusResponseDto cardChgStatusResult;

    /**
     * Gets the value of the cardChgStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsCardChgStatusResponseDto }
     *     
     */
    public WsCardChgStatusResponseDto getCardChgStatusResult() {
        return cardChgStatusResult;
    }

    /**
     * Sets the value of the cardChgStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCardChgStatusResponseDto }
     *     
     */
    public void setCardChgStatusResult(WsCardChgStatusResponseDto value) {
        this.cardChgStatusResult = value;
    }

}
