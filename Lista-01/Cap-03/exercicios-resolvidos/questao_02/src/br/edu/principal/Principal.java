package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Digite sua terceira nota: ");
		nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua média é: " + media);

	}

}

