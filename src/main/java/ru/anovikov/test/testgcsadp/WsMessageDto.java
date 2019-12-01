
package ru.anovikov.test.testgcsadp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsMessageDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsMessageDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msgType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sign" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsMessageDto", propOrder = {
    "msgType",
    "msgData",
    "sign",
    "extCode",
    "extId"
})
@XmlSeeAlso({
    WsResponseDto.class,
    WsRequestDto.class
})
public class WsMessageDto {

    @XmlElement(required = true)
    protected String msgType;
    @XmlElement(required = true)
    protected String msgData;
    @XmlElement(required = true)
    protected String sign;
    @XmlElement(required = true)
    protected String extCode;
    @XmlElement(required = true)
    protected String extId;

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the msgData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgData() {
        return msgData;
    }

    /**
     * Sets the value of the msgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgData(String value) {
        this.msgData = value;
    }

    /**
     * Gets the value of the sign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSign(String value) {
        this.sign = value;
    }

    /**
     * Gets the value of the extCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtCode() {
        return extCode;
    }

    /**
     * Sets the value of the extCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtCode(String value) {
        this.extCode = value;
    }

    /**
     * Gets the value of the extId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtId(String value) {
        this.extId = value;
    }

}
