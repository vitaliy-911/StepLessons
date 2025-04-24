package HomeWork.GroceryItem;

import HomeWork.StreamApi.Category;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new Customer("Андрей", List.of(
                        new GroceryItem("Milk", Category.DAIRY, 1.2, true),
                        new GroceryItem("Breat", Category.BAKERY, 0.8, true)

                )),
                new Customer("Ирина", List.of(
                        new GroceryItem("Apple", Category.FRUIT, 0.5, true),
                        new GroceryItem("Wine", Category.BEVERAGE, 5.0, false),
                        new GroceryItem("Cheese",Category.DAIRY, 3.0, true)
                )),
                new Customer("Сергей", List.of(
                        new GroceryItem("Eggs", Category.DAIRY, 2.0, true),
                        new GroceryItem("Chocolate", Category.BAKERY, 1.5, false)
                ))
        );
       customers.stream()
                .flatMap(l->l.getShoppingList()
                        .stream()
                        .collect(Collectors.groupingBy()))


    }
}