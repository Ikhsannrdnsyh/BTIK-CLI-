package pbo_b.tik;

public class Product {
    private String nameProduct;
    private String size;
    private int quantity;
    private int price;

    public Product(String nameProduct, String size, int quantity, int price) {
        this.setNameProduct(nameProduct);
        this.setSize(size);
        this.setQuantity(quantity);
        this.setPrice(price);
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}

