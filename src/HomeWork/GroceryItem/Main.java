package HomeWork.GroceryItem;

import HomeWork.StreamApi.Category;

import java.util.*;
import java.util.stream.Collectors;

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
                        new GroceryItem("Cheese", Category.DAIRY, 3.0, true)
                )),
                new Customer("Сергей", List.of(
                        new GroceryItem("Eggs", Category.DAIRY, 2.0, true),
                        new GroceryItem("Chocolate", Category.BAKERY, 1.5, false)
                ))
        );
        List<GroceryItem> collect = customers.stream()
                .flatMap(l -> l.getShoppingList()
                        .stream())
                .collect(Collectors.toList());
        System.out.println(collect);

        long count = customers.stream()
                .map(Customer::getName)
                .count();
        System.out.println(count);

        Optional<Customer> max = customers.stream()
                .max(Comparator.comparingDouble(cus -> cus.getShoppingList()
                        .stream()
                        .mapToDouble(GroceryItem::getPrice)
                        .sum()));

        max.ifPresent(customer -> System.out.println(customer));

        Set<String> set = customers.stream()
                .flatMap(customer -> customer.getShoppingList().stream())
                .map(GroceryItem::getName)
                .collect(Collectors.toSet());
        System.out.println(set);

        Map<Category, Set<String>> categorySetMap = customers.stream()
                .flatMap(customer -> customer.getShoppingList()
                        .stream()
                        .map(item -> Map.entry(item.getCategory(), customer.getName())))
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue
                        , Collectors.toSet())));
        System.out.println(categorySetMap);

        Optional<Customer> first = customers.stream()
                .filter(customer -> customer.getShoppingList().isEmpty())
                .findFirst();
        System.out.println(first);

        Map<String, DoubleSummaryStatistics> doubleSummaryStatisticsMap = customers.stream()
                .collect(Collectors.toMap(Customer::getName, customer -> customer.getShoppingList()
                        .stream().collect(Collectors.summarizingDouble(GroceryItem::getPrice))));
        System.out.println(doubleSummaryStatisticsMap);

        customers.stream()
                .peek(customer -> System.out.println("обрабатываем " + customer.getName()))
                .collect(Collectors.toList());

        List<String> list = customers.stream()
                .map(customer -> customer.getName())
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}