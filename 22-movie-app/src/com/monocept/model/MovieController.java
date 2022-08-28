package com.monocept.model;

import java.util.List;
import java.util.Scanner;

public class MovieController {
	MovieManager manager;

	public MovieController(MovieManager manager) {
		super();
		this.manager = manager;
	}

	public void start() {
		displayMenu();
	}

	public void displayMenu() {
		while (true) {
			int ch;
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"Menu\n1.Add Movie \n2.Save Movie \n3.Clear Movies \n4.Get Movies \n5.Get Movie ID \n6.Delete All Movies\n7.Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				addMovie();
				break;

			case 2:
				manager.saveMovie();
				break;

			case 3:
				manager.clearMovies();
				break;

			case 4:

				getMovies();
				break;

			case 5:
				System.out.println("Enter Movie Name: ");
				String name = sc.next();
				int id = manager.getMovieId(name);
				System.out.println("Id: " + id);
				break;

			case 6:
				manager.deleteAllMovies();
				break;

			case 7:
				System.exit(0);
			}
		}
	}

	private void getMovies() {
		List<Movie> movies = manager.getMovies();
		if (movies != null) {
			System.out.println(movies);
		} else {
			System.out.println("File empty");
		}
	}

	private void addMovie() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		System.out.println("Enter Movie Name: ");
		String name = sc.next();
		System.out.println("Year of release: ");
		int year = sc.nextInt();
		System.out.println("Genre");
		String genre = sc.next();

		manager.addMovie(new Movie(id, name, year, genre));
	}

}
