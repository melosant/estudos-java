package section8.Funcionario.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        setName(name);
        setGrossSalary(grossSalary);
        setTax(tax);
    }

    @Override
    public String toString() {
        return "Employee: " + this.name + ", $ " + String.format("%.2f", netSalary());
    }

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.grossSalary += this.grossSalary * (percentage/100);
        }
    }

    public void setName(String name) {
        if (name.isBlank() || name.equals(" ")) return;
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        if (grossSalary <= 0) return;
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        if (tax < 0) return;
        this.tax = tax;
    }
}
