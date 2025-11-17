package prjMaiorouMenor;

import java.util.Scanner;

public class Maiores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menores = 0;
        int maiores = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");

            while (!sc.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                sc.next();
            }

            int idade = sc.nextInt();

            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }

        System.out.println("\nQuantidade de menores de idade: " + menores);
        System.out.println("Quantidade de maiores de idade: " + maiores);

        sc.close();
    }
}
