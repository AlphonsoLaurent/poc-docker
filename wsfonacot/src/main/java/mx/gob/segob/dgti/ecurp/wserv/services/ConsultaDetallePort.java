//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package mx.gob.segob.dgti.ecurp.wserv.services;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import mx.gob.segob.dgti.ecurp.wserv.services.xsd.DatosConsultaDetalles;

@WebService(name = "ConsultaCurpDetalleServicePortType", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx")
@XmlSeeAlso({
    mx.gob.segob.dgti.ecurp.wserv.services.xsd.ObjectFactory.class,
    mx.gob.segob.dgti.ecurp.wserv.services.ObjectFactory.class
})
public interface ConsultaDetallePort {


    /**
     * 
     * @param sessionID
     * @param mssg
     */
    @WebMethod(action = "urn:getConfirm")
    @Oneway
    @RequestWrapper(localName = "getConfirm", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", className = "mx.gob.segob.dgti.ecurp.wserv.services.GetConfirm")
    public void getConfirm(
        @WebParam(name = "sessionID", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx")
        String sessionID,
        @WebParam(name = "Mssg", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx")
        String mssg);

    /**
     * 
     * @param datos
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "urn:consultarCurpDetalle")
    @WebResult(targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx")
    @RequestWrapper(localName = "consultarCurpDetalle", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", className = "mx.gob.segob.dgti.ecurp.wserv.services.ConsultarCurpDetalle")
    @ResponseWrapper(localName = "consultarCurpDetalleResponse", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx", className = "mx.gob.segob.dgti.ecurp.wserv.services.ConsultarCurpDetalleResponse")
    public String consultarCurpDetalle(
        @WebParam(name = "datos", targetNamespace = "http://services.wserv.ecurp.dgti.segob.gob.mx")
        DatosConsultaDetalles datos);

}
