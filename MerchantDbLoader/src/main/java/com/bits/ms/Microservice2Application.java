package com.bits.ms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.context.annotation.Bean;

import com.mongodb.ConnectionString;

@SpringBootApplication
public class Microservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
	}
	
	/*
	 @Bean
	    public MongoClientSettingsBuilderCustomizer customizer(@Value("${custom.uri}") String uri) {
	        ConnectionString connection = new ConnectionString(uri);
	        return settings -> settings.applyConnectionString(connection);
	    }*/
	
}
