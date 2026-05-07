package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 4);
        int result = (int) calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(30, 5));
        System.out.println(calculadora.divideDoisNumeros(20,0));

        System.out.println();
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println();
        calculadora.imprimeDivisaoZero(86, 5);
        calculadora.imprimeDivisaoZero(86, 0);
    }
}