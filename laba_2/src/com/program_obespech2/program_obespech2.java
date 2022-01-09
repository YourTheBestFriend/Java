package com.program_obespech2;

// Класс родитель
public class program_obespech2 {
	private int pole1;
	private String name;
	
	public program_obespech2(){};
	public program_obespech2(int pole1, String name)
	{
		this.pole1 = pole1;
		this.name = name;
	}
	
	public int getPole1() {
		return pole1;
	}
	public void setPole1(int pole1) {
		this.pole1 = pole1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


