package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            // incrementa 1, imprime e volta o while
            // quando for 9, vai incrementar 1 e imprimir (10)
            System.out.println(++count);
        }

        // executa ao menos uma vez antes de verificar a condição
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        // variável local é necessário inicializá-la antes de comparar e incrementar.
        for (int i = 0; i < 10; i++) {
            System.out.println("For: " + i);
        }
    }
}
