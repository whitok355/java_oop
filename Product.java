import java.util.GregorianCalendar;

/**
 * Product
 */
public abstract class Product {

    private String name;
    private Double price;
    private Integer quantity;
    private GregorianCalendar best_before;
    
    public Product(String name, Double price, Integer quantity, GregorianCalendar best_before){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.best_before = best_before;
    }

    public String get_name(){
        return this.name;
    }

    public Double get_price(){
        return this.price;
    }

    public Integer get_quantity(){
        return this.quantity;
    }

    public GregorianCalendar get_best_before(){
        return this.best_before;
    }

}