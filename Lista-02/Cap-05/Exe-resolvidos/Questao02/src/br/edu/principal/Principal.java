package br.edu.principal;
import java.util.Scanner;
public class Principal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

           
            System.out.print("Digite o valor de n: ");
            int n = scanner.nextInt();

            double e = 1.0;

            
            for (int i = 1; i <= n; i++) {
                long fatorial = 1;
                for (int j = 1; j <= i; j++) {
                    fatorial *= j;
                }
                e += 1.0 / fatorial;
            }

           
            System.out.printf("Valor aproximado de e: %.10f\n", e);

            scanner.close();
        }
    }


