package model;

public class ProductEntity {
    private Product product;
    private int quantity;

    public ProductEntity(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "product " + this.getProduct() + "\n     quantity sold:" + this.getQuantity();
    }
}
