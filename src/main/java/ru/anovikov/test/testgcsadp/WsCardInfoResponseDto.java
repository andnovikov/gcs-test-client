
package ru.anovikov.test.testgcsadp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsCardInfoResponseDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsCardInfoResponseDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsResponseDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://ws.ibank.gate.inter.gcs/types}WsCardInfoDto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsCardInfoResponseDto", propOrder = {
    "data"
})
public class WsCardInfoResponseDto
    extends WsResponseDto
{

    @XmlElement(required = true)
    protected WsCardInfoDto data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link WsCardInfoDto }
     *     
     */
    public WsCardInfoDto getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCardInfoDto }
     *     
     */
    public void setData(WsCardInfoDto value) {
        this.data = value;
    }

}
