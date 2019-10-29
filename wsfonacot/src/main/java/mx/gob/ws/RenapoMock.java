
package mx.gob.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RenapoMock", targetNamespace = "http://ws.gob.mx/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RenapoMock {


    /**
     * 
     * @param curp
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarPorCurp", targetNamespace = "http://ws.gob.mx/", className = "mx.gob.ws.ConsultarPorCurp")
    @ResponseWrapper(localName = "consultarPorCurpResponse", targetNamespace = "http://ws.gob.mx/", className = "mx.gob.ws.ConsultarPorCurpResponse")
    @Action(input = "http://ws.gob.mx/RenapoMock/consultarPorCurpRequest", output = "http://ws.gob.mx/RenapoMock/consultarPorCurpResponse")
    public String consultarPorCurp(
        @WebParam(name = "curp", targetNamespace = "")
        DatosConsultaCurp curp);

    /**
     * 
     * @param datos
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarCurpDetalle", targetNamespace = "http://ws.gob.mx/", className = "mx.gob.ws.ConsultarCurpDetalle")
    @ResponseWrapper(localName = "consultarCurpDetalleResponse", targetNamespace = "http://ws.gob.mx/", className = "mx.gob.ws.ConsultarCurpDetalleResponse")
    @Action(input = "http://ws.gob.mx/RenapoMock/consultarCurpDetalleRequest", output = "http://ws.gob.mx/RenapoMock/consultarCurpDetalleResponse")
    public String consultarCurpDetalle(
        @WebParam(name = "datos", targetNamespace = "")
        DatosConsultaDetalles datos);

}