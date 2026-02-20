package exercicios.introducao;

/*
    Este é um problema clássico de lógica e entrevistas técnicas.
    Crie uma matriz quadrada de números inteiros (ex: 3x3).
    Crie um algoritmo que some apenas os números que formam a diagonal principal
    da matriz (do canto superior esquerdo até o canto inferior direito).
*/
public class Ex13DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] arrayInt = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int totalDiagonal = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.print(arrayInt[i][j] + " | ");
                if (i == j) {
                    totalDiagonal += arrayInt[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Total da diagonal principal : " + totalDiagonal);
    }
}
