/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.fonacot.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.namespace.QName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.ws.DatosConsultaCurp; 
import mx.gob.ws.RenapoMock;

/**
 *
 * @author alphonso
 */
@Service
public class WSTestImpl implements WSTest {
    @Autowired
    private RenapoMock renapoMock;
    @Override
    @WebMethod(operationName ="consultaRenapo")
    @WebResult(name = "respuesta")
    public String consultaRenapo(@WebParam(name = "curp") DatosConsultaCurp curp) { 
        
        try {
            URL url = new URL("http://localhost:8091/renapo-services?wsdl");
            QName qname = new QName("http://ws.gob.mx/", "RenapoMockImplService");

            javax.xml.ws.Service service = javax.xml.ws.Service.create(url, qname);

            RenapoMock renapoMock1 = service.getPort(RenapoMock.class);
            //DatosConsultaCurp curp = new DatosConsultaCurp();
            //curp.setCurp("AECJ940429HCHRRS01");

            return renapoMock1.consultarPorCurp(curp);
        } catch (MalformedURLException ex) {
            return "Sin conexion con el servidor "+ex.getMessage();
        }
       
    } 
}
