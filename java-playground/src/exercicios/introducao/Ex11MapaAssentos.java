package exercicios.introducao;

/*
    Imagine um pequeno auditório com 3 fileiras de 3 cadeiras.
    Crie uma matriz boolean[][] onde true significa que o assento está ocupado
    e false significa que está livre.
    Percorra essa matriz e conte quantos assentos estão livres.
*/
public class Ex11MapaAssentos {
    public static void main(String[] args) {
//        boolean[][] arrayAssentos = new boolean[3][3];
        boolean[][] arrayAssentos = {
                {false, true, true},
                {false, false, true},
                {true, false, true}
        };
        int qtdAssentosLivres = 0;
        int qtdAssentosLOcupados = 0;

/* FOR I PADRÃO:
        for (int i = 0; i < arrayAssentos.length; i++) {
            for (int j = 0; j < arrayAssentos[i].length; j++) {
                System.out.print(arrayAssentos[i][j] + " | ");
                if (arrayAssentos[i][j] == false){
                    qtdAssentosLivres += 1;
                } else {
                    qtdAssentosLOcupados += 1;
               }
            }
            System.out.println("\n----------------------");
        }
*/

        for (boolean[] arrayBase : arrayAssentos) {
            for (boolean assento : arrayBase) {
                System.out.print(assento + " | ");
                if (assento == false) {
                    qtdAssentosLivres += 1;
                } else {
                    qtdAssentosLOcupados += 1;
                }
            }
            System.out.println("\n----------------------");
        }

        System.out.println("\nQtd. Assentos Livres = " + qtdAssentosLivres);
        System.out.println("Qtd. Assentos Ocupados = " + qtdAssentosLOcupados);
    }
}
