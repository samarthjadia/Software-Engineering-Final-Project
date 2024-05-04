package edu.ncsu.csc.CoffeeMaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entrypoint to the CoffeeMaker Application. Allows running as Java
 * application.
 *
 * @author Samarth Jadia (ssjadia), Kai Presler-Marshall
 *
 */
@SpringBootApplication ( scanBasePackages = { "edu.ncsu.csc.CoffeeMaker" } )
public class CoffeeMakerApplication {

    /**
     * Main method
     *
     * @param args
     *            Command-line args
     */
    public static void main ( final String[] args ) {
        SpringApplication.run( CoffeeMakerApplication.class, args );
    }

}
