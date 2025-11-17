import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            a[i] = ler.nextInt();
        }

        for(int i = 0; i < 10; i++){
            System.out.print("Divisores de " + a[i] + ": ");
            for(int div = 1; div <= a[i]; div++){
                if(a[i] % div == 0){
                    System.out.print(div + " ");
                }
            }
            System.out.println();
        }
    }
}