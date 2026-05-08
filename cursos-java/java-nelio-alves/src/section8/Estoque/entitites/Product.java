package section8.Estoque.entitites;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    @Override
    public String toString() {
        if (this.name == null) return "Produto não validado.";
        return "Product Data: " + this.name +
                ", R$" + String.format("%.2f", this.price) +
                ", " + this.quantity +
                " units, Total: R$" + String.format("%.2f", this.totalValueInStock());
    }

    public double totalValueInStock() {
        return this.price * this.quantity;
    }

    public void addProducts(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    public void removeProducts(int quantityToRm) {
        if (quantityToRm > this.quantity) {
            System.out.println("Quantidade não disponível no estoque.");
        } else {
            this.quantity -= quantityToRm;
        }
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Informe um nome válido.");
            return;
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("O preço não pode ser negativo.");
            return;
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Informe um valor válido.");
            return;
        }
        this.quantity = quantity;
    }
}
