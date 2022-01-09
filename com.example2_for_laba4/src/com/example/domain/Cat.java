package com.example.domain;

public class Cat extends Animal implements Pet {
Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
private String name;
@Override
public String getName() {
return getName();
}
@Override
public void setName(String name) {
this.name = name;
}
@Override
public void play() {
System.out.println(name + " любит играть с веревочкой");
}
@Override
public
void eat() {
	// TODO Auto-generated method stub
	
} }