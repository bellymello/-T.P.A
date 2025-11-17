package prjCalculeTabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        	
            System.out.print("Digite um número inteiro: ");
            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                sc.next(); // descarta a entrada inválida
            }

            int n = sc.nextInt();

            System.out.println("\nTabuada de " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", n, i, n * i);
            }
        }
    }
}