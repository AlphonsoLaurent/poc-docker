/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.fonacot.services;

import javax.jws.WebParam;
import mx.gob.ws.DatosConsultaCurp;

/**
 *
 * @author alphonso
 */
public interface WSTest {
    String consultaRenapo(@WebParam(name = "curp") DatosConsultaCurp curp);
}
