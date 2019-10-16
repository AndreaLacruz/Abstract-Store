package ar.com.ada.abst.Producst.Toys;

import ar.com.ada.abst.Categories.Toys;

import java.util.Objects;

public class Barbie extends Toys {
    protected String name;

    public Barbie(){
    }

    public Barbie(String name){
        this.name = name;
    }

    public Barbie(String productName, Double price, Double units, String name){
        super(productName, price, units);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double discount() {
        return super.discount();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Barbie that = (Barbie) obj;
        return this.name.equals(that.name) && super.equals(that);
    }

    @Override
    public String toString() {
        return "Products: [Products: " + this.productName + " price: " + this.price + " units "
                + this.units + " name:" + this.name + "]";
    }

    @Override
    public int hashCode() {
        return -543 * Objects.hash(this.name);

    }
}
