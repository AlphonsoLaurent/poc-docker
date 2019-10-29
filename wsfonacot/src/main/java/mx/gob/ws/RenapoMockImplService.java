
package mx.gob.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RenapoMockImplService", targetNamespace = "http://ws.gob.mx/", wsdlLocation = "http://localhost:8091/renapo-services?wsdl")
public class RenapoMockImplService
    extends Service
{

    private final static URL RENAPOMOCKIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException RENAPOMOCKIMPLSERVICE_EXCEPTION;
    private final static QName RENAPOMOCKIMPLSERVICE_QNAME = new QName("http://ws.gob.mx/", "RenapoMockImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8091/renapo-services?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RENAPOMOCKIMPLSERVICE_WSDL_LOCATION = url;
        RENAPOMOCKIMPLSERVICE_EXCEPTION = e;
    }

    public RenapoMockImplService() {
        super(__getWsdlLocation(), RENAPOMOCKIMPLSERVICE_QNAME);
    }

    public RenapoMockImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RENAPOMOCKIMPLSERVICE_QNAME, features);
    }

    public RenapoMockImplService(URL wsdlLocation) {
        super(wsdlLocation, RENAPOMOCKIMPLSERVICE_QNAME);
    }

    public RenapoMockImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RENAPOMOCKIMPLSERVICE_QNAME, features);
    }

    public RenapoMockImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RenapoMockImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RenapoMock
     */
    @WebEndpoint(name = "RenapoMockImplPort")
    public RenapoMock getRenapoMockImplPort() {
        return super.getPort(new QName("http://ws.gob.mx/", "RenapoMockImplPort"), RenapoMock.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RenapoMock
     */
    @WebEndpoint(name = "RenapoMockImplPort")
    public RenapoMock getRenapoMockImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.gob.mx/", "RenapoMockImplPort"), RenapoMock.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RENAPOMOCKIMPLSERVICE_EXCEPTION!= null) {
            throw RENAPOMOCKIMPLSERVICE_EXCEPTION;
        }
        return RENAPOMOCKIMPLSERVICE_WSDL_LOCATION;
    }

}