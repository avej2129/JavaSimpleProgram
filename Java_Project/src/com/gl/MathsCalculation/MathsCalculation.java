package com.gl.MathsCalculation;

import java.util.Scanner;

public class MathsCalculation {
	
	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
				
			System.out.print("Enter First Number -> ");
			int firstno = in.nextInt();
				
			System.out.print("Enter Second Number -> ");
			int secondno = in.nextInt();
				
			int sum = firstno + secondno;
			int subtraction = firstno - secondno;
			int multiplication = firstno * secondno;
			int division = firstno / secondno;
			int modulus =  firstno % secondno;
				
			System.out.println("sum of Two No is ->  " + sum );
			System.out.println("subtraction of Two No is ->  " + subtraction );
			System.out.println("Multification of Two No is ->  " + multiplication );
			System.out.println("Division of Two No is ->  " + division );
			System.out.println("Modulus of Two No is ->  " + modulus );
		}

	}



