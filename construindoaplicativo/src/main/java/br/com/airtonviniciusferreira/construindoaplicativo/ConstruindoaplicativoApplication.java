package br.com.airtonviniciusferreira.construindoaplicativo;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConstruindoaplicativoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstruindoaplicativoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			System.out.println("Vamos inspecionar os beans oferecidos pelo Spring Boot:");
			
			String[] beansNames = context.getBeanDefinitionNames();
			Arrays.sort(beansNames);

			for (String beanName : beansNames) {
				System.out.println(beanName);
			}
		};
	}
}
