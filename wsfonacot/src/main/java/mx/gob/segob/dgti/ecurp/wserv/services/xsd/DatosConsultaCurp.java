package mx.gob.segob.dgti.ecurp.wserv.services.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosConsultaCurp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosConsultaCurp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cveCurp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cveEntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosConsultaCurp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", propOrder = {
    "cveCurp",
    "cveEntidadEmisora",
    "direccionIp",
    "password",
    "tipoTransaccion",
    "usuario"
})
public class DatosConsultaCurp {

    @XmlElementRef(name = "cveCurp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveCurp;
    @XmlElementRef(name = "cveEntidadEmisora", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> cveEntidadEmisora;
    @XmlElementRef(name = "direccionIp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> direccionIp;
    @XmlElementRef(name = "password", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> password;
    protected Integer tipoTransaccion;
    @XmlElementRef(name = "usuario", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd", type = JAXBElement.class)
    protected JAXBElement<String> usuario;

    /**
     * Gets the value of the cveCurp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCveCurp() {
        return cveCurp;
    }

    /**
     * Sets the value of the cveCurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCveCurp(JAXBElement<String> value) {
        this.cveCurp = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<String> value) {
        this.usuario = ((JAXBElement<String> ) value);
    }

}
