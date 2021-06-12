package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); // different address - false
		System.out.println(p2 == p3); // different address - false
		System.out.println(p3 == p4); // different address - false
		System.out.println(p4 == p1); // relocated address - true	 
		System.out.println(p1.equals(p2));  //different address - false
		System.out.println(p4.equals(p1));  // relocated address - true
	}
//eqauls() - Object.class 최상위에 포함 - 자동으로 상속
}


