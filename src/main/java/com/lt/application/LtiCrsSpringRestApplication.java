package com.lt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * The CRS program implements an Spring Rest application that simply allows the user to
 * perform Specific actions by taking Input from Postman.
 *
 * @author group5
 * @since 2022-06-02
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.lt.*"})
@EnableWebMvc //IT will enable the WEB MVC configuration inside the SPring Container.
public class LtiCrsSpringRestApplication {
	
	/**
	 * This is the main method uses Spring Boot’s SpringApplication.run() 
	 * method to launch an application.
	 * 
	 * @param args String[].
	 * @return Nothing.
	 * 
	 */

	public static void main(String[] args) {
		SpringApplication.run(LtiCrsSpringRestApplication.class, args);
	}

}
