package mx.gob.fonacot.webservices.common.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ConsultaPorCurp")
    
public class DatosConsultaCurpDTO {

    @XmlElement(required = true, name = "curp")
    private String cveCurp;

    public String getCveCurp() {
        return cveCurp;
    }

    public void setCveCurp(String cveCurp) {
        this.cveCurp = cveCurp;
    }

}
