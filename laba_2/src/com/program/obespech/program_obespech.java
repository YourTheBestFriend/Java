package com.program.obespech;

import com.program_obespech2.program_obespech2;
import com.program_obespech2.software_all;
import com.program_obespech2.software_all_2;


public class program_obespech {
	
	public static void main(String[] args) {
		// Родитель
		program_obespech2 obj0 = new program_obespech2(1, "test");
		// Потомки
		software_all obj1 = new software_all(20, "free", 77);
		software_all_2 obj2 = new software_all_2(10, "non free", 88);
		
		System.out.println("obj0 - pole1 = " + obj0.getPole1());
		System.out.println("obj0 - name = " + obj0.getName());
		
		System.out.println("\nobj1 - pole1 = " + obj1.getPole1());
		System.out.println("obj1 - name = " + obj1.getName());
		System.out.println("obj1 - flag1 = " + obj1.getFlag1());
		
		obj1.setPole1(100);
		System.out.println("\nobj1 - pole1 = " + obj1.getPole1());
		
		
		System.out.println("\nobj2 - pole1 = " + obj2.getPole1());
		System.out.println("obj2 - name = " + obj2.getName());
		System.out.println("obj2 - flag2 = " + obj2.getFlag2());
		
		
	}
}

