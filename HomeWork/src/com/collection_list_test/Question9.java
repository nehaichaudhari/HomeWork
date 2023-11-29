package com.collection_list_test;

import java.util.ArrayList;
import java.util.List;

///9.Consider an ArrayList of Movie  [2M]
//Movie has (int movieid, String  moviename, List<String> actor)
//Find “Amitabh bachchan has acted in how many movies

public class Question9 {
	public static void main(String[] args) {
		ArrayList<Movie> movie = new ArrayList<>();
		movie.add(new Movie(1, "OMG", List.of("akshay", "paresh")));
		movie.add(new Movie(2, "Bagban", List.of("amitabh", "hema")));
		movie.add(new Movie(3, "Don", List.of("amitabh", "shahrukh")));
		movie.add(new Movie(4, "K3G", List.of("amitabh", "hritik")));
		movie.add(new Movie(5, "Krish", List.of("hritik", "priyanka")));
		int count = 0;
		for (Movie m : movie) {
			if (m.getActor().contains("amitabh")) {
				count++;
			}
		}
		System.out.println("movie count is: " + count);
	}
}

class Movie {
	private int movieId;
	private String movieName;
	private List<String> actor;

	public Movie() {
	}

	public Movie(int movieId, String movieName, List<String> actor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<String> getActor() {
		return actor;
	}

	public void setActor(List<String> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + "]";
	}

}
