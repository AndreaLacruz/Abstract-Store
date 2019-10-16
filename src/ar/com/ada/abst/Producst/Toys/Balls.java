package ar.com.ada.abst.Producst.Toys;

import ar.com.ada.abst.Categories.Toys;

import java.util.Objects;

public class Balls extends Toys {

    protected String type;

    public Balls(){
    }

    public Balls(String type){
        this.type = type;
    }

    public Balls(String productName, Double price, Double units, String type){
        super(productName, price, units);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Double discount() {
        return super.discount();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Balls that = (Balls) obj;
        return this.type.equals(that.type) && super.equals(that);
    }

    @Override
    public String toString() {
        return "Products: [Products: " + this.productName + " price: " + this.price + " units "
                + this.units + " type:" + this.type + "]";
    }

    @Override
    public int hashCode() {
        return -543 * Objects.hash(this.type);

    }
}
