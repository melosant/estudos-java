package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        // primitive types
        int num = 18;
        long numGrande = 100000;
        double numDouble = 2000;
        float numFloat = 2500.0F;
        byte numByte = -128;
        short numShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        char caractereUniCode = '\u0041';
        int numCast = (int) 2500.5F;
        int numCastLong = (int) 10000000000L;
        // reference type
        String nome = "Goku";

        System.out.println("Eu tenho " + num + " anos.");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("Caractere ASCII " + caractere);
        System.out.println("Caractere UniCode " + caractereUniCode);
        System.out.println(numFloat);
        System.out.println(numCast);
        System.out.println(numCastLong);
        System.out.println("Oi meu nome é " + nome);
    }
}
