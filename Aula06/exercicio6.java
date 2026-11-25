package Aula06;

public class exercicio6 {
    public static void main(String[] args) {
        int termo1 = 0;
        int termo2 = 1;
        int contador = 1;

        System.out.println("--- PRIMEIROS 10 NÚMEROS DE FIBONACCI ---");

        while (contador <= 10) {
            System.out.print(termo1 + (contador < 10 ? ", " : "\n"));

            int proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;

            contador++;
        }
    }
}
