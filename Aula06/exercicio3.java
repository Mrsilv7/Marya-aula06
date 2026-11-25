package Aula06;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        int contador = numero;

        // Trata o fatorial de 0 e 1, e executa ao menos uma vez para os demais
        if (numero < 0) {
            System.out.println("Número inválido! Digite um valor positivo.");
        } else if (numero == 0) {
            System.out.println("O fatorial de 0 é: 1");
        } else {
            do {
                fatorial *= contador;
                contador--;
            } while (contador > 0);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
