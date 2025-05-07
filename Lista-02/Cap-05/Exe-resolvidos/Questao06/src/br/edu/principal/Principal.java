package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        final double SAL_MIN = 450.0;
	        int cont = 1;

	        while (cont <= 10) {
	            System.out.println("Funcionário #" + cont);

	            
	            System.out.print("Código: ");
	            int codigo = sc.nextInt();

	            System.out.print("Número de horas trabalhadas: ");
	            int nht = sc.nextInt();

	            sc.nextLine(); 
	            
	            String turno;
	            do {
	                System.out.print("Turno (M/V/N): ");
	                turno = sc.nextLine().toUpperCase();
	            } while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N"));

	            
	            String categoria;
	            do {
	                System.out.print("Categoria (G/O): ");
	                categoria = sc.nextLine().toUpperCase();
	            } while (!categoria.equals("G") && !categoria.equals("O"));

	           
	            double valorHora = 0.0;

	            if (categoria.equals("G")) {
	                valorHora = turno.equals("N") ? SAL_MIN * 0.18 : SAL_MIN * 0.15;
	            } else {
	                valorHora = turno.equals("N") ? SAL_MIN * 0.13 : SAL_MIN * 0.10;
	            }

	           
	            double salInicial = nht * valorHora;

	            double aux;
	            if (salInicial <= 300) {
	                aux = salInicial * 0.20;
	            } else if (salInicial < 600) {
	                aux = salInicial * 0.15;
	            } else {
	                aux = salInicial * 0.05;
	            }

	           
	            double salFinal = salInicial + aux;

	            
	            System.out.println("\n--- Resultado ---");
	            System.out.printf("Código: %d\n", codigo);
	            System.out.printf("Horas trabalhadas: %d\n", nht);
	            System.out.printf("Valor da hora: R$ %.2f\n", valorHora);
	            System.out.printf("Salário inicial: R$ %.2f\n", salInicial);
	            System.out.printf("Auxílio: R$ %.2f\n", aux);
	            System.out.printf("Salário final: R$ %.2f\n", salFinal);
	            System.out.println("------------------\n");

	            cont++;
	        }

	        sc.close();
	    }
	}


