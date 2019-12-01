
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
 *         &lt;element name="pmntRevResult" type="{http://ws.ibank.gate.inter.gcs/types}WsPmntRevResponseDto"/&gt;
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
    "pmntRevResult"
})
@XmlRootElement(name = "pmntRevResponse", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class PmntRevResponse {

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected WsPmntRevResponseDto pmntRevResult;

    /**
     * Gets the value of the pmntRevResult property.
     * 
     * @return
     *     possible object is
     *     {@link WsPmntRevResponseDto }
     *     
     */
    public WsPmntRevResponseDto getPmntRevResult() {
        return pmntRevResult;
    }

    /**
     * Sets the value of the pmntRevResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPmntRevResponseDto }
     *     
     */
    public void setPmntRevResult(WsPmntRevResponseDto value) {
        this.pmntRevResult = value;
    }

}
