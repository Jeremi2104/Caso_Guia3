package com.senati.eti;

import java.util.Scanner;

public class CASO8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Ingrese el numero");
		int n = sc.nextInt();
		
		System.out.println("\nTable del " + n );
		System.out.println("===========");
		
		for (int  i = 1 ; i <= 15; i++)  
			System.out.println(n + " x " + i + " = " + (n * i )); 
		 

	}

}
