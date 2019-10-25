package mx.gob.fonacot.services.bo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBElement;
import mx.gob.fonacot.exception.ExceptionFonacot;

import mx.gob.fonacot.webservices.common.dto.DatosConsultaCurpDTO;
import mx.gob.fonacot.webservices.common.dto.DatosConsultaDetallesDTO;
import mx.gob.segob.dgti.ecurp.wserv.services.ConsultaCurpDetalleService;
import mx.gob.segob.dgti.ecurp.wserv.services.ConsultaDetallePort;
import mx.gob.segob.dgti.ecurp.wserv.services.ConsultaPorCurpService;
import mx.gob.segob.dgti.ecurp.wserv.services.ConsultaPorCurpServicePortType;
import mx.gob.segob.dgti.ecurp.wserv.services.xsd.DatosConsultaCurp;
import mx.gob.segob.dgti.ecurp.wserv.services.xsd.DatosConsultaDetalles;
import mx.gob.segob.dgti.ecurp.wserv.services.xsd.ObjectFactory;
import org.apache.log4j.Logger; 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConsultaRenapoBOImpl implements ConsultaRenapoBO {

    Logger logger = Logger.getLogger(ConsultaRenapoBOImpl.class);

    @Value("${ws.renapo.usuario}")
    private String usuario;
    @Value("${ws.renapo.password}")
    private String password;
    @Value("${ws.renapo.ip}")
    private String ipRenapo;
    @Value("${ws.renapo.entidad.emisora}")
    private String cveEmisora;
    @Value("${ws.renapo.tipo.transaccion.detalle.curp}")
    private Integer tipoTransaccionDetalle;
    @Value("${ws.renapo.tipo.transaccion.curp}")
    private Integer tipoTransaccionCURP;
    @Value("${ws.renapo.url.curpdetalle}")
    private String urlConsultaCurpDetalle;
    @Value("${ws.renapo.url.curp}")
    private String urlConsultaCurp;

    @Override
    public String consultarCurpDetalle(DatosConsultaDetallesDTO datosConsultaDetallesVO) throws ExceptionFonacot {
        logger.info("Iniciando metodo consultarCurpDetalle");
        String respuesta = "sin datos";
        URL wsdlUrl = null;
        logger.info("Entando al try curp detalle ...");

        try {
            this.setPropertiesSecurity();
            //url produccion
            wsdlUrl = new URL(urlConsultaCurpDetalle);

            logger.info("valor de  wsdlUrl..." + wsdlUrl);

            //Llenado de objeto que consulta ws RENAPO
            ObjectFactory objectFactory = new ObjectFactory();
            DatosConsultaDetalles datosConsultaDetalles = new DatosConsultaDetalles();
            JAXBElement<String> cveAlfaEntFedNac = objectFactory.createDatosConsultaDetallesCveAlfaEntFedNac(datosConsultaDetallesVO.getCveAlfaEntFedNac());
            datosConsultaDetalles.setCveAlfaEntFedNac(cveAlfaEntFedNac);

            JAXBElement<String> fechaNacimiento = objectFactory.createDatosConsultaDetallesFechaNacimiento(datosConsultaDetallesVO.getFechaNacimiento());
            datosConsultaDetalles.setFechaNacimiento(fechaNacimiento);

            JAXBElement<String> nombre = objectFactory.createDatosConsultaDetallesNombre(datosConsultaDetallesVO.getNombre());
            datosConsultaDetalles.setNombre(nombre);

            JAXBElement<String> primerApellido = objectFactory.createDatosConsultaDetallesPrimerApellido(datosConsultaDetallesVO.getApellidoPaterno());
            datosConsultaDetalles.setPrimerApellido(primerApellido);

            JAXBElement<String> segundoApellido = objectFactory.createDatosConsultaDetallesSegundoApellido(datosConsultaDetallesVO.getApellidoMaterno());
            datosConsultaDetalles.setSegundoApellido(segundoApellido);

            JAXBElement<String> sexo = objectFactory.createDatosConsultaDetallesSexo(datosConsultaDetallesVO.getSexo());
            datosConsultaDetalles.setSexo(sexo);

            JAXBElement<String> cveEntidadEmisora = objectFactory.createDatosConsultaDetallesCveEntidadEmisora(cveEmisora);
            datosConsultaDetalles.setCveEntidadEmisora(cveEntidadEmisora);

            datosConsultaDetalles.setTipoTransaccion(tipoTransaccionDetalle);

            JAXBElement<String> cveUsuario = objectFactory.createDatosConsultaDetallesCveUsuario(usuario);
            datosConsultaDetalles.setCveUsuario(cveUsuario);

            JAXBElement<String> passwordJax = objectFactory.createDatosConsultaDetallesPassword(password);
            datosConsultaDetalles.setPassword(passwordJax);

            JAXBElement<String> direccionIp = objectFactory.createDatosConsultaDetallesDireccionIp(ipRenapo);
            datosConsultaDetalles.setDireccionIp(direccionIp);

            ConsultaCurpDetalleService consultaCurpDetalleService = new ConsultaCurpDetalleService(wsdlUrl);
            ConsultaDetallePort port = consultaCurpDetalleService.getConsultaDetalleHttpEndpoint();
            respuesta = port.consultarCurpDetalle(datosConsultaDetalles);
        } catch (MalformedURLException ex) {
            logger.error("####################ERROR::: ############ "+ex);
            ex.printStackTrace();
            throw new ExceptionFonacot("Algo ocurrio favor de revisar el webservice RENAPO");
        }

        return respuesta;
    }

    @Override
    public String consultarPorCurp(DatosConsultaCurpDTO datosConsultaCurpVO) throws ExceptionFonacot {
        String respuesta = "sin datos";
        try {
            logger.info("Iniciando metodo consultarPorCurp");
            
            URL wsdlUrl = null;

            logger.info("Entando al try consultarPorCurp ...");
            this.setPropertiesSecurity();

            wsdlUrl = new URL(urlConsultaCurp);
            logger.info("valor de  wsdlUrl..." + wsdlUrl);

            //Llenado de objeto que consulta ws RENAPO
            ObjectFactory objectFactory = new ObjectFactory();
            DatosConsultaCurp datosConsultaCurp = new DatosConsultaCurp();

            JAXBElement<String> cveCurp = objectFactory.createDatosConsultaCurpCveCurp(datosConsultaCurpVO.getCveCurp());
            datosConsultaCurp.setCveCurp(cveCurp);

            JAXBElement<String> cveEntidadEmisora = objectFactory.createDatosConsultaDetallesCveEntidadEmisora(cveEmisora);
            datosConsultaCurp.setCveEntidadEmisora(cveEntidadEmisora);

            datosConsultaCurp.setTipoTransaccion(tipoTransaccionCURP);

            JAXBElement<String> cveUsuario = objectFactory.createDatosConsultaDetallesCveUsuario(usuario);
            datosConsultaCurp.setUsuario(cveUsuario);

            JAXBElement<String> passwordJax = objectFactory.createDatosConsultaDetallesPassword(password);
            datosConsultaCurp.setPassword(passwordJax);

            JAXBElement<String> direccionIp = objectFactory.createDatosConsultaDetallesDireccionIp(ipRenapo);
            datosConsultaCurp.setDireccionIp(direccionIp);

            ConsultaPorCurpService cCurp = new ConsultaPorCurpService(wsdlUrl);
            ConsultaPorCurpServicePortType port = cCurp.getConsultaPorCurpServiceHttpSoap11Endpoint();
            respuesta = port.consultarPorCurp(datosConsultaCurp);

        } catch (MalformedURLException ex) {
            logger.error("####################ERROR::: ############ "+ex);
            ex.printStackTrace();
            throw new ExceptionFonacot("Algo ocurrio favor de revisar el webservice RENAPO");
        }
        return respuesta;
    }

    private void setPropertiesSecurity() {
        logger.debug("Inicio seteo propiedades");
        System.setProperty("javax.net.ssl.keyStore", "src/main/resources/cliente.keystore");
        System.setProperty("javax.net.ssl.keyStorePassword", "clientpass");
        System.setProperty("javax.net.ssl.trustStore", "src/main/resources/cliente.keystore");
        System.setProperty("javax.net.ssl.trustStorePassword", "clientpass");
        logger.debug("Fin seteo propiedades");
    }

}
