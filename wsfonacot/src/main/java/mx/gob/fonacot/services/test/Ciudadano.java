package mx.gob.fonacot.services.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

//import mx.gob.ventanillaunica.www.common.domain.constant.TipoDocumentoComprobatorio;

//import com.softtek.model.BaseSerializableModel;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ciudadano", propOrder = {"curp", "nombre", "apellidoPaterno", "apellidoMaterno", 
        "sexo", "fechaNacimiento", "claveEntidadNacimiento", "clavePaisNacimiento", 
        "documentoProbatorio"})
public class Ciudadano extends BaseSerializableModel {

    private static final long serialVersionUID = 6403633745585660580L;
    @XmlElement(required = true)
    private String curp;
    @XmlElement(required = true)
    private String nombre;
    @XmlElement(required = true)
    private String apellidoPaterno;
    @XmlElement(required = true)
    private String apellidoMaterno;
    @XmlElement(required = true)
    private String sexo;
    @XmlElement(required = true)
    private String fechaNacimiento;
    @XmlElement(required = true)
    private String claveEntidadNacimiento;
    @XmlElement(required = true)
    private String clavePaisNacimiento;
    @XmlElement(required = true)
    private TipoDocumentoComprobatorio documentoProbatorio;
    
    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
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
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getClaveEntidadNacimiento() {
        return claveEntidadNacimiento;
    }
    public void setClaveEntidadNacimiento(String claveEntidadNacimiento) {
        this.claveEntidadNacimiento = claveEntidadNacimiento;
    }
    public String getClavePaisNacimiento() {
        return clavePaisNacimiento;
    }
    public void setClavePaisNacimiento(String clavePaisNacimiento) {
        this.clavePaisNacimiento = clavePaisNacimiento;
    }
    public TipoDocumentoComprobatorio getDocumentoProbatorio() {
        return documentoProbatorio;
    }
    public void setDocumentoProbatorio(
            TipoDocumentoComprobatorio documentoProbatorio) {
        this.documentoProbatorio = documentoProbatorio;
    }

    public String toString() {
        return "Ciudadano [CURP=" + curp + ", nombre=" + nombre
                + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
                + apellidoMaterno + ", sexo=" + sexo + ", fechaNacimiento="
                + fechaNacimiento + ", claveEntidadNacimiento="
                + claveEntidadNacimiento + ", clavePaisNacimiento="
                + clavePaisNacimiento + ", documentoProbatorio="
                + documentoProbatorio + "]";
    }
    

}
