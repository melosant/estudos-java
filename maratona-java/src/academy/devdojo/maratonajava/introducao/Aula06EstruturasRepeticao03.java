package academy.devdojo.maratonajava.introducao;
// codigo do exercicio 2 refeito com continue
public class Aula06EstruturasRepeticao03 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue; // ignora os que atendem a condição
            }
            System.out.println("Parcela: " + parcela + "x\nValor Parcela: R$" + valorParcela);
        }
    }
}
