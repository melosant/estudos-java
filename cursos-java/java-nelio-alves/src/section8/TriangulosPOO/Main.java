package section8.TriangulosPOO;

public class Main {
    public static void main(String[] args) {
        Triangle tX = new Triangle(3.0, 4.0, 5.0);
        Triangle tY = new Triangle(7.5, 4.5, 4.02);

        System.out.printf("Triangle X area: %.4f\n", tX.getArea());
        System.out.printf("Triangle Y area: %.4f\n", tY.getArea());

        String large = (tX.getArea() > tY.getArea()) ? "Large Area: X" : "Large Area: Y";
        System.out.println(large);


    }
}
