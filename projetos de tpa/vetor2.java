import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int[] a = new int[5];
        int i, n;

        for(i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            a[i] = ler.nextInt();
        }

        for(i = 0; i < 5; i++){
            System.out.println("Tabuada de " + a[i] + ":");
            
            for(n = 1; n <= 10; n++){
                System.out.println(a[i] + " x " + n + " = " + (a[i] * n));
            }

            System.out.println();
        }

    }
}