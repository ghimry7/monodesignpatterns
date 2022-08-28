package com.monocept.test;

import java.io.IOException;
import java.util.*;

import com.monocept.model.*;

public class MovieTest {

	public static void main(String[] args) throws IOException {

		MovieController mc = new MovieController(new MovieManager());
		mc.start();

	}

}
