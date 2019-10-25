package mx.gob.fonacot.services.test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

 

@XmlAccessorType(XmlAccessType.FIELD)
public class DatosConsultaCurp extends BaseSerializableModel {
	private static final long serialVersionUID = -4555542327460174753L;
	@XmlElement(required=true, namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd")
	private int tipoTransaccion;
	@XmlElement(required=true, namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd")
	private String usuario;
	@XmlElement(required=true, namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd")
	private String password;
	@XmlElement(required=true, namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd")
	private String direccionIp;
	@XmlElement(required=true, namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd")
	private String cveCurp;
	@XmlElement(nillable=true, namespace = "http://services.wserv.ecurp.dgti.segob.gob.mx/xsd")
	private String cveEntidadEmisora;
	
	public int getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(int tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDireccionIp() {
		return direccionIp;
	}
	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}
	public String getCveCurp() {
		return cveCurp;
	}
	public void setCveCurp(String cveCurp) {
		this.cveCurp = cveCurp;
	}
	public String getCveEntidadEmisora() {
		return cveEntidadEmisora;
	}
	public void setCveEntidadEmisora(String cveEntidadEmisora) {
		this.cveEntidadEmisora = cveEntidadEmisora;
	}
}
