package Aula06;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            // Testa os divisores de 2 até a metade/raiz do número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break; // Otimização: se achou um divisor, não precisa continuar
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O número " + numero + " É PRIMO!");
        } else {
            System.out.println("O número " + numero + " NÃO é primo.");
        }

        scanner.close();
    }
}
