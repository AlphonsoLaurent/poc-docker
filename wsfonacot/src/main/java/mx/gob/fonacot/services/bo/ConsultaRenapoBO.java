package mx.gob.fonacot.services.bo;

import mx.gob.fonacot.webservices.common.dto.DatosConsultaCurpDTO;
import mx.gob.fonacot.webservices.common.dto.DatosConsultaDetallesDTO;

public interface ConsultaRenapoBO {
	public String consultarCurpDetalle(DatosConsultaDetallesDTO datosConsultaDetalles) throws Exception;
	public String consultarPorCurp(DatosConsultaCurpDTO datosConsultaCurpVO)throws Exception;
}
