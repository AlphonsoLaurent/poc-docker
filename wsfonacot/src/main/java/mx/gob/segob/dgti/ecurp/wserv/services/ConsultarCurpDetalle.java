package mx.gob.segob.dgti.ecurp.wserv.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import mx.gob.segob.dgti.ecurp.wserv.services.xsd.DatosConsultaDetalles;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datos" type="{http://services.wserv.ecurp.dgti.segob.gob.mx/xsd}DatosConsultaDetalles" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datos"
})
@XmlRootElement(name = "consultarCurpDetalle")
public class ConsultarCurpDetalle {

    @XmlElementRef(name = "datos", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", type = JAXBElement.class)
    protected JAXBElement<DatosConsultaDetalles> datos;

    /**
     * Gets the value of the datos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosConsultaDetalles }{@code >}
     *     
     */
    public JAXBElement<DatosConsultaDetalles> getDatos() {
        return datos;
    }

    /**
     * Sets the value of the datos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosConsultaDetalles }{@code >}
     *     
     */
    public void setDatos(JAXBElement<DatosConsultaDetalles> value) {
        this.datos = ((JAXBElement<DatosConsultaDetalles> ) value);
    }

}
