package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int num_op, pecas_op, num_maior = 0;
	        int cont_m = 0, cont_f = 0, tot_pecas = 0;
	        int cont;
	        double media_m = 0, media_f = 0;
	        double salario_op = 0, tot_folha = 0;
	        double salario_maior = 0;
	        String sexo_op;

	        for (cont = 1; cont <= 15; cont++) {
	            System.out.println("Digite o número do " + cont + "º operário: ");
	            num_op = scanner.nextInt();

	            System.out.println("Digite o sexo do operário (M ou F): ");
	            sexo_op = scanner.next().toUpperCase(); 

	            System.out.println("Digite o total de peças fabricadas pelo " + cont + "º operário: ");
	            pecas_op = scanner.nextInt();

	            
	            if (pecas_op <= 30) {
	                salario_op = 450;
	            } else if (pecas_op <= 50) {
	                salario_op = 450 + ((pecas_op - 30) * 0.03 * 450);
	            } else {
	                salario_op = 450 + ((pecas_op - 30) * 0.05 * 450);
	            }

	            System.out.println("O operário de número " + num_op + " recebe salário = R$" + salario_op);

	            
	            tot_folha += salario_op;
	            tot_pecas += pecas_op;

	            if (sexo_op.equals("M")) {
	                media_m += pecas_op;
	                cont_m++;
	            } else {
	                media_f += pecas_op;
	                cont_f++;
	            }

	            
	            if (cont == 1 || salario_op > salario_maior) {
	                salario_maior = salario_op;
	                num_maior = num_op;
	            }
	        }

	        System.out.println("\nTotal da folha de pagamento = R$" + tot_folha);
	        System.out.println("Total de peças fabricadas no mês = " + tot_pecas);

	        if (cont_m == 0) {
	            System.out.println("NENHUM HOMEM");
	        } else {
	            media_m = media_m / cont_m;
	            System.out.println("Média de peças fabricadas por homens = " + media_m);
	        }

	        if (cont_f == 0) {
	            System.out.println("NENHUMA MULHER");
	        } else {
	            media_f = media_f / cont_f;
	            System.out.println("Média de peças fabricadas por mulheres = " + media_f);
	        }

	        System.out.println("O número do operário com maior salário é " + num_maior);

	        scanner.close();
	    }
	}



