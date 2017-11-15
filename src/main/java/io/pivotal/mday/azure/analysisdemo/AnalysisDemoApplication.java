/**
 * Basic text analysis demo app using the Microsoft sentiment analysis suite and a backing database
 * 
 * @author Matt Day
 */
package io.pivotal.mday.azure.analysisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnalysisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysisDemoApplication.class, args);
	}
}
