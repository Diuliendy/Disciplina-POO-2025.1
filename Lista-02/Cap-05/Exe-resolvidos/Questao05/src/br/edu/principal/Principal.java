package br.edu.principal;
import java.util.Scanner;
public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de termos: ");
	        int numTermos = scanner.nextInt();

	        System.out.print("Digite o valor de x: ");
	        double x = scanner.nextDouble();

	        double s = 0;
	        int denominador = 1;
	        int den = 1; 
	        for (int i = 1; i <= numTermos; i++) {
	            int fim = denominador;
	            long fat = 1;

	            for (int j = 1; j <= fim; j++) {
	                fat *= j;
	            }

	            int expoente = i + 1;
	            double termo = Math.pow(x, expoente) / fat;

	            if (expoente % 2 == 0) {
	                s -= termo;
	            } else {
	                s += termo;
	            }

	           
	            if (denominador == 4) {
	                den = -1;
	            } else if (denominador == 1) {
	                den = 1;
	            }

	            if (den == 1) {
	                denominador++;
	            } else {
	                denominador--;
	            }
	        }

	        System.out.printf("Resultado da série: %.6f\n", s);

	        scanner.close();
	    }
	}


