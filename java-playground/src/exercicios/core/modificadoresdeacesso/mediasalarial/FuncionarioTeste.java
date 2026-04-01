package exercicios.core.modificadoresdeacesso.mediasalarial;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        double[] salarios = {7000, 7500, 9200};
        funcionario.setSalarios(salarios);
        funcionario.calcularMedia();
//        funcionario.setMedia(7900);
        System.out.println("Funcionário: " + funcionario.getNome() +"\nMédia Salarial: " + funcionario.getMedia());
    }
}
