/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {5, -7, 6, 7, 10, 45};
        //normal
        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("");
        //inverso
        System.out.print("Vetor Inverso: ");
        int numero = 5;
        while (numero >= 0) {
            System.out.print(vetor[numero] + " ");
            numero--;
        }

    }
}