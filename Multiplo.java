
public class Multiplo {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 0; i <= 400; i++) {
            if (i % 5 == 0) {
                soma += i;
            }
        }

        System.out.println("A somatória dos múltiplos de 5 de 0 a 400 é: " + soma);
    }
}
