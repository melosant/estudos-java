package exercicios.introducao;

/*
    Declare dois números (double) e uma variável char
    que represente a operação ('+', '-', '*' ou '/').
    Use um switch para calcular o resultado baseado no operador escolhido.
    Se o operador for inválido, exiba uma mensagem de erro.
*/
public class Ex02CalculadoraBasicaSwitch {
    public static void main(String[] args) {
        double num1 = 4;
        double num2 = 7;
        char op = '+';

        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Operador " + op + " inválido.");
                break;
        }
    }
}
