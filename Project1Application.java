package com.spring.project1;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JsonParser;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application {
	 private static void extracted(ConfigurableApplicationContext context) throws ParseException{
	     
	      JsonParser jasonParser = context.getBean(JsonParser.class);
	      System.out.println(" students "+ jasonParser.parseJson());
	   }

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project1Application.class, args);
		 Gpa g = context.getBean(Gpa.class);
		g.calculation();
		extracted(context);
	
		
		
	}
	

}
