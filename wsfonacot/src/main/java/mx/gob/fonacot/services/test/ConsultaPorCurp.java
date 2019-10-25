package mx.gob.fonacot.services.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//import com.softtek.model.BaseSerializableModel;

@XmlRootElement(name = "consultarPorCurp", namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConsultaPorCurp extends BaseSerializableModel {
	private static final long serialVersionUID = -7520688943081810506L;
	
	@XmlElement(name = "datos", nillable = false, namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx")
	private DatosConsultaCurp datosConsultaCurp;

	public DatosConsultaCurp getDatosConsultaCurp() {
		return datosConsultaCurp;
	}

	public void setDatosConsultaCurp(DatosConsultaCurp datosConsultaCurp) {
		this.datosConsultaCurp = datosConsultaCurp;
	}
}
