package br.edu.principal;
import java.util.Scanner;
public class Principal {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double n1, n2, media, media_classe = 0;
	        int tr = 0, te = 0, ta = 0;
	        double total_classe = 0;

	        for (int cont = 1; cont <= 6; cont++) {
	            System.out.print("Digite a 1ª nota do aluno " + cont + ": ");
	            n1 = scanner.nextDouble();

	            System.out.print("Digite a 2ª nota do aluno " + cont + ": ");
	            n2 = scanner.nextDouble();

	            media = (n1 + n2) / 2;
	            System.out.println("Média: " + media);

	            if (media <= 3) {
	                tr++;
	                System.out.println("Reprovado");
	            } else if (media < 7) {
	                te++;
	                System.out.println("Exame");
	            } else {
	                ta++;
	                System.out.println("Aprovado");
	            }

	            total_classe += media;
	        }

	        System.out.println("\nTotal de Reprovados: " + tr);
	        System.out.println("Total de Exame: " + te);
	        System.out.println("Total de Aprovados: " + ta);

	        media_classe = total_classe / 6;
	        System.out.println("Média da classe: " + media_classe);

	        scanner.close();
	    }
	}


