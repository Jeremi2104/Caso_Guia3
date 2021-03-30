package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CASO9 {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int n1 = 0, n2 = 0, n3 = 0, nr = 0, num_ocerti = 0, num_scerti = 0;
		float p_mayor = 0, p_menor = 100;
		String nombre = null, estado = "", continuar = "S";
		
		while (continuar.equals("S")|| continuar.equals("s")) {
			nr++;
			System.out.println("-------------------------------------------");
			System.out.println("----------- R E G I S T R O [" + nr + "]  ----------");
			System.out.println("-------------------------------------------");
			
			System.out.print("Nombre del alumno..: ");
			nombre = sc.nextLine();
			
			System.out.print("Nota 1: ");
			n1 = sc.nextInt();
			
			System.out.print("Nota 2: ");
			n2 = sc.nextInt();
			
			System.out.print("Nota 3: ");
			n3 = sc.nextInt();
			
			System.out.print("Ingrese números de asistencias [1-12].: ");
			float asistencia = sc.nextFloat();
			
			float promedio = n1 * 0.2f + n2 * 0.3f + n3 * 0.5f;
			float pa = (asistencia / 12) * 100;
			
			for(int i = 0; i < nr; i++);
				if (promedio > p_mayor) { 
					p_mayor = promedio;
				}
				
			for(int i = 0; i < nr; i++);
				if (promedio < p_menor) { 
				p_menor = promedio;
				}
					
			if (promedio >= 13 && pa >= 70 ) {
				estado = "Obtiene Certificado";
				num_ocerti++;
			}
			else {
				estado = "Sin certificado";
				num_scerti++;
			}
			System.out.println("\n---------------------------------");
			System.out.println("------- R E S U L T A D O -------");
			System.out.println("---------------------------------");
			System.out.println("Promedio......: " + df.format(promedio));
			System.out.println("Asistencia....: " + df.format(pa) + "%");
			System.out.println("Estado........: " + estado);
			System.out.println("-------------------------------------------");
			
			sc.nextLine();
			
			System.out.print("\n¿Desea registrar otro alumno <S/N>: ");
			continuar = sc.nextLine();
			
		}
		System.out.println("\n---------------------");
		System.out.println("-- R E S U M E N --");
		System.out.println("Número de alumnos........: " + nr);
		
		System.out.println("Mayor promedio " + p_mayor + " pertenece a: " + nombre);
		System.out.println("Menor promedio " + p_menor + " pertenece a: " + nombre);
		System.out.println("Número de alumnos certificados...: " + num_ocerti);
		System.out.println("Número de alumnos sin certificado...: " + num_scerti);

		

	}

}
