package com.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	@Autowired
	MovieRepository repository;
//	addMovie
	public void addMovie(Movie movie) {
		repository.addMovie(movie);
	}

//	addDirector
	public void addDirector(Director director) {
		repository.addDirector(director);
	}
	
//	addMovieDirectorPair
	public void addMovieDirectorPair(String dname, String mname) {
		repository.addMovieDirectorPair(dname, mname);
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
	public void deleteDirectorByName(String dname) {
		repository.deleteDirectorByName(dname);
	}

//	deleteAllDirectors
	public void deleteAllDirectors() {
		repository.deleteAllDirectors();
	}
}
