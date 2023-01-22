import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        //primeiro colchete = linha
        //segundo colchete = coluna
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) { //navegando na matriz
            for (int j = 0; j < M[i].length; j++) { //navegando na linha (array unidimensional)
                M[i][j] = random.nextInt(10); //atribuindo um número aleatoriamente à posição do elemento
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha) {
                System.out.print(coluna + "  ");
            }
            System.out.println();
        }
    }
}