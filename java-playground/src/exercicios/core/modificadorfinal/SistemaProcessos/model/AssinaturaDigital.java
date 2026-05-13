package exercicios.core.modificadorfinal.SistemaProcessos.model;

// uma classe final não pode ser herdada
// public final class AssinaturaDigital {
//    public void assinar() {
//        System.out.println("Documento assinado");
//    }
// }


// queremos que o método assinar() não seja alterado, logo podemos manter a classe pública
// e somente transformar o método em final
public class AssinaturaDigital {
    public final void assinar() {
        System.out.println("Documento assinado");
    }
}
