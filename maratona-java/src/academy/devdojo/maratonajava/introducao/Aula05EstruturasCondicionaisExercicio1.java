package academy.devdojo.maratonajava.introducao;
/*
    Com base no salário anual, defina o imposto anual aplicado sobre ele
    (taxas da Holanda).
*/
public class Aula05EstruturasCondicionaisExercicio1 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double valorImposto;
        double valorTax;

        if (salarioAnual < 34713) {
            valorImposto = salarioAnual * (9.70 / 100);
        } else if (salarioAnual >= 34713 && salarioAnual < 68508) {
            valorImposto = salarioAnual * (37.35 / 100);
        } else {
            valorImposto = salarioAnual * (49.50 / 100);
        }

        // NÃO RECOMENDADO
        valorTax = salarioAnual < 34713 ? salarioAnual * (9.70 / 100): salarioAnual >= 34713 && salarioAnual < 68508 ? salarioAnual * (37.35 / 100) : salarioAnual * (49.50 / 100);

        System.out.println("Salario Anual : " + salarioAnual + "\nValor total imposto : " + valorImposto);
        System.out.println("Salario Anual : " + salarioAnual + "\nValor total imposto : " + valorTax);
    }
}
