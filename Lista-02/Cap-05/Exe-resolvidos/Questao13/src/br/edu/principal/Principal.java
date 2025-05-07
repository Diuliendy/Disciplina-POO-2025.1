package br.edu.principal;
import java.util.Scanner;
public class Principal {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int tot_m = 0, tot_f = 0, tot_24 = 0;
	        int num_cri;
	        String sexo;
	        int meses;

	        System.out.print("Digite o número de crianças: ");
	        num_cri = scanner.nextInt();

	        if (num_cri == 0) {
	            System.out.println("NENHUMA CRIANÇA DIGITADA");
	        } else {
	            for (int i = 1; i <= num_cri; i++) {
	                System.out.print("Digite o sexo da " + i + "ª criança (M ou F): ");
	                sexo = scanner.next().toUpperCase();

	                System.out.print("Digite o tempo de vida (em meses) da " + i + "ª criança: ");
	                meses = scanner.nextInt();

	                if (sexo.equals("M")) {
	                    tot_m++;
	                } else if (sexo.equals("F")) {
	                    tot_f++;
	                }

	                if (meses <= 24) {
	                    tot_24++;
	                }
	            }

	            double porc_m = (double) tot_m * 100 / num_cri;
	            double porc_f = (double) tot_f * 100 / num_cri;
	            double porc_24 = (double) tot_24 * 100 / num_cri;

	            System.out.printf("Percentual de crianças do sexo feminino mortas: %.2f%%\n", porc_f);
	            System.out.printf("Percentual de crianças do sexo masculino mortas: %.2f%%\n", porc_m);
	            System.out.printf("Percentual de crianças com 24 meses ou menos mortas: %.2f%%\n", porc_24);
	        }

	        scanner.close();
	    }
	}


