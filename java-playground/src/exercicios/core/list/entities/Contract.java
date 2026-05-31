package exercicios.core.list.entities;

public class Contract {
    private Integer id;
    private String contractor;
    private Double contractValue;

    public Contract(Integer id, String contractor, Double contractValue) {
        this.id = id;
        this.contractor = contractor;
        this.contractValue = contractValue;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | CONTRACTOR: " + contractor + " | VALUE: $" + String.format("%.2f", contractValue);
    }

    public void valueAdjustment(double percent) {
        contractValue += (contractValue * (percent / 100));
    }

    public Integer getId() {
        return id;
    }

    public String getContractor() {
        return contractor;
    }

    public Double getContractValue() {
        return contractValue;
    }
}
