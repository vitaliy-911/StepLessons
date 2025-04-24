package ClassWork.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


        List<Dish> dishes2 = Arrays.asList(

                new Dish("pork", false, 100, Type.MEAT),
                new Dish("beef", false, 300, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", false, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );


        List<List<Dish>> listList = List.of(dishes, dishes2);
        List<Dish> groceryItemList = listList.stream()
                .map(Collection::stream)
                .flatMap(Stream::distinct)
                .collect(Collectors.toList());
        System.out.println(groceryItemList);

        List<Dish> collect3 = listList.stream()
                .flatMap(j -> j.stream())
                .collect(Collectors.toList());//так возвращаяется изменяемая коллекция
        //.to list вернется не изменяемая коллекция

        int[] nums = {1, 2, 3, 4, 5};
        int sum2 = Arrays.stream(nums).sum();
        System.out.println(sum2);

        Stream.of("home", "java", "dish", "javascript")
                .map(String::toUpperCase)
                .forEach(System.out::println);


        Dish nulldish = null;
        Stream.ofNullable(nulldish)           //проверка на null
                .map(Dish::getCallories)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

//        Stream.iterate(0, t -> t < 100, t + 4)
//                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        String s = dishes.stream()
                .map(Dish::getName)
                .collect(Collectors.joining(", "));
        System.out.println(s);

        Long l = dishes.stream()
                .map(Dish::getName)
                .collect(Collectors.counting());
        System.out.println(l);

        Optional<Dish> collect2 = dishes.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCallories)));
        System.out.println(collect2);

        Double collected = dishes.stream()
                .collect(Collectors.averagingInt(Dish::getCallories));
        System.out.println(collected);

        Map<String, List<Dish>> map = dishes.stream()
                .collect(Collectors.groupingBy(dish -> {
                    if (dish.getCallories() <= 400) {
                        return "диета";
                    } else if (dish.getCallories() <= 700) {
                        return "Норм";
                    } else {
                        return "Жир";
                    }
                }));
        System.out.println(map);

        Map<Type, Long> typeLongMap = dishes.stream()
                .collect(Collectors.groupingBy(Dish::getTipe,
                        Collectors.counting()));
        System.out.println(typeLongMap);

        Map<Type, Dish> dishMap = dishes.stream()
                .collect(Collectors.groupingBy(Dish::getTipe, Collectors.collectingAndThen
                        (Collectors.maxBy(Comparator.comparingInt(Dish::getCallories)), Optional::get)));
        System.out.println(dishMap);
        List<Dish> dishList = List.of(new Dish("pork", false, 100, Type.MEAT));


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

