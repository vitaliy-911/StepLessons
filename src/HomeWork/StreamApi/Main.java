package HomeWork.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<GroceryItem> dishes = Arrays.asList(
                new GroceryItem("Колбаса", Category.MEAT, 16.54, true),
                new GroceryItem("Арбуз", Category.FRUIT, 6.24, true),
                new GroceryItem("Картофель", Category.VEGETABLE, 1.12, false),
                new GroceryItem("Хлеб", Category.BAKERY, 1.05, false),
                new GroceryItem("Свекла", Category.VEGETABLE, 1.15, false)
        );

//        Используя filter, получите список всех товаров с Category.DAIRY.
        Collection<GroceryItem> groceryItemStream = dishes.stream()
                .filter(d -> d.getCategory() == Category.MEAT)
                .collect(Collectors.toList());
        System.out.println(groceryItemStream);

//        С помощью filter и map, получите List<String> имён всех скоропортящихся товаров (isPerishable() == true).

        List<String> list = dishes.stream()
                .filter(d -> d.isPerishable())
                .map(GroceryItem::getName)
                .collect(Collectors.toList());
        System.out.println(list);

//        Сортировка по возрастанию цены
//        Отсортируйте поток товаров по цене с помощью
        List<GroceryItem> collect = dishes.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice))
                .collect(Collectors.toList());
        System.out.println(collect);

//        Топ‑3 самых дорогих
//        Отсортируйте товары по убыванию цены и выберите первые 3 элемента (limit(3)).
        List<String> name = dishes.stream()
                .sorted(Comparator.comparing(GroceryItem::getPrice).reversed())
                .map(GroceryItem::getName)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(name);

//        Есть ли товар дешевле 1Br?
//        С помощью anyMatch проверьте, существует ли дешевый товар.
        boolean anyMatch = dishes.stream()
                .anyMatch(d -> d.getPrice() < 1);
        System.out.println(anyMatch);

//        Все ли товары дороже 0?
//        Проверьте через allMatch, что цена каждого товара положительна.
        boolean allMatch = dishes.stream()
                .allMatch(dish -> dish.getPrice() > 0);
        System.out.println(allMatch);

//        Первая овощная позиция
//        Найдите первый товар категории VEGETABLE через
//        findFirst()
        Optional<GroceryItem> first = dishes.stream()
                .filter(d -> d.getCategory().equals(Category.VEGETABLE))
                .findFirst();
        first.ifPresent(System.out::println);
        System.out.println(first);

//        Уникальные категории
//        Получите List<Category> всех уникальных категорий товаров.
        List<Category> categories = dishes.stream()
                .map(GroceryItem::getCategory)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(categories);

//        Печать со скидкой
//        Используйте forEach, чтобы вывести строку
//        <name>: <price * 0.9> Br
        dishes.stream()
                .forEach(d -> System.out.println(d.getName() + ":<" + d.getPrice() * 0.9 + "> Br"));




    }
}
