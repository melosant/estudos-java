package exercicios.introducao;

/*
    Crie um array com os números de 1 a 10 (ex: int[] numeros = {1, 2, 3...}).
    Crie duas variáveis para contar: qtdPares e qtdImpares.
    Percorra o array e, usando o operador %, identifique se cada número é par ou ímpar,
    incrementando o contador correto. No final, exiba a quantidade de números pares e ímpares encontrados.
*/
public class Ex09SeparadorParImpar {
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i : numeros) {
            if (i % 2 == 0) {
                qtdPares += 1;
            } else {
                qtdImpares += 1;
            }
        }

        System.out.println("Quantidade de Pares : " + qtdPares);
        System.out.println("Quantidade de Impares : " + qtdImpares);
    }
}
