
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
 *         &lt;element name="cardGeoRestrictionInfoResult" type="{http://ws.ibank.gate.inter.gcs/types}WsCardGeoRestrictionInfoResponseDto"/&gt;
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
    "cardGeoRestrictionInfoResult"
})
@XmlRootElement(name = "cardGeoRestrictionInfoResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class CardGeoRestrictionInfoResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsCardGeoRestrictionInfoResponseDto cardGeoRestrictionInfoResult;

    /**
     * Gets the value of the cardGeoRestrictionInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsCardGeoRestrictionInfoResponseDto }
     *     
     */
    public WsCardGeoRestrictionInfoResponseDto getCardGeoRestrictionInfoResult() {
        return cardGeoRestrictionInfoResult;
    }

    /**
     * Sets the value of the cardGeoRestrictionInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCardGeoRestrictionInfoResponseDto }
     *     
     */
    public void setCardGeoRestrictionInfoResult(WsCardGeoRestrictionInfoResponseDto value) {
        this.cardGeoRestrictionInfoResult = value;
    }

}
