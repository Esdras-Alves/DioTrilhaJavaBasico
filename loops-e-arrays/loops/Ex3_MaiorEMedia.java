import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a soma e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int maior = 0;
        int soma = 0;
        int media = 0;
        do {
            System.out.println("Digite o número: ");
            int numero = scanner.nextInt();

            soma = soma + numero;
            if (count == 4) media = soma / 5;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
}
