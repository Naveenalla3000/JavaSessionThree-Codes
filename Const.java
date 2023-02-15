/*
* Java Program to demostrate parameterized constructors, toString and this keyword
*/

import java.util.Scanner;

public class Const {
	int x;
	float y; 

	public Const(int x, float y) {
		this.x = x; 
		this.y = y; 
	}

	public String toString() {
		return (x+" "+y); 
	}

	public static void main(String args[]) {
		Const obj = new Const(2, 4.5f); 
		Scanner sc = new Scanner(System.in); 

		System.out.println(obj);		
		
	}
}
