package com.mindtree.mymoviecatalogservice.entity;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
	
	private List<Movie> movieList;
	
	public MovieList() {
		
	}

	public MovieList(List<Movie> movieList) {
		super();
		this.movieList = movieList;
	}



	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
	

}
