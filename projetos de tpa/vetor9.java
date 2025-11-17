import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int k = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número para A: ");
            A[i] = ler.nextInt();
        }

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número para B: ");
            B[i] = ler.nextInt();
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(A[i] == B[j]){
                    C[k] = A[i];
                    k++;
                    break;
                }
            }
        }

        System.out.println("\nInterseção:");
        for(int i = 0; i < k; i++){
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}