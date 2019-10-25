
package mx.gob.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarPorCurp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarPorCurp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curp" type="{http://ws.gob.mx/}DatosConsultaCurp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPorCurp", propOrder = {
    "curp"
})
public class ConsultarPorCurp {

    protected DatosConsultaCurp curp;

    /**
     * Obtiene el valor de la propiedad curp.
     * 
     * @return
     *     possible object is
     *     {@link DatosConsultaCurp }
     *     
     */
    public DatosConsultaCurp getCurp() {
        return curp;
    }

    /**
     * Define el valor de la propiedad curp.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosConsultaCurp }
     *     
     */
    public void setCurp(DatosConsultaCurp value) {
        this.curp = value;
    }

}
