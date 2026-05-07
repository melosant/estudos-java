package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        boolean isMaiorIdade = idade >= 18;
        // se for maior de idade
        if (isMaiorIdade) {
            System.out.println("Pode comprar bebida alcoólica.");
        }else{ // se nao for maior de idade
            System.out.println("Não autorizado à comprar bebida alcoólica.");
        }
    }
}