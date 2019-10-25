package mx.gob.segob.dgti.ecurp.wserv.services.xsd;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.gob.segob.dgti.ecurp.wserv.services.xsd package. 
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

    private final static QName _DatosConsultaDetallesCveUsuario_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "cveUsuario");
    private final static QName _DatosConsultaDetallesCveAlfaEntFedNac_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "cveAlfaEntFedNac");
    private final static QName _DatosConsultaDetallesSexo_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "sexo");
    private final static QName _DatosConsultaDetallesNombre_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "nombre");
    private final static QName _DatosConsultaDetallesPassword_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "password");
    private final static QName _DatosConsultaDetallesCveEntEm_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "cveEntidadEmisora");
    private final static QName _DatosConsultaDetallesSegundoApellido_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "segundoApellido");
    private final static QName _DatosConsultaDetallesDireccionIp_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "direccionIp");
    private final static QName _DatosConsultaDetallesFechaNacimiento_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "fechaNacimiento");
    private final static QName _DatosConsultaDetallesPrimerApellido_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "primerApellido");

    
    private final static QName _DatosConsultaCurpUsuario_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "usuario");
    private final static QName _DatosConsultaCurpPassword_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "password");
    private final static QName _DatosConsultaCurpCveEntidadEmisora_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "cveEntidadEmisora");
    private final static QName _DatosConsultaCurpDireccionIp_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "direccionIp");
    private final static QName _DatosConsultaCurpCveCurp_QNAME = new QName("http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", "cveCurp");
    
    
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.gob.segob.dgti.ecurp.wserv.services.xsd
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "usuario", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpUsuario(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpUsuario_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "password", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpPassword(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpPassword_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "cveEntidadEmisora", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpCveEntidadEmisora(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpCveEntidadEmisora_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "direccionIp", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpDireccionIp(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpDireccionIp_QNAME, String.class, DatosConsultaCurp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "cveCurp", scope = DatosConsultaCurp.class)
    public JAXBElement<String> createDatosConsultaCurpCveCurp(String value) {
        return new JAXBElement<String>(_DatosConsultaCurpCveCurp_QNAME, String.class, DatosConsultaCurp.class, value);
    } 
    
    
    
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "cveUsuario", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesCveUsuario(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesCveUsuario_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "cveAlfaEntFedNac", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesCveAlfaEntFedNac(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesCveAlfaEntFedNac_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "sexo", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesSexo(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesSexo_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "nombre", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesNombre(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesNombre_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "password", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesPassword(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesPassword_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "cveEntidadEmisora", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesCveEntidadEmisora(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesCveEntEm_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "segundoApellido", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesSegundoApellido(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesSegundoApellido_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "direccionIp", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesDireccionIp(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesDireccionIp_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "fechaNacimiento", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesFechaNacimiento(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesFechaNacimiento_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", name = "primerApellido", scope = DatosConsultaDetalles.class)
    public JAXBElement<String> createDatosConsultaDetallesPrimerApellido(String value) {
        return new JAXBElement<String>(_DatosConsultaDetallesPrimerApellido_QNAME, String.class, DatosConsultaDetalles.class, value);
    }

}
