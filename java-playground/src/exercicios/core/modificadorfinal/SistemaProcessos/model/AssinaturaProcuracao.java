package exercicios.core.modificadorfinal.SistemaProcessos.model;

public class AssinaturaProcuracao extends AssinaturaDigital {

    // métodos finais não podem ser sobrescritos
//    @Override
//    public final void assinar() {
//        System.out.println("Documento da Procuração assinado!");
//    }

}


// caso a classe fosse estritamente final a solução seria a composição
// a classe não é, ela TEM uma assinatura
//public class AssinaturaProcuracao {
//    private AssinaturaDigital assinaturaDigital;
//
//    public AssinaturaProcuracao(AssinaturaDigital assinaturaDigital) {
//        this.assinaturaDigital = assinaturaDigital;
//    }
//
//    public void assinarDocumento() {
//        assinaturaDigital.assinar();
//    }
//
//    public AssinaturaDigital getAssinaturaDigital() {
//        return assinaturaDigital;
//    }
//
//    public void setAssinaturaDigital(AssinaturaDigital assinaturaDigital) {
//        this.assinaturaDigital = assinaturaDigital;
//    }
//}