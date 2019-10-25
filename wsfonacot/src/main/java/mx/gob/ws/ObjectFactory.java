
package mx.gob.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarCurpDetalleResponse_QNAME = new QName("http://ws.gob.mx/", "consultarCurpDetalleResponse");
    private final static QName _ConsultarCurpDetalle_QNAME = new QName("http://ws.gob.mx/", "consultarCurpDetalle");
    private final static QName _ConsultarPorCurpResponse_QNAME = new QName("http://ws.gob.mx/", "consultarPorCurpResponse");
    private final static QName _ConsultarPorCurp_QNAME = new QName("http://ws.gob.mx/", "consultarPorCurp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCurpDetalle }
     * 
     */
    public ConsultarCurpDetalle createConsultarCurpDetalle() {
        return new ConsultarCurpDetalle();
    }

    /**
     * Create an instance of {@link ConsultarCurpDetalleResponse }
     * 
     */
    public ConsultarCurpDetalleResponse createConsultarCurpDetalleResponse() {
        return new ConsultarCurpDetalleResponse();
    }

    /**
     * Create an instance of {@link ConsultarPorCurp }
     * 
     */
    public ConsultarPorCurp createConsultarPorCurp() {
        return new ConsultarPorCurp();
    }

    /**
     * Create an instance of {@link ConsultarPorCurpResponse }
     * 
     */
    public ConsultarPorCurpResponse createConsultarPorCurpResponse() {
        return new ConsultarPorCurpResponse();
    }

    /**
     * Create an instance of {@link DatosConsultaDetalles }
     * 
     */
    public DatosConsultaDetalles createDatosConsultaDetalles() {
        return new DatosConsultaDetalles();
    }

    /**
     * Create an instance of {@link DatosConsultaCurp }
     * 
     */
    public DatosConsultaCurp createDatosConsultaCurp() {
        return new DatosConsultaCurp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCurpDetalleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gob.mx/", name = "consultarCurpDetalleResponse")
    public JAXBElement<ConsultarCurpDetalleResponse> createConsultarCurpDetalleResponse(ConsultarCurpDetalleResponse value) {
        return new JAXBElement<ConsultarCurpDetalleResponse>(_ConsultarCurpDetalleResponse_QNAME, ConsultarCurpDetalleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCurpDetalle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gob.mx/", name = "consultarCurpDetalle")
    public JAXBElement<ConsultarCurpDetalle> createConsultarCurpDetalle(ConsultarCurpDetalle value) {
        return new JAXBElement<ConsultarCurpDetalle>(_ConsultarCurpDetalle_QNAME, ConsultarCurpDetalle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorCurpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gob.mx/", name = "consultarPorCurpResponse")
    public JAXBElement<ConsultarPorCurpResponse> createConsultarPorCurpResponse(ConsultarPorCurpResponse value) {
        return new JAXBElement<ConsultarPorCurpResponse>(_ConsultarPorCurpResponse_QNAME, ConsultarPorCurpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorCurp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.gob.mx/", name = "consultarPorCurp")
    public JAXBElement<ConsultarPorCurp> createConsultarPorCurp(ConsultarPorCurp value) {
        return new JAXBElement<ConsultarPorCurp>(_ConsultarPorCurp_QNAME, ConsultarPorCurp.class, null, value);
    }

}
