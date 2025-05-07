package br.edu.principal;
import java.util.Scanner;
public class Principal {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int i = 4;
	        int num_termos;
	        int num1 = 2;
	        int num2 = 7;
	        int num3 = 3;

	        System.out.print("Digite o número de termos: ");
	        num_termos = scanner.nextInt();

	       
	        System.out.println(num1);
	        System.out.println(num2);
	        System.out.println(num3);

	       
	        while (i != num_termos) {
	            num1 *= 2;
	            System.out.println(num1);
	            i++;
	            if (i != num_termos) {
	                num2 *= 3;
	                System.out.println(num2);
	                i++;
	                if (i != num_termos) {
	                    num3 *= 4;
	                    System.out.println(num3);
	                    i++;
	                }
	            }
	        }

	        scanner.close();
	    }
	}


