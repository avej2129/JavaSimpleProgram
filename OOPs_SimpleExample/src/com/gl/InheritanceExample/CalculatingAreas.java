package com.gl.InheritanceExample;

import java.util.Scanner;

class InheritanceA {
	      Scanner in = new Scanner(System.in);
		  public void AreaOfRectangle() {
			  
			  System.out.print("Enter the lenght --> ");
			  int Lenght = in.nextInt();
			  
			  System.out.print("Enter the Breadth --> ");
			  int Breadth = in.nextInt();
			  
			  System.out.println("Area Of Rectangle is --> " +Lenght*Breadth +" CM2");	 
		  }
	}
	class InheritanceB extends InheritanceA {
		 public void AreaOfSquare() {
			 
			 System.out.print("Enter the Side --> ");
			 int Side = in.nextInt();
			 
			 System.out.println("Area Of Square is --> " +Side*Side+" CM2");			 
		}
	 }
	class InheritanceC extends InheritanceB {
		 public void AreaOfCircle() {
			 System.out.print("Enter the Radius --> ");
			 double Radius = in.nextDouble();
			System.out.println("Area Of Circle is --> " + 22/7*Radius*Radius+" CM2");
		}
	 }
	public class CalculatingAreas {
		 public static void main(String[] args) {
			 InheritanceC obj = new InheritanceC();
		   	 obj.AreaOfRectangle();
		 	 obj.AreaOfSquare();
		 	 obj.AreaOfCircle(); 
		 	 
		}
	}