package br.edu.principal;
import java.util.Scanner;
public class Principal {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int cod, num_vei, num_acid;
	        int maior = 0, menor = 0;
	        int cid_maior = 0, cid_menor = 0;
	        int soma_vei = 0, soma_acid = 0, cont_acid = 0;

	        for (int cont = 1; cont <= 5; cont++) {
	            System.out.println("Cidade " + cont + ":");
	            System.out.print("Código da cidade: ");
	            cod = scanner.nextInt();
	            System.out.print("Número de veículos de passeio: ");
	            num_vei = scanner.nextInt();
	            System.out.print("Número de acidentes com vítimas: ");
	            num_acid = scanner.nextInt();

	            if (cont == 1) {
	                maior = num_acid;
	                cid_maior = cod;
	                menor = num_acid;
	                cid_menor = cod;
	            } else {
	                if (num_acid > maior) {
	                    maior = num_acid;
	                    cid_maior = cod;
	                }
	                if (num_acid < menor) {
	                    menor = num_acid;
	                    cid_menor = cod;
	                }
	            }

	            soma_vei += num_vei;

	            if (num_vei < 2000) {
	                soma_acid += num_acid;
	                cont_acid++;
	            }

	            System.out.println(); 
	        }

	        double media_vei = soma_vei / 5.0;

	        System.out.println("Cidade com maior número de acidentes: " + cid_maior + " (" + maior + " acidentes)");
	        System.out.println("Cidade com menor número de acidentes: " + cid_menor + " (" + menor + " acidentes)");
	        System.out.printf("Média de veículos nas 5 cidades: %.2f\n", media_vei);

	        if (cont_acid == 0) {
	            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
	        } else {
	            double media_acid = (double) soma_acid / cont_acid;
	            System.out.printf("Média de acidentes nas cidades com menos de 2000 veículos: %.2f\n", media_acid);
	        }

	        scanner.close();
	    }
	}

}
