package com.gl.AdditionOfTwoNo;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter First No -> ");
		int FirstNo = sc.nextInt();
		
		System.out.print("Enter Second No -> ");
		int SecondNo = sc.nextInt();
		
		int sum = FirstNo + SecondNo;
		
		System.out.println("Sum Of Two No is -> "+sum);
	}

}
