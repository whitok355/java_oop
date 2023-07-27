package java_test;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
       
        ArrayList<Product> product_list = new ArrayList<>();
        ArrayList<Product> hot_product_list = new ArrayList<>();

        Automat automat_list = new Automat();
        Hot_Automat hot_automat_list = new Hot_Automat();

        product_list.add(new Food("apple", 43.19, 13, new GregorianCalendar(2023, 10, 0, 0, 0), 100.4));
        product_list.add(new Beverage("juce", 1.19, 2, new GregorianCalendar(2023, 9, 01, 0 , 0), 300.50));
        product_list.add(new Food("orange", 3.19, 1, new GregorianCalendar(2023, 8, 03, 0 ,0), 90.4));

        hot_product_list.add(new Hot_Beverage("tea", 0.49, 1, new GregorianCalendar(2023, 8, 03, 0 ,0), 43.4, 70.0));
        hot_product_list.add(new Hot_Beverage("tea", 0.49, 1, new GregorianCalendar(2023, 8, 03, 0 ,0), 143.4, 80.0));
        hot_product_list.add(new Hot_Beverage("tea", 0.49, 1, new GregorianCalendar(2023, 8, 03, 0 ,0), 243.4, 90.0));
        hot_product_list.add(new Hot_Beverage("coffe", 0.49, 1, new GregorianCalendar(2023, 8, 03, 0 ,0), 343.4, 100.0));
        hot_product_list.add(new Hot_Beverage("coffe", 0.49, 1, new GregorianCalendar(2023, 8, 03, 0 ,0), 443.4, 30.0));
        hot_product_list.add(new Hot_Beverage("coffe", 0.49, 1, new GregorianCalendar(2023, 8, 03, 0 ,0), 543.4, 50.0));
        
        automat_list.initProduct(product_list);
        hot_automat_list.initProduct(hot_product_list);

        String name = "tea";
        Double volume = 43.4;
        Double temp = 70.0;

        System.out.print(hot_automat_list.getProduct(name, volume, temp));
    
    }
}