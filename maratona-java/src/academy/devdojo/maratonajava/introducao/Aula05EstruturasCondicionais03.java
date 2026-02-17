package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        boolean possoDoar = salario > 5000 ? true : false;

        System.out.println(resultado);
        System.out.println(possoDoar);

        // -------
        // NÃO RECOMENADADO (MAIS DE UMA CONDIÇÃO)
        int idade = 17;
        String categoria;

        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);
    }
}
