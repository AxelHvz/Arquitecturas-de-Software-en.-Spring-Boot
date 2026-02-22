package sv.edu.udb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// @SpringBootApplication marca el punto de entrada de la infraestructura de Spring
// (exclude = ...) Se usa para evitar que Spring busque una base de datos, ya que no usaremos una para esta demostracion
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringDescuentosEjemploApplication {
    public static void main(String[] args) {
        // Se lanza el servidor local y levanta la infraestructura
        SpringApplication.run(SpringDescuentosEjemploApplication.class, args);
    }
}