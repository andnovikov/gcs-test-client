
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
 *         &lt;element name="cardBalResult" type="{http://ws.ibank.gate.inter.gcs/types}WsCardBalResponseDto"/&gt;
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
    "cardBalResult"
})
@XmlRootElement(name = "cardBalResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class CardBalResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsCardBalResponseDto cardBalResult;

    /**
     * Gets the value of the cardBalResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsCardBalResponseDto }
     *     
     */
    public WsCardBalResponseDto getCardBalResult() {
        return cardBalResult;
    }

    /**
     * Sets the value of the cardBalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCardBalResponseDto }
     *     
     */
    public void setCardBalResult(WsCardBalResponseDto value) {
        this.cardBalResult = value;
    }

}
