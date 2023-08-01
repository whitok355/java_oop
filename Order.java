import java.util.ArrayList;

public class Order{

    private ArrayList<Product> order;
    private Double summ = 0.00;

    public Order(ArrayList<Product> order){
        this.order = order;
    } 

    public Double show_summ(){
        this.order.forEach(product ->{
            this.summ += product.get_price();
        });

        return this.summ;
    }

    public void show_order(){
        this.order.forEach(product -> {
            System.out.println();
            System.out.printf("%s - %s", this.order.indexOf(product)+1, product.toString());
        });
    }
}
