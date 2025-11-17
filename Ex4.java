import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            A[i] = in.nextInt();
            soma += A[i];
        }

        double media = soma / 10.0;

        System.out.print("Vetor A: ");
        for (int x : A) System.out.print(x + " ");
        System.out.println();

        System.out.println("Média dos valores: " + media);
    }
}

