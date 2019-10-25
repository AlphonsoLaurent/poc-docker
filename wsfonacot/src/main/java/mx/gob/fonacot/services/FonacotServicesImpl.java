package mx.gob.fonacot.services;

import mx.gob.fonacot.services.bo.ConsultaRenapoBO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.gob.fonacot.webservices.common.dto.DatosConsultaCurpDTO;
import mx.gob.fonacot.webservices.common.dto.DatosConsultaDetallesDTO;
import org.springframework.beans.factory.annotation.Autowired;

@Service(value = "consultarenapo")
public class FonacotServicesImpl extends BaseValidacionWS implements FonacotServices {

    static Logger logger = Logger.getLogger(FonacotServicesImpl.class);
    @Autowired
    private ConsultaRenapoBO consultaRenapoBO;

    @Override
    public String consultaPorCURP(DatosConsultaCurpDTO datosConsultaCurpVO) {
        String response = "Ocurrio un problema con la respuesta";
        try {
            response = consultaRenapoBO.consultarPorCurp(datosConsultaCurpVO);
        } catch (Exception e) {
            response =e.getMessage();
        }
       return response;
    }

    @Override
    public String consultarCurpDetalle(DatosConsultaDetallesDTO datosConsultaDetalles) {
        String response = "Ocurrio un problema con la respuesta";
        try {
            response = consultaRenapoBO.consultarCurpDetalle(datosConsultaDetalles);
        } catch (Exception e) {
            response =e.getMessage();
        }
       return response; 
    }
}
