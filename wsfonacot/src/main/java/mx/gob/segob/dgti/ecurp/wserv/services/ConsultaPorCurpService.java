package mx.gob.segob.dgti.ecurp.wserv.services;

import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceFeature;

//@WebServiceClient(name = "ConsultaPorCurpService", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", wsdlLocation = "file:/C:/tmp/ConsultaPorCurpService_wsdl.wsdl")
public class ConsultaPorCurpService
    extends Service
{

   // private final static URL CONSULTAPORCURPSERVICE_WSDL_LOCATION;
   // private final static Logger logger = Logger.getLogger(mx.gob.segob.dgti.ecurp.wserv.services.ConsultaPorCurpService.class.getName());

	public final static QName servicio = new QName ("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaPorCurpService");
	
    private final static Logger logger = Logger.getLogger(mx.gob.segob.dgti.ecurp.wserv.services.ConsultaPorCurpService.class.getName());

    
    
    
//    static {
//        URL url = null;
//        try {
//            URL baseUrl;
//            baseUrl = mx.gob.segob.dgti.ecurp.wserv.services.ConsultaPorCurpService.class.getResource(".");
//            url = new URL(baseUrl, "file:/C:/tmp/ConsultaPorCurpService_wsdl.wsdl");
//        } catch (MalformedURLException e) {
//            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/tmp/ConsultaPorCurpService_wsdl.wsdl', retrying as a local file");
//            logger.warning(e.getMessage());
//        }
//        CONSULTAPORCURPSERVICE_WSDL_LOCATION = url;
//    }

    public ConsultaPorCurpService(URL wsdlLocation) {
        super(wsdlLocation,servicio);
    }

    public ConsultaPorCurpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ConsultaPorCurpServicePortType
     */
    @WebEndpoint(name = "ConsultaPorCurpServiceHttpSoap11Endpoint")
    public ConsultaPorCurpServicePortType getConsultaPorCurpServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaPorCurpServiceHttpSoap11Endpoint"), ConsultaPorCurpServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaPorCurpServicePortType
     */
    @WebEndpoint(name = "ConsultaPorCurpServiceHttpSoap11Endpoint")
    public ConsultaPorCurpServicePortType getConsultaPorCurpServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaPorCurpServiceHttpSoap11Endpoint"), ConsultaPorCurpServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns ConsultaPorCurpServicePortType
     */
    @WebEndpoint(name = "ConsultaPorCurpServiceHttpsSoap11Endpoint")
    public ConsultaPorCurpServicePortType getConsultaPorCurpServiceHttpsSoap11Endpoint() {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaPorCurpServiceHttpsSoap11Endpoint"), ConsultaPorCurpServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaPorCurpServicePortType
     */
    @WebEndpoint(name = "ConsultaPorCurpServiceHttpsSoap11Endpoint")
    public ConsultaPorCurpServicePortType getConsultaPorCurpServiceHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaPorCurpServiceHttpsSoap11Endpoint"), ConsultaPorCurpServicePortType.class, features);
    }

}
