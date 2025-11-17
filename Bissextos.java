
import java.util.Scanner;

public class Bissextos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ano inicial: ");
        int anoInicial = scanner.nextInt();
        
        System.out.print("Digite o ano final: ");
        int anoFinal = scanner.nextInt();
        
        int ano = anoInicial;
        int i= 0;
        
        System.out.println("Anos bissextos entre " + anoInicial + " e " + anoFinal + ":");
        
        while (ano <= anoFinal) {
            if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
                System.out.print(ano + " ");
                i++;
            }
            ano++;
        }
        
        System.out.println("Total de anos bissextos: " + i);
        
        scanner.close();
    }
}

