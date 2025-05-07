package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int qtde = 0;
	        int tot80 = 0;
	        double media_altura = 0;

	        for (int cont_time = 1; cont_time <= 5; cont_time++) {
	            double soma_idade = 0; 

	            for (int cont_jog = 1; cont_jog <= 11; cont_jog++) {
	                System.out.println("Time " + cont_time + ", Jogador " + cont_jog);

	                System.out.print("Idade: ");
	                int idade = scanner.nextInt();

	                System.out.print("Peso (kg): ");
	                double peso = scanner.nextDouble();

	                System.out.print("Altura (m): ");
	                double altura = scanner.nextDouble();

	                if (idade < 18) {
	                    qtde++;
	                }

	                if (peso > 80) {
	                    tot80++;
	                }

	                soma_idade += idade;
	                media_altura += altura;
	            }

	            double media_idade_time = soma_idade / 11.0;
	            System.out.println("Média de idade do Time " + cont_time + ": " + media_idade_time);
	            System.out.println();
	        }

	        double media_altura_geral = media_altura / 55.0;
	        double porcentagem_peso80 = (tot80 * 100.0) / 55.0;

	        System.out.println("Quantidade de jogadores com menos de 18 anos: " + qtde);
	        System.out.println("Média de altura dos jogadores: " + media_altura_geral);
	        System.out.println("Porcentagem de jogadores com peso acima de 80kg: " + porcentagem_peso80 + "%");

	        scanner.close();
	    }
	}


