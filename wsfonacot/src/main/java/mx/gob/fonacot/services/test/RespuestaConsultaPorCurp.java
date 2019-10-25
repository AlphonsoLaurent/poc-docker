package mx.gob.fonacot.services.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//import mx.gob.ventanillaunica.www.common.domain.model.Ciudadano;
//import com.softtek.model.BaseSerializableModel;

@XmlRootElement(name = "respuestaConsultaPorCurp")
@XmlAccessorType(XmlAccessType.FIELD)
public class RespuestaConsultaPorCurp extends BaseSerializableModel {
	private static final long serialVersionUID = -3281700497292080368L;
	
	@XmlElement(name="tieneError", required=true)
	protected boolean tieneError;
	@XmlElement(name="error")
	private Error error; 
	@XmlElement(name="ciudadano", required=true)
	private Ciudadano ciudadano;
	
	public boolean isTieneError() {
		return tieneError;
	}
	public void setTieneError(boolean tieneError) {
		this.tieneError = tieneError;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	public Ciudadano getCiudadano() {
		return ciudadano;
	}
	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}
	
	
}
