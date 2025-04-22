package ClassWork.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Dish> dishes = Arrays.asList(

                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", false, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );
//        List<String> list = lowCalories(dishes);
//        System.out.println(list);
        List<String> collect = dishes.stream()
                .filter(dish -> dish.getCallories() > 300)
                .sorted(Comparator.comparing(Dish::getCallories))
                .map(Dish::getName)
//                .limit(3)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        dishes.stream()
                .filter(dish -> dish.getCallories() > 300)
                .sorted(Comparator.comparing(Dish::getCallories))
                .map(Dish::getName)
                .distinct()
                .forEach(System.out::println);

        dishes.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        boolean vegan = dishes.stream()
                .anyMatch(Dish::isVegan);
        System.out.println(vegan);
        boolean allMatch = dishes.stream()
                .allMatch(dish -> dish.getCallories() < 1000);
        boolean noneMatch = dishes.stream()
                .noneMatch(dish -> dish.getCallories() >= 1000);
        Optional<Dish> any = dishes.stream()
                .filter(Dish::isVegan)
                .findAny();
        if (any.isPresent()) {//проверка на null
            Dish dish = any.get();
        }
        dishes.stream()
                .filter(Dish::isVegan)
                .findAny()
                .ifPresent(dish -> System.out.println(dish.getName()));

        Optional<Dish> first = dishes.stream()
                .filter(Dish::isVegan)
                .findFirst();
        int sum = dishes.stream().mapToInt(Dish::getCallories).sum();
        int i = dishes.stream().mapToInt(Dish::getCallories).max().orElse(1);
        Map<Type, List<Dish>> collect1 = dishes.stream().collect(Collectors.groupingBy(Dish::getTipe));


    }


    public static List<String> lowCalories(List<Dish> dishes) {
        List<Dish> list = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getCallories() < 400) {
                list.add(dish);
            }
        }
        list.sort(Comparator.comparing(Dish::getCallories));
        List<String> names = new ArrayList<>();
        for (Dish dish : list) {
            names.add(dish.getName());
        }
        return names;

    }
}
