
package ru.anovikov.test.testgcsadp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsTlcCardDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsTlcCardDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameIn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tlcSystem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="services" type="{http://ws.ibank.gate.inter.gcs/types}WsTlcCardServiceDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsTlcCardDto", propOrder = {
    "pan",
    "nameIn",
    "nameOut",
    "status",
    "tlcSystem",
    "address",
    "services"
})
public class WsTlcCardDto {

    @XmlElement(required = true)
    protected String pan;
    @XmlElement(required = true)
    protected String nameIn;
    @XmlElement(required = true)
    protected String nameOut;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String tlcSystem;
    @XmlElement(required = true)
    protected String address;
    protected List<WsTlcCardServiceDto> services;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the nameIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameIn() {
        return nameIn;
    }

    /**
     * Sets the value of the nameIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameIn(String value) {
        this.nameIn = value;
    }

    /**
     * Gets the value of the nameOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOut() {
        return nameOut;
    }

    /**
     * Sets the value of the nameOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOut(String value) {
        this.nameOut = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tlcSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlcSystem() {
        return tlcSystem;
    }

    /**
     * Sets the value of the tlcSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlcSystem(String value) {
        this.tlcSystem = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsTlcCardServiceDto }
     * 
     * 
     */
    public List<WsTlcCardServiceDto> getServices() {
        if (services == null) {
            services = new ArrayList<WsTlcCardServiceDto>();
        }
        return this.services;
    }

}
