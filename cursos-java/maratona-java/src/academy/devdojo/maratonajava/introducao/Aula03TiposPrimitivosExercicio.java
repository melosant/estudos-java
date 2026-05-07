package academy.devdojo.maratonajava.introducao;

/*
    Crie variáveis para os campos descritos entre <> e imprima a seguinte mensagem

    Eu <nome>, morando no endereço <endereco>,
    confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Giorgian de Arrascaeta";
        String endereco = "Rua Fictícia, 111";
        String dataRecebimentoSalario = "12/02/2026";
        double salario = 1550.52;
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+",\nconfirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
        // System.out.println("Eu "+nome+", morando no endereço "+endereco+",\nconfirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario);
    }
}
