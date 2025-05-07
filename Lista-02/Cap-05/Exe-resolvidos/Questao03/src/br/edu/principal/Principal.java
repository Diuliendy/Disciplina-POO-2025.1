package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);

     
        System.out.print("Quantos números você quer calcular o fatorial? ");
        int n = scanner.nextInt();

        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();

            long fat = 1;
            for (int j = 1; j <= num; j++) {
                fat *= j;
            }

            System.out.println("Fatorial de " + num + " é: " + fat);
        }

        scanner.close();
      }

	}


