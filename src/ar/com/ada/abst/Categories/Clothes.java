package ar.com.ada.abst.Categories;

import ar.com.ada.abst.Superclass.Products;

import java.util.Objects;

public abstract class Clothes extends Products {
    protected String items;
    protected Double totalPay;

    public Clothes(){}

    public Clothes(String items){
        this.items = items;
    }

    public Clothes(String items, Double totalPay){
        this.items = items;
        this.totalPay = totalPay;
    }

    public Clothes(String productName, Double price, String items){
        super(productName, price);
        this.items = items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return items;
    }

    public void setTotalPay(Double totalPay) {
        this.totalPay = totalPay;
    }

    public Double getTotalPay() {
        return totalPay;
    }

    @Override
    public Double discount() {
            dsct = (price * 0.15);
            totalPay = (price * 0.15)-price;
            return totalPay;
    }

    @Override
    public String toString() {
        return "Products: [Product name: " + productName + " price: " + price + " items: " + items
                + " total to pay: " + totalPay + "]";
    }

    @Override
    public int hashCode() {
        return -55 * Objects.hash(this.items, this.totalPay);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Clothes that = (Clothes) obj;
        return this.items.equals(that.items) && this.totalPay.equals(that.totalPay) && super.equals(that);
    }
}
