import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = in.nextInt();
            C[i] = A[i] + B[i];
        }

        System.out.print("Vetor C (soma): ");
        for (int x : C) System.out.print(x + " ");
    }
}
