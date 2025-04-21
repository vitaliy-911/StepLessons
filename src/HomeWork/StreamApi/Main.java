package HomeWork.StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<GroceryItem> dishes = Arrays.asList(
                new GroceryItem("Колбаса", Category.MEAT, 16.54, true),
                new GroceryItem("Арбуз", Category.FRUIT, 6.24, true),
                new GroceryItem("Картофель", Category.VEGETABLE, 1.12, false),
                new GroceryItem("Хлеб", Category.BAKERY, 1.05, false)
        );
//        Молочка
//        Используя filter, получите список всех товаров с Category.DAIRY.
        Collection<GroceryItem> groceryItemStream = dishes.stream()
                .filter(d -> d.getCategory() == Category.MEAT)
                .collect(Collectors.toList());

//        С помощью filter и map, получите List<String> имён всех скоропортящихся товаров (isPerishable() == true).

        List<String> list = dishes.stream()
                .filter(d -> d.isPerishable())
                .map(GroceryItem::getName)
                .collect(Collectors.toList());

//        Сортировка по возрастанию цены
//        Отсортируйте поток товаров по цене с помощью
        List<GroceryItem> collect = dishes.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice))
                .collect(Collectors.toList());

//        Топ‑3 самых дорогих
//        Отсортируйте товары по убыванию цены и выберите первые 3 элемента (limit(3)).


    }
}
