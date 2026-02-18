package exercicios.introducao;

/*
    Crie um programa onde você define um número inteiro em uma variável.
    O programa deve verificar se esse número é Par ou Ímpar e imprimir a mensagem correspondente.
*/
public class Ex01ParOuImpar {
    public static void main(String[] args) {
        int numero = 10;
        if (numero % 2 == 0) {
            System.out.println("Número : " + numero + " é PAR!");
        } else {
            System.out.println("Número : " + numero + " é ÍMPAR!");
        }
    }
}
