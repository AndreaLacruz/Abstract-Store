package ar.com.ada.abst.Categories;

import ar.com.ada.abst.Superclass.Products;

import java.util.Objects;

public abstract class Toys extends Products {

    protected Double units;
    protected Double totalPay;

    public Toys(){}

    public Toys(Double units){
        this.units = units;
    }

    public Toys(Double units, Double totalPay){
        this.units = units;
        this.totalPay = totalPay;
    }

    public Toys(String productName, Double price, Double units){
        super(productName, price);
        this.units = units;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double units) {
        this.units = units;
    }

    public Double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Double totalPay) {
        this.totalPay = totalPay;
    }



    @Override
    public Double discount() {
        if (units > 3 || price > 3000) {
            dsct = (price * 0.25);
            totalPay = (price * 0.25)- price;
        } else {
            dsct = 0.0;
            totalPay = price;
        }
        return totalPay;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Toys that = (Toys) obj;
        return this.units.equals(that.units) && this.totalPay.equals(that.totalPay) && super.equals(that);
    }

    @Override
    public String toString() {
        return "Products: [Products: " + this.productName + " price: " + this.price + " units "
                + this.units + " Total to pay: " + this.totalPay + "]";
    }

    @Override
    public int hashCode() {
        return -543 * Objects.hash(this.units, this.totalPay);

    }
}
