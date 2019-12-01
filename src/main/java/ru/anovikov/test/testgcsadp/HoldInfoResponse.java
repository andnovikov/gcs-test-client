
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
 *         &lt;element name="holdInfoResult" type="{http://ws.ibank.gate.inter.gcs/types}WsHoldInfoResponseDto"/&gt;
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
    "holdInfoResult"
})
@XmlRootElement(name = "holdInfoResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class HoldInfoResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsHoldInfoResponseDto holdInfoResult;

    /**
     * Gets the value of the holdInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsHoldInfoResponseDto }
     *     
     */
    public WsHoldInfoResponseDto getHoldInfoResult() {
        return holdInfoResult;
    }

    /**
     * Sets the value of the holdInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsHoldInfoResponseDto }
     *     
     */
    public void setHoldInfoResult(WsHoldInfoResponseDto value) {
        this.holdInfoResult = value;
    }

}
