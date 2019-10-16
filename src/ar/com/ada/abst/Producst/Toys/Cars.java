package ar.com.ada.abst.Producst.Toys;

import ar.com.ada.abst.Categories.Toys;

import java.util.Objects;

public class Cars extends Toys {

    protected String color;

     public Cars(){
    }

    public Cars(String color){
        this.color = color;
    }

    public Cars(String productName, Double price, Double units, String color){
        super(productName, price, units);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Double discount() {
        return super.discount();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Cars that = (Cars) obj;
        return this.color.equals(that.color) && super.equals(that);
    }

    @Override
    public String toString() {
        return "Products: [Products: " + this.productName + " price: " + this.price + " units "
                + this.units + " color:" + this.color + "]";
    }

    @Override
    public int hashCode() {
        return -543 * Objects.hash(this.color);

    }
}

