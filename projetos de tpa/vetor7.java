import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] a = new int[15];
        int[] b = new int[15];

        for(int i = 0; i < 15; i++){
            System.out.print("Digite um número: ");
            a[i] = ler.nextInt();
        }

        for(int i = 0; i < 15; i++){
            int fat = 1;
            for(int n = 1; n <= a[i]; n++){
                fat = fat * n;
            }
            b[i] = fat;
        }

        System.out.println("\nResultados:");
        for(int i = 0; i < 15; i++){
            System.out.println("A[" + i + "] = " + a[i] + "  |  Fatorial = " + b[i]);
        }
    }
}