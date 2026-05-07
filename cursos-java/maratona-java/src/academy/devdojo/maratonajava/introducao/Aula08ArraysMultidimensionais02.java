package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // type reference inicializa como null
        // não é necessário inicializar o tamanho dos arrays na declaração
        int[][] arrayInt = new int[3][];

        // inicializando tamanho de cada array endereçado
        // as regras de atribuição também se aplicam aqui
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        // inicializando diretamente o array multidimensional
        int[][] arrayInt2 = {
                {0, 0},
                {1, 2, 3},
                {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n---------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
