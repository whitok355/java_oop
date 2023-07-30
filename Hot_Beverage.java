import java.util.GregorianCalendar;

public class Hot_Beverage extends Beverage {
    private Double temp;

    public Hot_Beverage(String name, Double price, Integer quantity, GregorianCalendar best_before, Double volume, Double temp){
        super(name, price, quantity, best_before, volume);
        this.temp = temp;
    }

    public Double get_temp(){
        return this.temp;
    }

    @Override
    public String toString(){
        return "Product [name =" + get_name() + ", price =" + get_price() + ", quantity = " + get_quantity() + ", best defore =  year " + get_best_before().get(1) + " month: "+ get_best_before().get(2) + " volume = " + get_volume() + " temperature = " + get_temp() +"]";
    }
}
