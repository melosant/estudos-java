package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
