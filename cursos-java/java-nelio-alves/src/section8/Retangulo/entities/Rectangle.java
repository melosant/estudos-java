package section8.Retangulo.entities;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    @Override
    public String toString() {
        return "AREA = " + String.format("%.2f", area()) +
                "\nPERIMETER = " + String.format("%.2f", perimeter()) +
                "\nDIAGONAL = " + String.format("%.2f", diagonal());
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public void setWidth(double width) {
        if (width < 0) return;
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) return;
        this.height = height;
    }
}
