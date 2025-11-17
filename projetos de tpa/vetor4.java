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
            System.out.print("Número " + a[i] + " -> ");
            for(int num = 0; num <= a[i]; num++){
                if(num % 2 == 0){
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}