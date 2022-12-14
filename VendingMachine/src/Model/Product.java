package Model;

public class Product{
    private String productId;
    private String productName;
    private double price;
    private String Description;

    public Product() {

    }
    public Product(String productId, String productName, double price, String description) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        Description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
//    if(getPreferredPaymentMethod().equals("Card")) return price*2;
        return price;
    }
//
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
