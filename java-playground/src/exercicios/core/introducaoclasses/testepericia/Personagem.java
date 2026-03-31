package exercicios.core.introducaoclasses.testepericia;

public class Personagem {
    public String nome;
    public String nomePericia;
    public int bonusPericia;

    public int calcularRolagem(int dado){
        return this.bonusPericia + dado;
    }
}
