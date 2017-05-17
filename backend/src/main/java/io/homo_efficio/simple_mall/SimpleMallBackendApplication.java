package io.homo_efficio.simple_mall;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleMallBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleMallBackendApplication.class, args);
	}

	@Bean
	public ObjectMapper caseInsensitiveObjectMapper() {
		return new ObjectMapper().configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
	}
}
