package exercicios.core.heranca.SistemaRH.model;

public class TechLead extends Funcionario {
    private double bonusLideranca;
    private Desenvolvedor[] squad;

    public TechLead(String nome, double salario, Endereco endereco, double bonusLideranca) {
        super(nome, salario, endereco);
        this.bonusLideranca = bonusLideranca;
    }

    @Override
    public String toString() {
        String relatorio = "[TECHLEAD] | " + super.toString() + " | Bônus Liderança: R$" + this.bonusLideranca;
        relatorio += "\n------ SQUAD ------";

        if (this.squad == null) {
            relatorio += "\n- Nenhum dev na squad.";
            return relatorio;
        } else {
            for (Desenvolvedor dev : this.squad) {
                relatorio += "\n- [DEV] " + dev.toString();
            }
        }
        return relatorio;
    }

    public double getBonusLideranca() {
        return bonusLideranca;
    }

    public void setBonusLideranca(double bonusLideranca) {
        this.bonusLideranca = bonusLideranca;
    }

    public Desenvolvedor[] getSquad() {
        return squad;
    }

    public void setSquad(Desenvolvedor[] squad) {
        this.squad = squad;
    }
}
