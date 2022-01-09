package com.example.domain;

public class POPUGAI extends Animal implements Pet {
	float speedFly = (float) 12.3;
	public POPUGAI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
	}

	@Override
	public void play() {
		System.out.println("Я летаю! " + speedFly);
	}
	
	@Override
	public
	void eat() {
		System.out.println("Я кушаю корм для попугаев!");		
	}
	
}
