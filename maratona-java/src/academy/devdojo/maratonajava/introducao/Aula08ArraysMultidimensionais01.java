package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula08ArraysMultidimensionais01 {
    // 1,2,3,4 Meses
    // 31,28,31, 30 Dias
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        System.out.println(dias[0][0]);
        System.out.println(dias[0][1]);
        System.out.println(dias[0][2]);

        System.out.println("-------------------");

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-------------------");

        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
