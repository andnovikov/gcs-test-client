
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
 *         &lt;element name="tlcInfoResult" type="{http://ws.ibank.gate.inter.gcs/types}WsTlcInfoResponseDto"/&gt;
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
    "tlcInfoResult"
})
@XmlRootElement(name = "tlcInfoResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class TlcInfoResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsTlcInfoResponseDto tlcInfoResult;

    /**
     * Gets the value of the tlcInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsTlcInfoResponseDto }
     *     
     */
    public WsTlcInfoResponseDto getTlcInfoResult() {
        return tlcInfoResult;
    }

    /**
     * Sets the value of the tlcInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsTlcInfoResponseDto }
     *     
     */
    public void setTlcInfoResult(WsTlcInfoResponseDto value) {
        this.tlcInfoResult = value;
    }

}
