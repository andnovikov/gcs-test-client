package ru.anovikov.test.testgcsadp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2019-12-01T01:35:31.427+03:00
 * Generated source version: 3.3.4
 *
 */
@WebService(targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", name = "InterGateIBankWs")
@XmlSeeAlso({ObjectFactory.class})
public interface InterGateIBankWs {

    @WebMethod(action = "urn:pmntEx")
    @RequestWrapper(localName = "pmntEx", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.PmntEx")
    @ResponseWrapper(localName = "pmntExResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.PmntExResponse")
    @WebResult(name = "pmntExResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsPmntExResponseDto pmntEx(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "pmntExtId", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntExtId,
        @WebParam(name = "pmntMode", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntMode,
        @WebParam(name = "pmntType", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntType,
        @WebParam(name = "pmntData", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntData,
        @WebParam(name = "amount", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger amount,
        @WebParam(name = "currency", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String currency,
        @WebParam(name = "params", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.util.List<ru.anovikov.test.testgcsadp.WsKeyPairDto> params
    );

    @WebMethod(action = "urn:transInfo")
    @RequestWrapper(localName = "transInfo", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.TransInfo")
    @ResponseWrapper(localName = "transInfoResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.TransInfoResponse")
    @WebResult(name = "transInfoResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsTransInfoResponseDto transInfo(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "fromDt", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        javax.xml.datatype.XMLGregorianCalendar fromDt,
        @WebParam(name = "toDt", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        javax.xml.datatype.XMLGregorianCalendar toDt,
        @WebParam(name = "searchType", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String searchType,
        @WebParam(name = "utrnNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger utrnNo,
        @WebParam(name = "count", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger count
    );

    @WebMethod(action = "urn:cardChgGeoRestriction")
    @RequestWrapper(localName = "cardChgGeoRestriction", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardChgGeoRestriction")
    @ResponseWrapper(localName = "cardChgGeoRestrictionResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardChgGeoRestrictionResponse")
    @WebResult(name = "cardChgGeoRestrictionResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsCardChgGeoRestrictionResponseDto cardChgGeoRestriction(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "internetOnly3DS", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String internetOnly3DS,
        @WebParam(name = "params", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.util.List<ru.anovikov.test.testgcsadp.WsCardRestrictionDto> params
    );

    @WebMethod(action = "urn:cardInfo")
    @RequestWrapper(localName = "cardInfo", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardInfo")
    @ResponseWrapper(localName = "cardInfoResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardInfoResponse")
    @WebResult(name = "cardInfoResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsCardInfoResponseDto cardInfo(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo
    );

    @WebMethod(action = "urn:cardInfoExt")
    @RequestWrapper(localName = "cardInfoExt", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardInfoExt")
    @ResponseWrapper(localName = "cardInfoExtResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardInfoExtResponse")
    @WebResult(name = "cardInfoExtResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsCardInfoExtResponseDto cardInfoExt(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo
    );

    @WebMethod(action = "urn:tlcInfo")
    @RequestWrapper(localName = "tlcInfo", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.TlcInfo")
    @ResponseWrapper(localName = "tlcInfoResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.TlcInfoResponse")
    @WebResult(name = "tlcInfoResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsTlcInfoResponseDto tlcInfo(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "address", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String address
    );

    @WebMethod(action = "urn:cardChgLmt")
    @RequestWrapper(localName = "cardChgLmt", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardChgLmt")
    @ResponseWrapper(localName = "cardChgLmtResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardChgLmtResponse")
    @WebResult(name = "cardChgLmtResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsCardChgLmtResponseDto cardChgLmt(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "source", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String source,
        @WebParam(name = "type", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String type,
        @WebParam(name = "cycleType", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String cycleType,
        @WebParam(name = "value", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger value,
        @WebParam(name = "currency", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String currency
    );

    @WebMethod(action = "urn:pmntCheck")
    @RequestWrapper(localName = "pmntCheck", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.PmntCheck")
    @ResponseWrapper(localName = "pmntCheckResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.PmntCheckResponse")
    @WebResult(name = "pmntCheckResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsPmntCheckResponseDto pmntCheck(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "pmntExtId", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntExtId,
        @WebParam(name = "pmntType", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntType,
        @WebParam(name = "pmntData", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntData,
        @WebParam(name = "amount", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger amount,
        @WebParam(name = "currency", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String currency
    );

    @WebMethod(action = "urn:pmnt")
    @RequestWrapper(localName = "pmnt", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.Pmnt")
    @ResponseWrapper(localName = "pmntResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.PmntResponse")
    @WebResult(name = "pmntResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsPmntResponseDto pmnt(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "pmntExtId", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntExtId,
        @WebParam(name = "pmntType", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntType,
        @WebParam(name = "pmntData", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntData,
        @WebParam(name = "amount", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger amount,
        @WebParam(name = "currency", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String currency
    );

    @WebMethod(action = "urn:holdInfo")
    @RequestWrapper(localName = "holdInfo", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.HoldInfo")
    @ResponseWrapper(localName = "holdInfoResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.HoldInfoResponse")
    @WebResult(name = "holdInfoResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsHoldInfoResponseDto holdInfo(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "fromDt", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        javax.xml.datatype.XMLGregorianCalendar fromDt,
        @WebParam(name = "toDt", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        javax.xml.datatype.XMLGregorianCalendar toDt,
        @WebParam(name = "searchType", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String searchType,
        @WebParam(name = "utrnNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger utrnNo,
        @WebParam(name = "count", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger count
    );

    @WebMethod(action = "urn:cardGeoRestrictionInfo")
    @RequestWrapper(localName = "cardGeoRestrictionInfo", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardGeoRestrictionInfo")
    @ResponseWrapper(localName = "cardGeoRestrictionInfoResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardGeoRestrictionInfoResponse")
    @WebResult(name = "cardGeoRestrictionInfoResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsCardGeoRestrictionInfoResponseDto cardGeoRestrictionInfo(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo
    );

    @WebMethod(action = "urn:cardBal")
    @RequestWrapper(localName = "cardBal", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardBal")
    @ResponseWrapper(localName = "cardBalResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardBalResponse")
    @WebResult(name = "cardBalResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsCardBalResponseDto cardBal(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo
    );

    @WebMethod(action = "urn:pmntRev")
    @RequestWrapper(localName = "pmntRev", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.PmntRev")
    @ResponseWrapper(localName = "pmntRevResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.PmntRevResponse")
    @WebResult(name = "pmntRevResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsPmntRevResponseDto pmntRev(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "pmntExtId", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntExtId,
        @WebParam(name = "pmntType", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntType,
        @WebParam(name = "pmntData", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String pmntData,
        @WebParam(name = "amount", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.math.BigInteger amount,
        @WebParam(name = "currency", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String currency
    );

    @WebMethod(action = "urn:cardChgStatus")
    @RequestWrapper(localName = "cardChgStatus", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardChgStatus")
    @ResponseWrapper(localName = "cardChgStatusResponse", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl", className = "ru.anovikov.test.testgcsadp.CardChgStatusResponse")
    @WebResult(name = "cardChgStatusResult", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
    public ru.anovikov.test.testgcsadp.WsCardChgStatusResponseDto cardChgStatus(

        @WebParam(name = "msgType", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgType,
        @WebParam(name = "msgData", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String msgData,
        @WebParam(name = "sign", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String sign,
        @WebParam(name = "extCode", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extCode,
        @WebParam(name = "extId", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String extId,
        @WebParam(name = "cardNo", targetNamespace = "http://ws.ibank.gate.inter.gcs/types")
        java.lang.String cardNo,
        @WebParam(name = "status", targetNamespace = "http://ws.ibank.gate.inter.gcs/wsdl")
        java.lang.String status
    );
}
