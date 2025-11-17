import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            A[i] = ler.nextInt();
        }

        for(int i = 0; i < 10; i++){
            int soma = 0;
            for(int j = i; j < 10; j++){
                soma += A[j];
            }
            B[i] = soma;
        }

        System.out.println("\nVetor B:");
        for(int i = 0; i < 10; i++){
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}