package mx.gob.fonacot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
 
@ImportResource({ "classpath:wsservice.xml" })
@SpringBootApplication
@ComponentScan({"mx.gob"})
public class FonacotRenapo {
	static Logger logger = Logger.getLogger(FonacotRenapo.class);
	public static void main(String[] args) {
		logger.info("Iniciando el microservicio");
		SpringApplication.run(FonacotRenapo.class, args);
		logger.info("Iniciando el microservicio");
	}
	 
}
