import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Informe a nota: ");
            int nota = input.nextInt();
            if (nota < 0 || nota > 10)
                System.out.println("Nota inválida!");
            if ( nota >= 0 && nota <= 10) break;
        }
        System.out.println("Programa Finalizado!");

        // Exemplo 2
        System.out.println("Insira a nota 2: ");
        int nota2 = input.nextInt();

        while(nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida!");
            System.out.println("Insira a nota 2: ");
            nota2 = input.nextInt();
        }
        System.out.println("Programa Finalizado!");
    }
}
