package Aula06;

public class exercicio2 {
    public static void main(String[] args) {
        int numero = 1;
        int somaPares = 0;

        // Percorre de 1 até 100
        while (numero <= 100) {
            if (numero % 2 == 0) {
                somaPares += numero; // Acumula o valor se for par
            }
            numero++;
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + somaPares);
    }
}
