package Aula06;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / 5;
        System.out.printf("A média final do aluno é: %.2f%n", media);

        scanner.close();
    }
}
