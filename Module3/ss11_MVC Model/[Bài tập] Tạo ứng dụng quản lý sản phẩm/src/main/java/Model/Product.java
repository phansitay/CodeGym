package Model;

public class Product {
    private int id;
    private String nameProduct;
    private int priceProduct;
    private String descriptProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, int priceProduct, String descriptProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.descriptProduct = descriptProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptProduct() {
        return descriptProduct;
    }

    public void setDescriptProduct(String descriptProduct) {
        this.descriptProduct = descriptProduct;
    }
}
