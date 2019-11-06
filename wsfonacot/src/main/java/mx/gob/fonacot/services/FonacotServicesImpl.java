package mx.gob.fonacot.services;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import mx.gob.fonacot.services.bo.ConsultaRenapoBO;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import mx.gob.fonacot.webservices.common.dto.DatosConsultaCurpDTO;
import mx.gob.fonacot.webservices.common.dto.DatosConsultaDetallesDTO;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FonacotServicesImpl extends BaseValidacionWS implements FonacotServices{

    static Logger logger = Logger.getLogger(FonacotServicesImpl.class);
    @Autowired
    private ConsultaRenapoBO consultaRenapoBO;

//    @Override
    @WebMethod(operationName ="consultaPorCURP")
    @WebResult(name = "respuesta")
    public String consultaPorCURP(DatosConsultaCurpDTO datosConsultaCurpVO) {
        String response = "Ocurrio un problema con la respuesta";
        try {
            response = consultaRenapoBO.consultarPorCurp(datosConsultaCurpVO);
        } catch (Exception e) {
            response =e.getMessage();
        }
       return response;
    }

//    @Override
    @WebMethod(operationName ="consultarCurpDetalle")
    @WebResult(name = "respuesta")
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
