package exercicios.core.conceitosPOO.TestePericia;

public class FichaPersonagem {
    private String nome;
    private String[] periciasTreinadas;

    public FichaPersonagem(String nome, String[] periciasTreinadas){
        this.nome = nome;
        this.periciasTreinadas = periciasTreinadas;
    }

    public void realizarTeste(String periciaTestada, int resultadoDado){
        for (String p : periciasTreinadas){
            if (periciaTestada == p){
                resultadoDado += 5;
                System.out.printf("Teste de %s (%d) / Treinamento (%d) / Total = %d%n", periciaTestada, resultadoDado - 5, 5, resultadoDado);
                break;
            }
        }
    }

    public void realizarTeste(String periciaTestada, int resultadoDado, int bonusSituacional){
        for (String p : periciasTreinadas){
            if (periciaTestada == p){
                resultadoDado += 5;
                resultadoDado += bonusSituacional;
                System.out.printf("Teste de %s (%d) / Treinamento (%d) / Bônus (%d) / Total = %d%n", periciaTestada, resultadoDado - 5, 5, bonusSituacional, resultadoDado);
                break;
            }
        }
    }
}