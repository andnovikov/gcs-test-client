
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
 *         &lt;element name="cardChgGeoRestrictionResult" type="{http://ws.ibank.gate.inter.gcs/types}WsCardChgGeoRestrictionResponseDto"/&gt;
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
    "cardChgGeoRestrictionResult"
})
@XmlRootElement(name = "cardChgGeoRestrictionResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class CardChgGeoRestrictionResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsCardChgGeoRestrictionResponseDto cardChgGeoRestrictionResult;

    /**
     * Gets the value of the cardChgGeoRestrictionResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsCardChgGeoRestrictionResponseDto }
     *     
     */
    public WsCardChgGeoRestrictionResponseDto getCardChgGeoRestrictionResult() {
        return cardChgGeoRestrictionResult;
    }

    /**
     * Sets the value of the cardChgGeoRestrictionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCardChgGeoRestrictionResponseDto }
     *     
     */
    public void setCardChgGeoRestrictionResult(WsCardChgGeoRestrictionResponseDto value) {
        this.cardChgGeoRestrictionResult = value;
    }

}
