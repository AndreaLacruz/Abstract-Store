package ar.com.ada.abst.Producst.Clothes;

import ar.com.ada.abst.Categories.Clothes;

import java.util.Objects;

public class Socks extends Clothes {
    protected String gender;
    protected String brand;

    public Socks(){}

    public Socks(String gender){
        this.gender = gender;
    }

    public Socks(String gender, String brand){
        this.gender = gender;
        this.brand = brand;
    }

    public Socks(String productName, Double price, String items, String gender, String brand){
        super(productName, price, items);
        this.gender = gender;
        this.brand = brand;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public Double discount() {
        if (gender.equals("Mujer") || gender.equals("Niño")) {
            dsct = (price * 0.15);
            totalPay = (price * 0.15)-price;
        } else {
            dsct = 0.0;
            totalPay = price;
        }

        return totalPay;
    }

    @Override
    public int hashCode() {
        return -567 * Objects.hash(this.brand, this.gender);
    }

    @Override
    public String toString() {
        return "Products: [Product name: " + productName + " price " + price + " items: " + items
                + " gender: " + gender + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Socks that = (Socks) obj;
        return this.gender.equals(that.gender) && this.brand.equals(that.brand) && super.equals(that);
    }
}
