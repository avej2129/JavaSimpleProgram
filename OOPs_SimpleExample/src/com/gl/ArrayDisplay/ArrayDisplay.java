package com.gl.ArrayDisplay;

import java.util.Scanner;

public class ArrayDisplay {
	
	public static void main(String[] args)   {  
		  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		int n=sc.nextInt();  
 
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  {   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: "); 
		System.out.print("{");
		for(int i=0; i<n; i++)  {   
			System.out.print(array[i]+",");
		}
		System.out.print("}");
	}

}
