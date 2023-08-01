// Реализовать метод оформления заказ createOrder(...):
// нужно пройти по продуктам, проверить наличие (>0), "запомнить цену"
// Создать объек Order с полями List<Product>, который содержит только продукты из наличия, и поле стоимость - сумма цен продуктов, входящих в заказ.
// Вернуть объект Order. В классе Order переопределить метод toString() - показывать состав заказа, заказчика и общую стоимость продуктов.

// (**) При заказе от человека учитывать желаемый объем или вес и, для напитков температуру, продуктов.
// + любые доработки по желанию - добавить комментарии к коду

// Формат сдачи: ссылка на гитхаб проект



import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] nomenclature = {"Apricot", "Pineapple ", "Orange", "Watermelon", "Banana", "Mutton", "Pancake", "Grape"};
        Double[] price = {34.3, 56.3, 23.5, 89.3, 12.3, 45.4, 23.5, 90.3};
        GregorianCalendar[] best_before = {
        new GregorianCalendar(2023, 10, 0, 0, 0),
        new GregorianCalendar(2023, 11, 0, 0, 0),
        new GregorianCalendar(2024, 03, 0, 0, 0),
        new GregorianCalendar(2023, 12, 0, 0, 0),
        new GregorianCalendar(2023, 10, 0, 0, 0),
        new GregorianCalendar(2024, 01, 0, 0, 0),
        new GregorianCalendar(2024, 02, 0, 0, 0),
        new GregorianCalendar(2023, 07, 0, 0, 0)
    };
        Integer max_price;
        ArrayList<Product> product_list = new ArrayList<>();

        for(int i = 1; i <= 20; i++){
            Product product = new Product(
                    nomenclature[get_random(nomenclature.length)],
                    price[get_random(nomenclature.length)],
                    get_random(nomenclature.length),
                    best_before[get_random(nomenclature.length)]
                );
            product_list.add(product);
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("\nХотите сделать заказ? 1 - хочу, 2 -не хочу \n Введите значение: ");
        Integer value = scan.nextInt();

        System.out.print("Укажите предельную цену продукта (целое число)");
        max_price = scan.nextInt();

        show_product(product_list, max_price); 

        if(value == 1){
           create_order(product_list, max_price);
        } else{
            System.out.print("До новых встреч");
        }
    }
    
    /*
     * Метод формирующий случайные числа, для заполнения списка товаров
     */
    public static Integer get_random(Integer max){ 
        Random rand = new Random();
        return rand.nextInt(max);
    }

    /*
     * Метод перебирающий список товаров.
     * list - список товара
     * param - параметр для сортировки (цена)
     */
    public static void show_product(ArrayList<Product> list, Integer param){ // 
        System.out.print("В нашем магазине на текущий момент имеется\n");
        list.forEach(product -> {
            if(product.get_price() < param){
                System.out.println();
                System.out.printf("%s - %s", list.indexOf(product)+1, product.toString());
            }
        });
    }

    /*
     * Метод по соданию заказа
     * param - параметр пожелания покупателя (в данном случае по цене товара)
     * list - список всех продуктов  
     */

    public static void create_order(ArrayList<Product> list, Integer param){
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> order_list = new ArrayList<>();

        Boolean flag = true;

        while(flag){
            System.out.print("\nУкажите id товара, который вы бы хотели приобрести (для выхода введите 999)");
            Integer id = scan.nextInt();
            if(id == 999 && list.size() == 0){
                System.out.print("Очень жаль, что вы не сделали заказ. До новых встреч");
                flag = false;
            } else if(id == 999 && list.size() != 0){
                System.out.print("Ваш заказ:");
                Order order = new Order(order_list);
                order.show_order();
                System.out.printf("\n Стоимость Вашего заказа: %s", order.show_summ());
                flag = false;
            } else{
                if(list.get(id-1).get_quantity() == 0){
                    System.out.print("Данного товара нет в наличие\n");
                } else {
                    if(list.get(id-1).get_price() > param){
                        System.out.print("Стоиомсть товара превышает Ваши ожидания\n");
                    } else{
                        order_list.add(list.get(id-1));
                        System.out.print("Товар добавлен в заказ \n");
                    }
                }
            }
        }
    }

}