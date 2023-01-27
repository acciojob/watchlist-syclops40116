package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	@Autowired
	MovieRepository repository;
//	addMovie
	public String addMovie(Movie movie) {
		return repository.addMovie(movie);
	}

//	addDirector
	public String addDirector(Director director) {
		return repository.addDirector(director);
	}
	
//	addMovieDirectorPair
	public String addMovieDirectorPair(String dname, String mname) {
		return repository.addMovieDirectorPair(dname, mname);
	}
	
//	getMovieByName
	public Movie getMovieByName(String mname) {
		return repository.getMovieByName(mname);
	}

//	getDirectorByName
	public Director getDirectorByName(String dname) {
		return repository.getDirectorByName(dname);
	}

//	getMoviesByDirectorName
	public List<String> getMoviesByDirectorName(String dname){
		return repository.getMoviesByDirectorName(dname);
	}

//	findAllMovies
	public List<String> findAllMovies(){
		return repository.findAllMovies();
	}

//	deleteDirectorByName
	public String deleteDirectorByName(String dname) {
		return repository.deleteDirectorByName(dname);
	}

//	deleteAllDirectors
	public String deleteAllDirectors() {
		return repository.deleteAllDirectors();
	}
}
