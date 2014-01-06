package com.example.model;

import java.util.*;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red moose");
		}
		else {
			brands.add("Pale ale");
			brands.add("Stout");
		}
		return brands;
	}
}
