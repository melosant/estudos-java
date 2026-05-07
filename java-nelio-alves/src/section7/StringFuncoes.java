package section7;

import java.util.Locale;

public class StringFuncoes {
    public static void main(String[] args) {
        String original = " Flamengo CAMPEÃO libertadores 2026     ";
        System.out.println("Original: " + original);

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(11, 17);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("libertadores", "mundial");
        int i = original.indexOf("Fla");
        int j = original.lastIndexOf("mengo");

        System.out.println("toLowerCase: " + s01);
        System.out.println("toUpperCase: " + s02);
        System.out.println("trim: " + s03);
        System.out.println("substring(2): " + s04);
        System.out.println("substring(11, 17): " + s05);
        System.out.println("replace(a, x): " + s06);
        System.out.println("replace('libertadores', 'mundial'): " + s07);
        System.out.println("indexOf('Fla'): " + i);
        System.out.println("lastIndexOf('mengo'): " + j);

        String[] strSplit = original.trim().split(" ");
        for (int i1 = 0; i1 < strSplit.length; i1++) {
            System.out.println("strSplit[" + i1 + "]: " + strSplit[i1]);
        }
    }
}
