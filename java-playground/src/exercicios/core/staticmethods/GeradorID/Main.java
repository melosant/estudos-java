package exercicios.core.staticmethods.GeradorID;

public class Main {
    public static void main(String[] args) {
        RegistroProcesso registro1 = new RegistroProcesso("Marcelo");
        RegistroProcesso registro2 = new RegistroProcesso("Carlos", "Validado");
        RegistroProcesso registro3 = new RegistroProcesso("Lana", "Inválido");

        registro1.exibirDadosProcesso();
        registro2.exibirDadosProcesso();
        registro3.exibirDadosProcesso();

        RegistroProcesso.exibirTotalProcessos();
    }
}
