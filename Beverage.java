
import java.util.GregorianCalendar;

public class Beverage extends Product {

    private Double volume;

    public Beverage(String name, Double price, Integer quantity, GregorianCalendar best_before, Double volume){
       super(name, price, quantity, best_before);
       this.volume = volume;
    }
    
    public Double get_volume(){
        return this.volume;
    }

    @Override
    public String toString(){
        return "Product [name =" + get_name() + ", price =" + get_price() + ", quantity = " + get_quantity() + ", best defore =  year " + get_best_before().get(1) + " month: "+ get_best_before().get(2) + " volume = " + get_volume() +"]";
    }
}
