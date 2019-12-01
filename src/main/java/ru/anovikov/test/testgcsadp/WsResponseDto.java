
package ru.anovikov.test.testgcsadp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WsResponseDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsResponseDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.ibank.gate.inter.gcs/types}WsMessageDto"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsResponseDto", propOrder = {
    "id",
    "resp",
    "respCode",
    "respDesc"
})
@XmlSeeAlso({
    WsCardInfoResponseDto.class,
    WsCardBalResponseDto.class,
    WsTlcInfoResponseDto.class,
    WsHoldInfoResponseDto.class,
    WsTransInfoResponseDto.class,
    WsPmntCheckResponseDto.class,
    WsPmntResponseDto.class,
    WsPmntRevResponseDto.class,
    WsPmntExResponseDto.class,
    WsCardChgStatusResponseDto.class,
    WsCardChgLmtResponseDto.class,
    WsCardInfoExtResponseDto.class,
    WsCardGeoRestrictionInfoResponseDto.class,
    WsCardChgGeoRestrictionResponseDto.class
})
public class WsResponseDto
    extends WsMessageDto
{

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String resp;
    @XmlElement(required = true)
    protected String respCode;
    @XmlElement(required = true)
    protected String respDesc;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the resp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResp() {
        return resp;
    }

    /**
     * Sets the value of the resp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResp(String value) {
        this.resp = value;
    }

    /**
     * Gets the value of the respCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * Sets the value of the respCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCode(String value) {
        this.respCode = value;
    }

    /**
     * Gets the value of the respDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespDesc() {
        return respDesc;
    }

    /**
     * Sets the value of the respDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespDesc(String value) {
        this.respDesc = value;
    }

}
