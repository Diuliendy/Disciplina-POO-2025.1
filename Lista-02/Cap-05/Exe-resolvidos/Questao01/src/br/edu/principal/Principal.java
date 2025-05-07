package br.edu.principal;
import java.util.Scanner;
public class Principal {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o ano atual: ");
	        int anoAtual = scanner.nextInt();

	        
	        double salario = 1000.0;
	        double percentual = 1.5 / 100;  // 1.5%
	        double novoSalario = salario + (percentual * salario);

	       
	        for (int ano = 2008; ano <= anoAtual; ano++) {
	            percentual *= 2;
	            novoSalario += novoSalario * percentual;
	        }

	       
	        System.out.printf("Novo salário em %d: R$ %.2f\n", anoAtual, novoSalario);

	        scanner.close();
	    }
	}


