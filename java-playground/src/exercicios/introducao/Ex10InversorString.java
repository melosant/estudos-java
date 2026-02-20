package exercicios.introducao;

/*
    Crie um array de caracteres contendo uma palavra (ex: char[] palavra = {'J', 'A', 'V', 'A'}).
    Usando um laço de repetição, imprima essa palavra de trás para frente.
*/
public class Ex10InversorString {
    public static void main(String[] args) {
        char[] palavra = {'J', 'A', 'V', 'A', '2', '1'};

        for (int i = palavra.length - 1; i >= 0; i--) {
            System.out.print(palavra[i]);
        }
    }
}
