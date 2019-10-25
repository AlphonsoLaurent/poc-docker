package mx.gob.fonacot.services;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

public class BaseValidacionWS {
	@Resource
    WebServiceContext webServiceContext;
	
	boolean validaAcceso() {
		MessageContext messageContext = webServiceContext.getMessageContext();
		 
        // get request headers
        Map<?,?> requestHeaders = (Map<?,?>) messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        List<?> usernameList = (List<?>) requestHeaders.get("user");
        List<?> passwordList = (List<?>) requestHeaders.get("password");
        List<?> entityList = (List<?>) requestHeaders.get("entity");
 
        String username = "";
        String password = "";
        String entity = "";
 
        if (usernameList != null) {
            username = usernameList.get(0).toString();
        }
 
        if (passwordList != null) {
            password = passwordList.get(0).toString();
        }
        if (entityList != null) {
        	entity = entityList.get(0).toString();
        }
 
        // of course this is not real validation
        // you should validate your users from stored databases credentials
        if (username.equals("usuarioqa") && password.equals("12121212") && entity.equals("INFONACOT")) {
 
            return true;
 
        } else {
        	return false; 
        } 
	}
}
