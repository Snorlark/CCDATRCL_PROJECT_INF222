package Products;

import javafx.scene.control.SpinnerValueFactory;

public class filodroid {
   
    private String productName;
    private double productPrice;
    private String productImage;
    private boolean productStatus = false;
    private double qty;
    private String productId;

    // public filodroid(String productName, double productPrice, double qty) {
    //     this.productName = productName;
    //     this.productPrice = productPrice;
    //     this.qty = qty;
    // }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    public String getProductImage() {
        return this.productImage;
    }

    public void setProductImage(String path) {
        this.productImage = path;
    }

    public boolean getProductStatus() {
        return this.productStatus;
    }

    public void setProductStatus(boolean status) {
        this.productStatus = status;
    }

    public double getProductQuantity() {
        return this.qty;
    }

    public void addProductQuantity(double quantity) {
        this.qty = quantity;
    }
}