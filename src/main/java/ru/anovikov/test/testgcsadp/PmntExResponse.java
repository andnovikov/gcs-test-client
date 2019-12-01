
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
 *         &lt;element name="pmntExResult" type="{http://ws.ibank.gate.inter.gcs/types}WsPmntExResponseDto"/&gt;
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
    "pmntExResult"
})
@XmlRootElement(name = "pmntExResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class PmntExResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsPmntExResponseDto pmntExResult;

    /**
     * Gets the value of the pmntExResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsPmntExResponseDto }
     *     
     */
    public WsPmntExResponseDto getPmntExResult() {
        return pmntExResult;
    }

    /**
     * Sets the value of the pmntExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPmntExResponseDto }
     *     
     */
    public void setPmntExResult(WsPmntExResponseDto value) {
        this.pmntExResult = value;
    }

}
