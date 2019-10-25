package mx.gob.fonacot.services.test;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renapoService")
public class RenapoServicePOJOImpl implements RenapoService, Serializable {

    private static final long serialVersionUID = -491376013040449658L;

//    @Autowired
//    private RenapoProxyRepository renapoProxyRepository;
    @Autowired
    private RenapoHelper renapoHelper;

    public Ciudadano obtenerCiudadano(String curp) throws Exception {

        Ciudadano ciudadano = null;
//        RespuestaConsultaPorCurp respuestaConsultaPorCurp  = renapoProxyRepository.consultarCurp(renapoHelper.getBeanConsultaPorCurp(curp));

        return ciudadano;
    }

    public Ciudadano obtenerCiudadanoNotInTX(String curp) throws Exception {

        try {
            return obtenerCiudadano(curp);
        } catch (Exception cne) {
            throw new Exception(cne.getMessage());
        }
    }
}
