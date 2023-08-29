package co.pitam.sb3lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class Sb3lambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb3lambdaApplication.class, args);
	}

	@Bean
	public Function<String,String> upperCase(){
		return s->s.toUpperCase();
	}

}
