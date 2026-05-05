package exercicios.core.heranca.SistemaRH;

import exercicios.core.heranca.SistemaRH.model.Desenvolvedor;
import exercicios.core.heranca.SistemaRH.model.Endereco;
import exercicios.core.heranca.SistemaRH.model.Funcionario;
import exercicios.core.heranca.SistemaRH.model.TechLead;

public class SistemaRH {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua DevsJava", "Backend");
        Desenvolvedor dev1 = new Desenvolvedor("Lucas", 7500, endereco, "Java");
        Desenvolvedor dev2 = new Desenvolvedor("Enzo", 4200, endereco, "React");

        TechLead techLead = new TechLead("Maria", 12500, endereco, 1800);

        Desenvolvedor[] squad = {dev1, dev2};
        techLead.setSquad(squad);

        System.out.println(techLead);

    }
}
