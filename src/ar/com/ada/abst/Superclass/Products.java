package ar.com.ada.abst.Superclass;

import java.util.Objects;

public abstract class Products {

    protected String productName;
    protected Double price;
    protected Double dsct;

    public Products(){}

    public Products(String productName){
        this.productName = productName;
    }

    public Products(String productName, Double price){
        this.productName = productName;
        this.price = price;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Double getDsct() {
        return dsct;
    }

    public void setDsct(Double dsct) {
        this.dsct = dsct;
    }

    public abstract Double discount();

    @Override
    public String toString() {
        return "Products: [Products name: " + this.productName + " Price: " + this.price + " Discount " + this.dsct
                + "]";
    }

    @Override
    public int hashCode() {
        return -532 * Objects.hash(this.productName, this.price, this.dsct);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Products that = (Products) obj;
        return this.productName.equals(that.productName) && this.price.equals(that.price) && this.dsct.equals(that.dsct);
    }
}

