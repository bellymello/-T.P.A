import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número para a posição " + i + ": ");
            numeros[i] = ler.nextInt();
        }

        for(int i = 0; i < 10; i++){
            int num = numeros[i];
            int divisores = 0;

            for(int j = 1; j <= num; j++){
                if(num % j == 0){
                    divisores++;
                }
            }

            if(divisores == 2){
                System.out.println(num + " é primo");
            } else {
                System.out.println(num + " não é primo");
            }
        }
    }
}