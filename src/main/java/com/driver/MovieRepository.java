package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	Map<String, Movie> movies = new HashMap<>();
	Map<String, Director> directors = new HashMap<>();
	Map<String, HashSet<String>> dir_movie_pair = new HashMap<>();
	
	public String addMovie(Movie movie) {
		String movieName = movie.getName();
		if(movies.containsKey(movieName)) return null;
		movies.put(movieName, movie);
		return "success";
	}
	
	public String addDirector(Director director) {
		String dir_name = director.getName();
		if(directors.containsKey(dir_name)) return null;
		directors.put(dir_name, director);
		return "success";
	}
	
	public String addMovieDirectorPair(String directorName, String movieName) {
		if(!dir_movie_pair.containsKey(directorName))
			dir_movie_pair.put(directorName, new HashSet<String>());
		
		dir_movie_pair.get(directorName).add(movieName);
		return "success";
	}
	
	public Movie getMovieByName(String movieName) {
		return movies.get(movieName);
	}
	
	public Director getDirectorByName(String directorName) {
		return directors.get(directorName);
	}

	public List<String> getMoviesByDirectorName(String directorName){
		List<String> list = new ArrayList<>(dir_movie_pair.get(directorName));
		return list;
	}
	
	public List<String> findAllMovies(){
		return new ArrayList<String>(movies.keySet());
	}
	
	public String deleteDirectorByName(String directorName) {
		HashSet<String> dirMovies = dir_movie_pair.get(directorName);
		
		for(String movie: dirMovies) {
			movies.remove(movie);
		}
		dir_movie_pair.remove(directorName);
		return "sucess";
	}
	
	public String deleteAllDirectors() {
		for(String dirName: directors.keySet()) {
			this.deleteDirectorByName(dirName);
		}
		return "success";
	}
	

}
































