package mx.gob.fonacot.services.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "RenapoService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RenapoService {
    
        @WebMethod(operationName ="obtenerCiudadano")
	@WebResult(name = "Ciudadano")
	Ciudadano obtenerCiudadano(@WebParam(name = "CURP")String curp) throws Exception;
	
	Ciudadano obtenerCiudadanoNotInTX(String curp) throws Exception;
}
