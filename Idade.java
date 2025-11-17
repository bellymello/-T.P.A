
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual, anoNascimento, idade;

        while (true) {
            System.out.print("Digite o ano atual (ou 0 para sair): ");
            anoAtual = scanner.nextInt();

            if (anoAtual == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.print("Digite o ano de nascimento: ");
            anoNascimento = scanner.nextInt();

            idade = anoAtual - anoNascimento;
            System.out.println("Você tem " + idade + " anos.");
        }

        scanner.close();
    }
}
