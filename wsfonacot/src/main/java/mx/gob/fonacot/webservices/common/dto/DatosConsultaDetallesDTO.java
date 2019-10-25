package mx.gob.fonacot.webservices.common.dto; 

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "datosPersona")
public class DatosConsultaDetallesDTO {

    @XmlElement(required = true, name = "nombre")
    private String nombre;
    @XmlElement(required = true, name = "apellidoPaterno")
    private String apellidoPaterno;
    @XmlElement(required = true, name = "apellidoMaterno")
    private String apellidoMaterno;
    @XmlElement(required = true, name = "genero")
    private String sexo;
    @XmlElement(required = true, name = "entidadNacimiento")
    private String cveAlfaEntFedNac;
    @XmlElement(required = true, name = "fechaNacimiento")
    private String fechaNacimiento;

    public String getCveAlfaEntFedNac() {
        return cveAlfaEntFedNac;
    }

    public void setCveAlfaEntFedNac(String cveAlfaEntFedNac) {
        this.cveAlfaEntFedNac = cveAlfaEntFedNac;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "DatosConsultaDetallesVO{" + "cveAlfaEntFedNac=" + cveAlfaEntFedNac + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", sexo=" + sexo + '}';
    }

}
