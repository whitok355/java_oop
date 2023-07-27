package java_test;
import java.util.List;
import java.util.ArrayList;

public class Automat {
    
    List<Product> list_products = new ArrayList<>();

    public void initProduct(List <Product> list){
        list_products = list;
    }

    public Product getProduct(String name){
        for(Product element: list_products){
            if(element.get_name().equals(name)){
                return element;
            }
        }
        System.out.print("Данного продукта нет");
        return null;
    }
}
