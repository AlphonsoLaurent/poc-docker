package mx.gob.fonacot.services.test;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import com.softtek.helper.BaseSerializableHelper;
//import com.softtek.renapo.model.ConsultaPorCurp;
//import com.softtek.renapo.model.DatosConsultaCurp;

@Component
public class RenapoHelper implements Serializable {
	private static final long serialVersionUID = -5422620438706785592L;
	@Value("${ws.renapo.usuario}")
	private String usuario;
	@Value("${ws.renapo.password}")
    private String password;
	@Value("${ws.renapo.tipo.transaccion.curp}")
    private String tipoTransaccion;
	@Value("${ws.renapo.ip}")
    private String ipAutorizada;
	@Value("${ws.renapo.tipo.transaccion.curp}")
	private String cveEntidadEmisora;
    
    /**
     * Genera un objeto ConsultaPorCurp que representa la consulta por curp
     * hacia el servicio de renapo.
     * 
     * @param curp es la curp de la persona que se desea obtener sus datos.
     * @return un objeto ConsultaPorCurp que representa los datos de entrada 
     * para la consulta al servicio de renapo.
     */
    public ConsultaPorCurp getBeanConsultaPorCurp(String curp){
    	ConsultaPorCurp consultaPorCurp = new ConsultaPorCurp();
    	DatosConsultaCurp datos = new DatosConsultaCurp();
    	datos.setTipoTransaccion(
    			tipoTransaccion != null && !tipoTransaccion.trim().equals("") ? Integer.parseInt(tipoTransaccion) : Integer.valueOf(0));
    	datos.setUsuario(usuario);
    	datos.setPassword(password);
    	datos.setDireccionIp(ipAutorizada);
    	datos.setCveCurp(curp);
    	datos.setCveEntidadEmisora(cveEntidadEmisora);
    	consultaPorCurp.setDatosConsultaCurp(datos);
    	
    	return consultaPorCurp;
    }

}
