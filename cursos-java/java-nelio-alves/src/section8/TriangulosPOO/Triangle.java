package section8.TriangulosPOO;

public class Triangle {
    private double area;

    public Triangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        this.area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getArea() {
        return area;
    }
}
