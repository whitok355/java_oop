public class Hot_Automat extends Automat{
    
    public Product getProduct(String name,  double volume, double temp){
        for(Product el: list_products){
            if (el instanceof Hot_Beverage){
                if ((((Hot_Beverage) el).get_name().equals(name))&&
                    (((Hot_Beverage) el).get_volume() == (volume))&&
                    (((Hot_Beverage) el).get_temp() == temp)){
                      return el;  
                    }
            }
        }
        return null;
    }
}
