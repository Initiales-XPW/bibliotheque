package com.bpi.bibliotheque;

import com.bpi.bibliotheque.domaine.Library;
import com.bpi.bibliotheque.repository.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BibliothequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliothequeApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(LibraryRepository libraryRepository){
		return args -> {
			libraryRepository.save(new Library("bpi" ,null));
			libraryRepository.save(new Library("Starbuks" ,900));
			libraryRepository.save(new Library("IHP" ,80));
			libraryRepository.save(new Library("Starbuks" ,90));
			libraryRepository.save(new Library("pret à manger" ,120));
			libraryRepository.findAll().forEach(System.out::println);
			libraryRepository.findAll().forEach(System.out::println);
		};

	}

}
