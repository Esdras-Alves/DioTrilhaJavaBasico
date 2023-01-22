import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5! = 120
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scanner.nextInt();
        int multiplicacao = 1;

        for (int i = fatorial; i >= 1; i--) {
            multiplicacao *= i;
        }
        System.out.println(fatorial + "!" + " = " + multiplicacao);
    }
}
