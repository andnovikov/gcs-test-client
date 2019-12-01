
package ru.anovikov.test.testgcsadp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsHoldInfoResponseDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsHoldInfoResponseDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsResponseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://ws.ibank.gate.inter.gcs/types}WsHoldInfoDto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsHoldInfoResponseDto", propOrder = {
    "data"
})
public class WsHoldInfoResponseDto
    extends WsResponseDto
{

    @XmlElement(required = true)
    protected WsHoldInfoDto data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link WsHoldInfoDto }
     *     
     */
    public WsHoldInfoDto getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsHoldInfoDto }
     *     
     */
    public void setData(WsHoldInfoDto value) {
        this.data = value;
    }

}
