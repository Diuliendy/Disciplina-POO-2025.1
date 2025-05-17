package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Quadrado {

		double lado;
		
	public Quadrado(double lado) {
		Scanner sc= new Scanner(System.in);
		
		lado=sc.nextDouble();
		
	}

	public double calcularArea() {
		return(lado*lado);
	}
	}


