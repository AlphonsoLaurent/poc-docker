package mx.gob.fonacot.services.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

@WebService(name = "renapoService1", portName = "renapoPortService", targetNamespace = "http://www.ventanillaunica.gob.mx/renapoService/wsdl")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public interface RenapoProxyRepository {

    @WebMethod(operationName = "consultarCurp", action = "")
    @WebResult(name = "respuestaConsultaPorCurp")
    public RespuestaConsultaPorCurp consultarCurp(
            @WebParam(name = "consultaPorCurp") ConsultaPorCurp consultaPorCurp);
}
