package exercicios.introducao;

/*
    Crie um array contendo 5 notas de um semestre (ex: 8.5, 7.0, 9.0, 6.5, 10.0).
    Utilize um laço de repetição para somar todas as notas e, ao final, calcule e imprima a média geral.
*/
public class Ex06BoletimUnico {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.0, 6.5, 10.0};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        double media = soma / notas.length;
        System.out.println("Média do Aluno: " + media);
    }
}
