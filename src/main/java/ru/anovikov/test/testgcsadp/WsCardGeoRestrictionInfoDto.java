
package ru.anovikov.test.testgcsadp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsCardGeoRestrictionInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsCardGeoRestrictionInfoDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsResponseDataDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internetOnly3DS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="regionList" type="{http://ws.ibank.gate.inter.gcs/types}WsKeyPairDto" maxOccurs="unbounded"/&gt;
 *         &lt;element name="categoryList" type="{http://ws.ibank.gate.inter.gcs/types}WsKeyPairDto" maxOccurs="unbounded"/&gt;
 *         &lt;element name="countryList" type="{http://ws.ibank.gate.inter.gcs/types}WsKeyPairDto" maxOccurs="unbounded"/&gt;
 *         &lt;element name="restriction" type="{http://ws.ibank.gate.inter.gcs/types}WsCardRestrictionDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsCardGeoRestrictionInfoDto", propOrder = {
    "internetOnly3DS",
    "regionList",
    "categoryList",
    "countryList",
    "restriction"
})
public class WsCardGeoRestrictionInfoDto
    extends WsResponseDataDto
{

    @XmlElement(required = true)
    protected String internetOnly3DS;
    @XmlElement(required = true)
    protected List<WsKeyPairDto> regionList;
    @XmlElement(required = true)
    protected List<WsKeyPairDto> categoryList;
    @XmlElement(required = true)
    protected List<WsKeyPairDto> countryList;
    protected List<WsCardRestrictionDto> restriction;

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
     * Gets the value of the regionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsKeyPairDto }
     * 
     * 
     */
    public List<WsKeyPairDto> getRegionList() {
        if (regionList == null) {
            regionList = new ArrayList<WsKeyPairDto>();
        }
        return this.regionList;
    }

    /**
     * Gets the value of the categoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsKeyPairDto }
     * 
     * 
     */
    public List<WsKeyPairDto> getCategoryList() {
        if (categoryList == null) {
            categoryList = new ArrayList<WsKeyPairDto>();
        }
        return this.categoryList;
    }

    /**
     * Gets the value of the countryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsKeyPairDto }
     * 
     * 
     */
    public List<WsKeyPairDto> getCountryList() {
        if (countryList == null) {
            countryList = new ArrayList<WsKeyPairDto>();
        }
        return this.countryList;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsCardRestrictionDto }
     * 
     * 
     */
    public List<WsCardRestrictionDto> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<WsCardRestrictionDto>();
        }
        return this.restriction;
    }

}
