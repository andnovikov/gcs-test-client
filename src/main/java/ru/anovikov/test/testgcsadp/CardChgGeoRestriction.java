
package ru.anovikov.test.testgcsadp;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsRequestDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internetOnly3DS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="params" type="{http://ws.ibank.gate.inter.gcs/types}WsCardRestrictionDto" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "internetOnly3DS",
    "params"
})
@XmlRootElement(name = "cardChgGeoRestriction", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class CardChgGeoRestriction
    extends WsRequestDto
{

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String internetOnly3DS;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected List<WsCardRestrictionDto> params;

    /**
     * Gets the value of the internetOnly3DS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetOnly3DS() {
        return internetOnly3DS;
    }

    /**
     * Sets the value of the internetOnly3DS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetOnly3DS(String value) {
        this.internetOnly3DS = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsCardRestrictionDto }
     * 
     * 
     */
    public List<WsCardRestrictionDto> getParams() {
        if (params == null) {
            params = new ArrayList<WsCardRestrictionDto>();
        }
        return this.params;
    }

}
