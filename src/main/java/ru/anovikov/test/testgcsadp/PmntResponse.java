
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
 *         &lt;element name="pmntResult" type="{http://ws.ibank.gate.inter.gcs/types}WsPmntResponseDto"/&gt;
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
    "pmntResult"
})
@XmlRootElement(name = "pmntResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class PmntResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsPmntResponseDto pmntResult;

    /**
     * Gets the value of the pmntResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsPmntResponseDto }
     *     
     */
    public WsPmntResponseDto getPmntResult() {
        return pmntResult;
    }

    /**
     * Sets the value of the pmntResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPmntResponseDto }
     *     
     */
    public void setPmntResult(WsPmntResponseDto value) {
        this.pmntResult = value;
    }

}
