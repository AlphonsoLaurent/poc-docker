
package mx.gob.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosConsultaDetalles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
@XmlType(name = "DatosConsultaDetalles", propOrder = {
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

    protected String cveAlfaEntFedNac;
    protected String cveEntidadEmisora;
    protected String cveUsuario;
    protected String direccionIp;
    protected String fechaNacimiento;
    protected String nombre;
    protected String password;
    protected String primerApellido;
    protected String segundoApellido;
    protected String sexo;
    protected Integer tipoTransaccion;

    /**
     * Obtiene el valor de la propiedad cveAlfaEntFedNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveAlfaEntFedNac() {
        return cveAlfaEntFedNac;
    }

    /**
     * Define el valor de la propiedad cveAlfaEntFedNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveAlfaEntFedNac(String value) {
        this.cveAlfaEntFedNac = value;
    }

    /**
     * Obtiene el valor de la propiedad cveEntidadEmisora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveEntidadEmisora() {
        return cveEntidadEmisora;
    }

    /**
     * Define el valor de la propiedad cveEntidadEmisora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveEntidadEmisora(String value) {
        this.cveEntidadEmisora = value;
    }

    /**
     * Obtiene el valor de la propiedad cveUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCveUsuario() {
        return cveUsuario;
    }

    /**
     * Define el valor de la propiedad cveUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCveUsuario(String value) {
        this.cveUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionIp() {
        return direccionIp;
    }

    /**
     * Define el valor de la propiedad direccionIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionIp(String value) {
        this.direccionIp = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccion.
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
     * Define el valor de la propiedad tipoTransaccion.
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
