
package ru.anovikov.test.testgcsadp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="fromDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="toDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="searchType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="utrnNo" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    "fromDt",
    "toDt",
    "searchType",
    "utrnNo",
    "count"
})
@XmlRootElement(name = "holdInfo", namespace = "http://ws.ibank.gate.inter.gcs/wsdl")
public class HoldInfo
    extends WsRequestDto
{

    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDt;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDt;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected String searchType;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected BigInteger utrnNo;
    @XmlElement(namespace = "http://ws.ibank.gate.inter.gcs/wsdl", required = true)
    protected BigInteger count;

    /**
     * Gets the value of the fromDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDt() {
        return fromDt;
    }

    /**
     * Sets the value of the fromDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDt(XMLGregorianCalendar value) {
        this.fromDt = value;
    }

    /**
     * Gets the value of the toDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDt() {
        return toDt;
    }

    /**
     * Sets the value of the toDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDt(XMLGregorianCalendar value) {
        this.toDt = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the utrnNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUtrnNo() {
        return utrnNo;
    }

    /**
     * Sets the value of the utrnNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUtrnNo(BigInteger value) {
        this.utrnNo = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

}
