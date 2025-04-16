package HomeWork.PredicateAndGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //ищем слова начинающие на букву
        List<String> strings = List.of("an", "dav");
        List<Integer> numbers = List.of(0, 2, 3, 4, 5, 6);
        List<String> java = List.of("home", "world", "java");
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<String>stringList=new ArrayList<>();

        boolean match = anyMatch(strings, (s -> s.startsWith("a")));
        System.out.println(match);
        //все числа больше 0? Все люди старше 18?
        boolean match1 = allMatch(numbers, (n -> n > 0));
        System.out.println(match1);
        //Поиск элемента по предикату
        String java1 = listFindFirstMatch(java, (s -> s.contains("java")));
        System.out.println(java1);
        //Фильтрация строк по длине
        List<String> filter = filterByLength(java, (s -> s.length() >= 5));
        System.out.println(filter);
        //Generic
        //Вернуть первый элемент
        String first = getFirst(java);
        System.out.println(first);
        //Поиск минимального из двух элементов


        //Вывод элементов массива любого типа
        printArray(array);
        // Подсчёт количества вхождений элемента


        // Проверка наличия элемента в массиве


        // Создание списка из массива


        //Копирование содержимого одного списка в другой
//        copyList(strings,stringList);

        //Нахождение индекса элемента


       // Объединение двух списков
//        compereList(strings,java);



    }

    public static <T> boolean anyMatch(List<T> lines, Predicate<T> predicate) {
        for (T element : lines) {
            if (predicate.test(element)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (predicate.test(element)) {
                return true;
            }
        }
        return false;
    }

    public static <T> T listFindFirstMatch(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (predicate.test(element)) {
                return element;
            }
        }
        return null;
    }

    public static List<String> filterByLength(List<String> word, Predicate<String> predicate) {
        List<String> words = new ArrayList<>();
        for (String element : word) {
            if (predicate.test(element)) {
                words.add(element);
            }
        }
        return words;
    }

    public static <T> T getFirst(List<T> element) {
        return element.getFirst();
    }

    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

//    public static <T> List<T> listByArray(T[] array) {
//        List<T> listArray = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//
//            listArray.add(e);
//        }
//        return listArray;
//    }

    public static <T> void copyList(List<T> one, List<T> two) {
        copyList(one, two);
    }

    public static <T> void compereList(List<T> one, List<T> two) {
        one.addAll(two);
    }

}
