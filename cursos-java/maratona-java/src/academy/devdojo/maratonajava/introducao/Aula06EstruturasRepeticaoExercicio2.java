package academy.devdojo.maratonajava.introducao;
/*
    Dado um valor de um carro, descubra em quantas ele pode ser parcelado
    condicao valorParcela >= 1000
*/
public class Aula06EstruturasRepeticaoExercicio2 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela + "x\nValor Parcela: R$" + valorParcela);
        }
    }
}
