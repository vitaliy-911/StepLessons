package ClassWork.Predicates;

import ClassWork.Predicates.impl.AppleColorGreenPredicate;
import ClassWork.Predicates.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class Task00 {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(100, Color.GREEN));
        apples.add(new Apple(150, Color.ORANGE));
        apples.add(new Apple(200, Color.RED));

        List<Apple> apples1 = filterByColorApples(apples, Color.ORANGE);
        List<Apple> apples2 = filterWeightApples(apples, 200);
        List<Apple> apples3 = filterByPredicate(apples, new AppleColorGreenPredicate());
        System.out.println(apples1);
        System.out.println(apples2);
        System.out.println(apples3);

//        //анонимный класс
//        filterByPredicate(apples, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return Color.RED.equals(apple.getColor());
//            }
//        });

        //Лямда, параметры........тело
        filterByPredicate(apples, (Apple a) -> Color.RED.equals(a.getColor()));
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        filterByPredicate(numbers, (Integer i) -> i % 2==0);

    }

    private static List<Apple> filterByColorApples(List<Apple> apples, Color color) {
        List<Apple> appleGreen = new ArrayList<>();
        for (Apple apple : apples) {
            if (Color.ORANGE.equals(apple.getColor())) {
                appleGreen.add(apple);
            }
        }
        return appleGreen;
    }

    private static List<Apple> filterWeightApples(List<Apple> apples, int weight) {
        List<Apple> filterHeavyApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWaight() >= 150) {
                filterHeavyApples.add(apple);
            }
        }
        return filterHeavyApples;
    }

    private static List<Apple> filterApples(List<Apple> apples, boolean flag, Color color, int weight) {
        List<Apple> filterApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (flag && color.equals(apple) || (!flag && apple.getWaight() > weight)) {
                filterApples.add(apple);
            }
        }
        return filterApples;
    }

    private static <T> List<T> filterByPredicate(List<T> apples, ApplePredicate<T> predicate) {
        List<T> filterByPredicate = new ArrayList<>();
        for (T t : apples) {
            if (predicate.test(t)) {
                filterByPredicate.add(t);
            }
        }
        return filterByPredicate;
    }


}
