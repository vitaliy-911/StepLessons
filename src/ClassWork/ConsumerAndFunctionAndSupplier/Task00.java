package ClassWork.ConsumerAndFunctionAndSupplier;

import ClassWork.Predicates.Apple;
import ClassWork.Predicates.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Task00 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("Юля");
        list.add("Сергей");
        list.add("Петя");

        forEach(list, s -> System.out.println(s));
        forEach(list, s -> list2.add(s + " Олегович "));
        System.out.println(list2);
        list.forEach(s -> list2.add(s + " Олегович "));//тоже самое что медот и появился в 8 джаве
        list.forEach(s -> System.out.println(s));//и это тоже

        List<Integer> maplist = map(list, s -> s.length());
        IntPredicate boolenIntFunction = (int i) -> i % 2 == 0;
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(100, Color.GREEN));
        apples.add(new Apple(150, Color.ORANGE));
        apples.add(new Apple(200, Color.RED));

        List<Color> colors = map(apples, apple -> apple.getColor());
        System.out.println(colors);

        Random r = new Random();
        Supplier<Integer> supplier = () -> r.nextInt(100);
        System.out.println(supplier.get());

        final int a = 10;
        Runnable runnable = () -> System.out.println(a);

        map(apples, Apple::getColor);//ссылка на метод
        map(apples, Apple::getWaight);
        apples.forEach(System.out::println);
        Supplier<Apple> b = Apple::new;
        Apple apple = b.get();

        BiFunction<Integer, Color, Apple> bf = Apple::new;
        bf.apply(110, Color.GREEN);

        apples.sort((a1, a2) -> a1.getWaight().compareTo(a2.getWaight()));
        Comparator<Apple> comparing = Comparator.comparing((Apple a3) -> a3.getWaight());
        apples.sort(comparing);
        apples.sort(Comparator.comparing(Apple::getWaight).reversed().thenComparing(Apple::getColor));//так пишется  сортировка
                                                        //обратная сортировка
                                                                    // и после ее жожно еще сделать сортировку
        Predicate<Apple> predicate = a4 -> a4.getWaight() == 100;
        predicate.and( a5->Color.GREEN.equals(a5.getColor()));


    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

}
