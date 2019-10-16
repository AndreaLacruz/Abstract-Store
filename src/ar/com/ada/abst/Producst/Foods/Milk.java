package ar.com.ada.abst.Producst.Foods;

import ar.com.ada.abst.Categories.Food;

import java.util.Objects;

public class Milk extends Food {
    protected String brand;

    public Milk(){}

    public Milk(String brand){
        this.brand = brand;
    }

    public Milk(String productName, Double price, String day, String brand){
        super(productName, price, day);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public Double discount() {
        return super.discount();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Milk that = (Milk) obj;
        return this.brand.equals(that.brand) && super.equals(obj);
    }

    @Override
    public String toString() {
        return "Products: [product name: " + productName + " price: " + price + " day: " + day
                + " brand: " + brand + "]";
    }

    @Override
    public int hashCode() {
        return -77 * Objects.hash(this.brand);
    }
}
