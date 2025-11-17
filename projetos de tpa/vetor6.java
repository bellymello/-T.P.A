public class Main {
    public static void main(String[] args) {
        int[] a = new int[11];
        int valor = 1;

        for(int i = 0; i < 11; i++){
            a[i] = valor;
            valor = valor * 2;
        }

        for(int i = 0; i < 11; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}