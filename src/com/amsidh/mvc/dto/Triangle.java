package com.amsidh.mvc.dto;

public class Triangle {

	private String type;

	public Triangle() {
		System.out.println("Triangle constructor called");
	}

	public void draw() {
		System.out.println("Triangle drawn");
	}

	public String getType() {
		System.out.println("Type getter called");
		return type;
	}

	public void setType(String type) {
		System.out.println("Type setter is called");
		this.type = type;
	}

}
