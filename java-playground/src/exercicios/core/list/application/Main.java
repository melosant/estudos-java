package exercicios.core.list.application;

import exercicios.core.list.entities.Contract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contract> contracts = new ArrayList<>();

        contracts.add(new Contract(111, "Construtora A", 35000.00));
        contracts.add(new Contract(222, "Construtora B", 63500.00));
        contracts.add(new Contract(333, "Construtora C", 12000.00));
        contracts.add(new Contract(444, "Construtora D", 160000.00));
        contracts.add(new Contract(555, "Construtora E", 78000.00));
        contracts.add(new Contract(666, "Construtora E", 97000.00));

        System.out.println("----- CONTRATOS ORIGINAIS -----");
        for (Contract contract : contracts) {
            System.out.println(contract);
        }

        Contract c = contracts.stream().filter(x -> x.getId().equals(222)).findFirst().orElse(null);
        if (c == null) {
            System.out.println("Nao foi possivel achar um contrato com esse ID");
        } else {
            c.valueAdjustment(10.0);
            System.out.println("\nReajuste de contrato realizado. ID:" + c.getId());
        }

        contracts.removeIf(x -> x.getContractValue() < 50000.00);
        System.out.println("----- CONTRATOS ACIMA DOS 50.000 -----");
        for (Contract contract : contracts) {
            System.out.println(contract);
        }

        List<Contract> contractsFiltered = contracts.stream().filter(x -> x.getContractor().equals("Construtora E")).toList();

        System.out.println("\n----- CONTRATOS DA CONSTRUTORA E ------\n");
        for (Contract contract : contractsFiltered) {
            System.out.println(contract);
        }

    }
}
