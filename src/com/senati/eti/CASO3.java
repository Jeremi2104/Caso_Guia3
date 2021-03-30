package com.senati.eti;

import java.util.Scanner;

public class CASO3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int factorial = 1, n = 0 ;
		 
		System.out.print("Ingrese el numero........: ");
		int numero = sc.nextInt();
		
		for(int i = numero; i > 0 ; i -- ) {
			factorial=factorial*i;
		}
		System.out.println("El factorial de  " + numero + " es  " + " ..........: " + factorial);
		System.out.println("El numero es superior de ..: " + (numero-1) ); 
		

		}
	}

		// Factorial 
		// 1 * 2 * 3 .......... * n
		
