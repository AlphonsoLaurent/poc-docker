package mx.gob.segob.dgti.ecurp.wserv.services;

import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceFeature;

//@WebServiceClient(name = "ConsultaCurpDetalleService", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", wsdlLocation = "file:/C:/tmp/ConsultaCurpDetalleService_wsdl.wsdl")
public class ConsultaCurpDetalleService
    extends Service
{
	
	public final static QName servicio = new QName ("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleService");
    private final static Logger logger = Logger.getLogger(mx.gob.segob.dgti.ecurp.wserv.services.ConsultaCurpDetalleService.class.getName());

    public ConsultaCurpDetalleService(URL wsdlLocation) {
        super(wsdlLocation,servicio);
    }
    
    public ConsultaCurpDetalleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsSoap11Endpoint")
    public ConsultaDetallePort getConsultaDetalleHttpsEndpoint() {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpsSoap11Endpoint"), ConsultaDetallePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpsSoap11Endpoint")
    public ConsultaDetallePort getConsultaDetalleHttpsEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpsSoap11Endpoint"), ConsultaDetallePort.class, features);
    }

    /**
     * 
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpSoap11Endpoint")
    public ConsultaDetallePort getConsultaDetalleHttpEndpoint() {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpSoap11Endpoint"), ConsultaDetallePort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCurpDetalleServicePortType
     */
    @WebEndpoint(name = "ConsultaCurpDetalleServiceHttpSoap11Endpoint")
    public ConsultaDetallePort getConsultaDetalleHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "ConsultaCurpDetalleServiceHttpSoap11Endpoint"), ConsultaDetallePort.class, features);
    }

}
