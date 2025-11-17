import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int pos = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o valor de A[" + i + "]: ");
            A[i] = ler.nextInt();
        }

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o valor de B[" + i + "]: ");
            B[i] = ler.nextInt();
        }

        for(int i = 0; i < 10; i++){
            int repeticoes = 0;
            for(int j = 0; j < 10; j++){
                if(A[i] == B[j]){
                    repeticoes++;
                }
            }
            if(repeticoes == 0){
                C[pos] = A[i];
                pos++;
            }
        }

        System.out.print("\nVetor C (diferença entre A e B): ");
        for(int i = 0; i < pos; i++){
            System.out.print(C[i] + " ");
        }
    }
}