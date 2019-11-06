package mx.gob.fonacot.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import mx.gob.fonacot.webservices.common.dto.DatosConsultaCurpDTO;
import mx.gob.fonacot.webservices.common.dto.DatosConsultaDetallesDTO;
 
/***
 * 
 * @author alphonso
 * El objetivo de este WebServices es consultar a renapo si por algun motivo no
 * logra conectarse al servicio renapo consultara asi mismo a su base de datos local.
 *
 */
 
@WebService
@SOAPBinding(style = Style.RPC)
public interface FonacotServices {
	/***
	 * Este metodo es el encargado de consultar a renapo en caso de que renapo no se
	 * encuentre dispoble entonces se consultar a los bussines object de este mismo
	 * webservices. Dicho en otras palabras cuando ocurra una excepcion se simulara
	 * la respuesta de renapo.
	 * 
	 * @param curp
	 * @return ciudadanoDTO
	 */
	@WebMethod(operationName ="consultaPorCURP")
	@WebResult(name = "response")
	public String consultaPorCURP(@WebParam(name = "CURP") DatosConsultaCurpDTO datosConsultaCurpVO);
	
	
	/***
	 * Este metodo es el encargado de consultar la informacion por detalle del usuario
     * @param datosConsultaDetalles
	 * @param datosConsultaDetallesVO
	 * @return
	 * @throws ExceptionFonacot 
	 */
	@WebMethod(operationName ="consultarCurpDetalle")
	@WebResult(name = "response")
	public String consultarCurpDetalle(@WebParam(name = "DatosPersonales") DatosConsultaDetallesDTO datosConsultaDetalles);
	
	
	
	
}
