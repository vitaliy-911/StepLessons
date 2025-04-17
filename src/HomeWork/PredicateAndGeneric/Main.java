package HomeWork.PredicateAndGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> strings = List.of("an", "dav", "and");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, -3);
        List<String> java = List.of("home", "java", "world", "java");
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<String> stringList = new ArrayList<>();
        stringList.add("Коля");
        stringList.add("Аня");
        stringList.add("Серафим");

        //ищем слова начинающие на букву
        boolean match = anyMatch(strings, s -> s.startsWith("a"));
        System.out.println(match);
        //все числа больше 0? Все люди старше 18?
        boolean match1 = allMatch(numbers, n -> n > 0);
        System.out.println(match1);
        //Поиск элемента по предикату
        List<String> java1 = listFindFirstMatch(java, s -> s.contains("java"));
        System.out.println(java1);
        //Фильтрация строк по длине
        List<String> filter = filterByLength(stringList, s -> s.length() > 5);
        System.out.println(filter);
        System.out.println("_____________________________");

        //Generic
        //Вернуть первый элемент
        String first = getFirst(java);
        System.out.println(first);
        //Поиск минимального из двух элементов
        int min = min(10, 40);
        System.out.println(min);
        //Вывод элементов массива любого типа
        printArray(array);
        // Подсчёт количества вхождений элемента
        int java2 = count(java, "java");
        System.out.println(java2);
        // Проверка наличия элемента в массиве
        boolean ofElement = presenceOfElement(array, "world");
        System.out.println(ofElement);
        // Создание списка из массива
        List<Integer> transformation = transformation(array);
        System.out.println(transformation);
        //Копирование содержимого одного списка в другой
        copyList(strings, stringList);
        System.out.println(stringList);
        //Нахождение индекса элемента
        int indexElement = getIndexElement(array, "world");
        System.out.println(indexElement);
        // Объединение двух списков
        compereList(stringList, java);
        System.out.println(stringList);

    }

    public static <T> List<T> transformation(T[] array) {
        return new ArrayList<>(List.of(array));

    }

    public static <T> boolean presenceOfElement(T[] array, T element) {
        for (T el : array) {
            if (Objects.equals(el, element)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> T min(T el1, T el2) {
        int i = el1.compareTo(el2);
        if (i <= 0) {
            return el1;
        }
        return el2;
    }

    public static <T> int getIndexElement(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int count(List<T> list, T element) {
        int count = 0;
        for (T el : list) {
            if (Objects.equals(el, element)) {
                count++;
            }
        }
        return count;
    }

    public static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (predicate.test(element)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (!predicate.test(element)) {
                return false;
            }
        }
        return true;
    }

    public static <T> List<T> listFindFirstMatch(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> List<T> filterByLength(List<T> list, Predicate<T> predicate) {
        list.removeIf(predicate);
        return list;
    }

    public static <T> T getFirst(List<T> list) {
        return list.getFirst();
    }

    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static <T> List<T> copyList(List<T> one, List<T> two) {
        List<T> result = new ArrayList<>(one);
        result.add((T) one);
        return result;
    }

    public static <T> void compereList(List<T> one, List<T> two) {
        one.addAll(two);
    }

}
