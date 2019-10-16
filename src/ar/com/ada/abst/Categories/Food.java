package ar.com.ada.abst.Categories;

import ar.com.ada.abst.Superclass.Products;

import java.util.Objects;

public abstract class Food extends Products {
        protected String day;
        protected Double totalPay;

        public Food(){}

        public Food(String day){
            this.day = day;
        }

    public Food(String products, Double price, String day){
        super(products, price);
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public Double discount(){
        if (day.equals("Martes") || day.equals("Jueves")) {
            dsct = (price * 0.10);
            totalPay =  (price * 0.10)- price;
        } else {
            dsct = 0.0;
            totalPay = price;
        }
        return totalPay;
    }


    @Override
    public int hashCode() {
        return -44 * Objects.hash(this.day);
    }

    @Override
    public String toString() {
        return "Products: [Products: "+ this.productName + " Price: " + this.price + " day: " + this.day + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Food that = (Food) obj;
        return this.day.equals(that.day) && super.equals(obj);
    }
}
