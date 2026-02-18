package exercicios.introducao;

/*
    Crie um programa que comece com uma variável soma = 0 e uma variável contador = 1.
    Enquanto a soma for menor que 100, adicione o valor do contador à soma e imprima o valor atual.
    Aumente o contador em 1 a cada volta.
    Objetivo: Ver em que momento a soma ultrapassa 100.
*/
public class Ex04SomatorioWhile {
    public static void main(String[] args) {
        int soma = 0;
        int contador = 1;
        while (soma < 100){
            soma += contador;
            System.out.println(contador + " : " + soma);
            contador++;
        }
    }
}
