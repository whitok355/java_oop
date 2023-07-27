package java_test;

import java.util.GregorianCalendar;

public class Food extends Product {

    Double weight;
    public Food(String name, Double price, Integer quantity, GregorianCalendar best_before, Double weight){
        super(name, price, quantity, best_before);
        this.weight = weight;
    }

    public Double get_weight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return "Product [name =" + get_name() + ", price =" + get_price() + ", quantity = " + get_quantity() + ", best defore =  year " + get_best_before().get(1) + " month: "+ get_best_before().get(2) + " volume = " + get_weight() +"]";
    }
}
