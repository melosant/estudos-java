package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != -> booelan
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte = " + isDezIgualVinte);
        System.out.println("isDezIgualDez = " + isDezIgualDez);
        System.out.println("isDezDiferenteDez = " + isDezDiferenteDez);

        // && (AND), || (OR), ! (NOT)
        int idade = 29;
        float salario = 3550F;
        boolean isDentroDaLeiMaiorTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorTrinta " + isDentroDaLeiMaiorTrinta);
        System.out.println("isDentroDaLeiMenorTrinta " + isDentroDaLeiMenorTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlayCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlayCincoCompravel : " + isPlayCincoCompravel);

        // =  +=  -=  *=  /=  %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        System.out.println(bonus);
        bonus -= 500; // 2300
        System.out.println(bonus);
        bonus *= 2; // 4600
        System.out.println(bonus);
        bonus /= 4; // 1150.0
        System.out.println(bonus);
        bonus %= 3; // 1.0
        System.out.println(bonus);

        // operadores unarios ++ e --
        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++); // 0
        System.out.println(contador2); // 1
    }
}
