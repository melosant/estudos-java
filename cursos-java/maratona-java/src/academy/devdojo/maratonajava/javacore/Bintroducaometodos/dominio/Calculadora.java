package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20-10);
    }

    public void multiplicaDoisNumeros(int x, float y) {
        System.out.println(x*y);
    }

    public double divideDoisNumeros(double n1, double n2) {
        if (n2 == 0){
            return 0;
        }
        return n1/ n2;
    }

    public double divideDoisNumeros02(double n1, double n2) {
        if (n2 != 0){
            return n1 / n2;
        }
            return 0;
    }

    public void imprimeDivisaoZero(double n1, double n2){
        if (n2 == 0) {
            System.out.println("Nao existe divisao por zero.");
            return; // como se fosse um break, ou um if/else, para metodos void.
        }
        System.out.println(n1 / n2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2= 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int temp: numeros){
            soma += temp;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int temp: numeros){
            soma += temp;
        }
        System.out.println(soma);
    }
}
