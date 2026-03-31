package exercicios.core.introducaoclasses.analisadorvendas;

public class ItemSale {
    public String name;
    public int quantity;
    public double price;

    public double calculoSubTotal(){
        double total = this.price * this.quantity;
        return total;
    }
}
