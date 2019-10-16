package ar.com.ada.abst.Producst.Tools;

import ar.com.ada.abst.Categories.Tools;

import java.util.Objects;

public class Hammer extends Tools {

    protected String brand;

    public Hammer(){
    }

    public Hammer(String brand){
        this.brand = brand;
    }

    public Hammer(String productName, Double price, String payMethod, String brand){
        super(productName, price, payMethod);
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
        Hammer that = (Hammer) obj;
        return this.brand.equals(that.brand) && super.equals(that);
    }

    @Override
    public String toString() {
        return "Products: [Products: " + this.productName + " price: " + this.price + " Payement Method "
                + this.payMethod + " brand: " + brand+ "]";
    }

    @Override
    public int hashCode() {
        return -543 * Objects.hash(this.brand);

    }
}
