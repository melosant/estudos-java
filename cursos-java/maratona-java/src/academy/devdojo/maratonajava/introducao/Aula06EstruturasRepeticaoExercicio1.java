package academy.devdojo.maratonajava.introducao;
/*
    Imprime os valores pares entre 0 a 1.000.000
    Utilizando laço de repetição for
*/
public class Aula06EstruturasRepeticaoExercicio1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
