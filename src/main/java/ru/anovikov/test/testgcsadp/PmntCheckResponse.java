
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
 *         &lt;element name="pmntCheckResult" type="{http://ws.ibank.gate.inter.gcs/types}WsPmntCheckResponseDto"/&gt;
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
    "pmntCheckResult"
})
@XmlRootElement(name = "pmntCheckResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class PmntCheckResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsPmntCheckResponseDto pmntCheckResult;

    /**
     * Gets the value of the pmntCheckResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsPmntCheckResponseDto }
     *     
     */
    public WsPmntCheckResponseDto getPmntCheckResult() {
        return pmntCheckResult;
    }

    /**
     * Sets the value of the pmntCheckResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPmntCheckResponseDto }
     *     
     */
    public void setPmntCheckResult(WsPmntCheckResponseDto value) {
        this.pmntCheckResult = value;
    }

}
