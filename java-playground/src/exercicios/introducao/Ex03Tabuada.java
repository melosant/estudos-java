package exercicios.introducao;

/*
    Escolha um número inteiro (ex: 7).
    Utilize um laço for para imprimir a tabuada desse número de 1 a 10.
    O formato da saída deve ser: "7 x 1 = 7", "7 x 2 = 14", etc.
*/
public class Ex03Tabuada {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
