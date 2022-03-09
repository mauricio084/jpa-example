package com.example.jpa.publish.model;

public enum Genero {
	M(10), 
	F(20), 
	MG(0), 
	O(30);
	
	int id;
	
	private Genero(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}
