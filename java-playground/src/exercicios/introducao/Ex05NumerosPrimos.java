package exercicios.introducao;

/*
    Defina um número inteiro (ex: 17). Crie um algoritmo que verifique se esse número é Primo.
    Lógica: Um número é primo se ele for divisível apenas por 1 e por ele mesmo.
    Tente dividir o número por todos os valores entre 2 e (numero - 1).
    Se alguma divisão tiver resto 0, ele não é primo.
*/
public class Ex05NumerosPrimos {
    public static void main(String[] args) {
        int num = 10;
        boolean isPrimo = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrimo = false;
                break;
            }
        }

        String resp = (isPrimo == true && num > 1) ? num + " É PRIMO!" : num + " não é PRIMO.";
        System.out.println(resp);

//        if (isPrimo == true && num > 1){
//            System.out.println(num + " É PRIMO.");
//        } else {
//            System.out.println(num + " não é PRIMO.");
//        }
    }
}
