import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            B[i] = A[9 - i]; // inverte
        }

        System.out.print("Vetor A: ");
        for (int x : A) System.out.print(x + " ");
        System.out.println();

        System.out.print("Vetor B (invertido): ");
        for (int x : B) System.out.print(x + " ");
    }
}
