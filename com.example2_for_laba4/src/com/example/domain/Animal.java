package com.example.domain;

public abstract class Animal {
	String name;
	Animal(String name){
		this.name = name;
	}
	public abstract void eat();
}
