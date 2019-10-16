package ar.com.ada.abst.Categories;

import ar.com.ada.abst.Superclass.Products;

import java.util.Objects;

public abstract class Tools extends Products {
    protected String payMethod;
    protected Double totalPay;

    public Tools(){}

    public Tools(String payMethod){
        this.payMethod = payMethod;
    }

    public Tools(String products, Double price, String payMethod){
        super(products, price);
        this.payMethod = payMethod;
    }

        public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String metodPay) {
        this.payMethod = payMethod;
    }

    @Override
    public Double discount(){
        if (payMethod.equals("TDC")) {
            dsct = (price * 0.05);
            totalPay = (price * 0.05)- price;
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
        Tools that = (Tools) obj;
        return this.payMethod.equals(that.payMethod) && super.equals(that);
    }

    @Override
    public String toString() {
        return "Products: [Products: " + this.productName + " price: " + this.price + " Payement Method "
                + this.payMethod + "]";
    }

    @Override
    public int hashCode() {
        return -543 * Objects.hash(this.payMethod);
    }
}
