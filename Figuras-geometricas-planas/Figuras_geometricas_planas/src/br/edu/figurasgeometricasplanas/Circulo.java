package br.edu.figurasgeometricasplanas;
import java.util.Scanner;
public class Circulo {
	

		double raio;
		
	public Circulo( double raio) {
		Scanner sc= new Scanner(System.in);
		
		
		raio=sc.nextDouble();
	}

	public double calcularArea() {
		return(3.14*(raio*raio));
	}
	}


