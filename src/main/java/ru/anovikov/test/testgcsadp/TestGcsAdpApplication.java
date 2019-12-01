package ru.anovikov.test.testgcsadp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import sun.awt.windows.WPrinterJob;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.soap.*;
import java.util.UUID;

//@SpringBootApplication
public class TestGcsAdpApplication {

	public static void main(String[] args) throws JAXBException, SOAPException {
		// ApplicationContext context = SpringApplication.run(TestGcsAdpApplication.class, args);

		String soapEndpointUrl = "http://localhost:8080/WebServiceProject/services/inter-gate-ibank-ws";
		String soapAction = "urn:cardBal";
		CardBal request = new CardBal();
		request.setMsgType("cardBal");
		request.setSign("8888888");
		request.setExtCode(UUID.randomUUID().toString());
		request.setExtId("565");
		request.setCardNo("1234123456785678");

		SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory(
				MessageFactory.newInstance());
		messageFactory.afterPropertiesSet();

		JAXBContext jaxbContext = JAXBContext.newInstance(CardBal.class);
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(CardBal.class, CardBalResponse.class);

		WebServiceTemplate webServiceTemplate = new WebServiceTemplate(
				messageFactory);
		webServiceTemplate.setMarshaller(marshaller);
		webServiceTemplate.setUnmarshaller(marshaller);
		webServiceTemplate.afterPropertiesSet();

		CardBalResponse response = (CardBalResponse) webServiceTemplate
				.marshalSendAndReceive(
						soapEndpointUrl, request,
		new SoapActionCallback(soapAction));

		System.out.println(response.getCardBalResult().getData().getActBal());
	}
}
