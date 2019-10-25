package mx.gob.segob.dgti.ecurp.wserv.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import mx.gob.segob.dgti.ecurp.wserv.services.xsd.DatosConsultaCurp;
import mx.gob.segob.dgti.ecurp.wserv.services.xsd.DatosConsultaDetalles;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.segob.dgti.ecurp.wserv.services package. 
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

    private final static QName _ConsultarCurpDetalleDatos_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "datos");
    private final static QName _ConsultarCurpDetalleResponseReturn_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "return");
    private final static QName _ConsultarPorCurpDatos_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "datos");
    private final static QName _ConsultarPorCurpResponseReturn_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "return");
    private final static QName _GetConfirmSessionID_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "sessionID");
    private final static QName _GetConfirmMssg_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx", "Mssg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.segob.dgti.ecurp.wserv.services
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
     * Create an instance of {@link ConsultarPorCurp }
     * 
     */
    public ConsultarPorCurp createConsultarPorCurp() {
        return new ConsultarPorCurp();
    }    

    /**
     * Create an instance of {@link ConsultarCurpDetalleResponse }
     * 
     */
    public ConsultarCurpDetalleResponse createConsultarCurpDetalleResponse() {
        return new ConsultarCurpDetalleResponse();
    }
    
    /**
     * Create an instance of {@link ConsultarPorCurpResponse }
     * 
     */
    public ConsultarPorCurpResponse createConsultarPorCurpResponse() {
        return new ConsultarPorCurpResponse();
    }

    /**
     * Create an instance of {@link GetConfirm }
     * 
     */
    public GetConfirm createGetConfirm() {
        return new GetConfirm();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConsultaDetalles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "datos", scope = ConsultarCurpDetalle.class)
    public JAXBElement<DatosConsultaDetalles> createConsultarCurpDetalleDatos(DatosConsultaDetalles value) {
        return new JAXBElement<DatosConsultaDetalles>(_ConsultarCurpDetalleDatos_QNAME, DatosConsultaDetalles.class, ConsultarCurpDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "return", scope = ConsultarCurpDetalleResponse.class)
    public JAXBElement<String> createConsultarCurpDetalleResponseReturn(String value) {
        return new JAXBElement<String>(_ConsultarCurpDetalleResponseReturn_QNAME, String.class, ConsultarCurpDetalleResponse.class, value);
    }

    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosConsultaDetalles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "datos", scope = ConsultarPorCurp.class)
    public JAXBElement<DatosConsultaCurp> createConsultarPorCurpDatos(DatosConsultaCurp value) {
        return new JAXBElement<DatosConsultaCurp>(_ConsultarPorCurpDatos_QNAME, DatosConsultaCurp.class, ConsultarPorCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "return", scope = ConsultarPorCurpResponse.class)
    public JAXBElement<String> createConsultarPorCurpResponseReturn(String value) {
        return new JAXBElement<String>(_ConsultarPorCurpResponseReturn_QNAME, String.class, ConsultarPorCurpResponse.class, value);
    }    
    
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "sessionID", scope = GetConfirm.class)
    public JAXBElement<String> createGetConfirmSessionID(String value) {
        return new JAXBElement<String>(_GetConfirmSessionID_QNAME, String.class, GetConfirm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", name = "Mssg", scope = GetConfirm.class)
    public JAXBElement<String> createGetConfirmMssg(String value) {
        return new JAXBElement<String>(_GetConfirmMssg_QNAME, String.class, GetConfirm.class, value);
    }

}
