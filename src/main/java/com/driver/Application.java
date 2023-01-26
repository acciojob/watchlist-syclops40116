package com.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}


//MovieController.java
//MovieService.java
//MovieRepository.java
//Movie.java - String name, int durationInMinutes, double imdbRating, no-args constructor, all-args constructor and getters-setters
//Director.java Class - String name, int numberOfMovies, double imdbRating, no-args constructor, all-args constructor and getters-setters