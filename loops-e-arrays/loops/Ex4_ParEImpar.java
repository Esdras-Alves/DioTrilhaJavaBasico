import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int quantNumeros = scanner.nextInt();
        int count = 0;
        int countImpar = 0, countPar = 0;

        do {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) countPar++;
            else countImpar++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares: " + countPar);
        System.out.println("Quantidade de números impares: " + countImpar);
    }
}
