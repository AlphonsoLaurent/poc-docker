package mx.gob.segob.dgti.ecurp.wserv.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosConsultaDetalles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosConsultaDetalles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveAlfaEntFedNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosConsultaDetalles", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", propOrder = {
    "cveAlfaEntFedNac",
    "cveEntidadEmisora",
    "cveUsuario",
    "direccionIp",
    "fechaNacimiento",
    "nombre",
    "password",
    "primerApellido",
    "segundoApellido",
    "sexo",
    "tipoTransaccion"
})
public class DatosConsultaDetalles {

    @XmlElementRef(name = "cveAlfaEntFedNac", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveAlfaEntFedNac;
    @XmlElementRef(name = "cveEntidadEmisora", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveEntidadEmisora;
    @XmlElementRef(name = "cveUsuario", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveUsuario;
    @XmlElementRef(name = "direccionIp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> direccionIp;
    @XmlElementRef(name = "fechaNacimiento", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> fechaNacimiento;
    @XmlElementRef(name = "nombre", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "password", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "primerApellido", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> primerApellido;
    @XmlElementRef(name = "segundoApellido", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> segundoApellido;
    @XmlElementRef(name = "sexo", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> sexo;
    protected Integer tipoTransaccion;

    /**
     * Gets the value of the cveAlfaEntFedNac property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveAlfaEntFedNac() {
        return cveAlfaEntFedNac;
    }

    /**
     * Sets the value of the cveAlfaEntFedNac property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveAlfaEntFedNac(JAXBElement<String> value) {
        this.cveAlfaEntFedNac = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cveEntidadEmisora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveEntidadEmisora() {
        return cveEntidadEmisora;
    }

    /**
     * Sets the value of the cveEntidadEmisora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveEntidadEmisora(JAXBElement<String> value) {
        this.cveEntidadEmisora = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cveUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveUsuario() {
        return cveUsuario;
    }

    /**
     * Sets the value of the cveUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveUsuario(JAXBElement<String> value) {
        this.cveUsuario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the direccionIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionIp() {
        return direccionIp;
    }

    /**
     * Sets the value of the direccionIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionIp(JAXBElement<String> value) {
        this.direccionIp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaNacimiento(JAXBElement<String> value) {
        this.fechaNacimiento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primerApellido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Sets the value of the primerApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerApellido(JAXBElement<String> value) {
        this.primerApellido = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the segundoApellido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Sets the value of the segundoApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellido(JAXBElement<String> value) {
        this.segundoApellido = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexo(JAXBElement<String> value) {
        this.sexo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoTransaccion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Sets the value of the tipoTransaccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoTransaccion(Integer value) {
        this.tipoTransaccion = value;
    }

}
