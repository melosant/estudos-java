package academy.devdojo.maratonajava.introducao;

/*
    Dado os valores de 1 a 7, imprima se é dia útil ou fim de semana
    considerando 1 como domingo. Utilizando switch!!!
*/
public class Aula05EstruturasCondicionaisExercicio2 {
    public static void main(String[] args) {
        byte dia = 5;

        // percorre ate achar o break.
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Dia informado não reconhecido.");
                break;
        }
    }
}
