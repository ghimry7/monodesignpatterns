package com.monocept.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	List<Movie> movies;
	List<Movie> loadedMovies;
	static final String filePath = "./data.bin";

	public MovieManager() {
		movies = new ArrayList<>();
		loadMovies();
	}

	public void addMovie(Movie movie) {
		try {
			movies.add(movie);
		} catch (NullPointerException e) {
			movies = new ArrayList<>();
			loadMovies();
			movies.addAll(loadedMovies);
			movies.add(movie);
		}
	}

	public void saveMovie() {
		try {
			FileOutputStream file = new FileOutputStream(filePath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(movies);
			out.close();
			file.close();
			System.out.println("Saved");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clearMovies() {
		movies = null;
		System.out.println("Cleared from List");
	}

	public void loadMovies() {
		try {

			FileInputStream file = new FileInputStream(filePath);

			ObjectInputStream in = new ObjectInputStream(file);

			loadedMovies = (List<Movie>) in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("File is Empty");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Movie> getMovies() {
		loadMovies();
		return loadedMovies;
	}

	public int getMovieId(String name) {
		int id = 0;
		for (Movie m : loadedMovies) {
			if (m.getName().equalsIgnoreCase(name)) {
				id = m.getId();
			}
		}
		return id;
	}

	public void deleteAllMovies() {
		try {
			loadedMovies = null;
			FileOutputStream file = new FileOutputStream(filePath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(loadedMovies);
			out.close();
			file.close();
			System.out.println("All movies deleted from file");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("File is Empty!!!");
		}
	}

}
