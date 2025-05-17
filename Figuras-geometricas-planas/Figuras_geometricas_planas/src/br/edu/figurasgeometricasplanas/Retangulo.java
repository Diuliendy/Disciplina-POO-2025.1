package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Retangulo {
	

		double base;
		double altura;
		
	public Retangulo(double base, double altura) {
		Scanner sc= new Scanner(System.in);
		
		base=sc.nextDouble();
		altura=sc.nextDouble();
	}

	public double calcArea() {
		return(base*altura);
	}
	}


