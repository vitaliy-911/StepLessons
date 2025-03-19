package homeWorkCollection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(List.of("David", "Bill", "Katy", "David", "Patric", "Bill"));
        HashSet<String> name1 = new HashSet<>(name);//первый способ
        System.out.println(name1);
        for (int i = 0; i < name.size(); i++) {//ворой способ
            for (int j = i + 1; j < name.size(); j++) {
                if (name.get(i).equals(name.get(j))) {
                    name.remove(j);
                }
            }
        }
        System.out.println(name);

        //📌 3. Проверить, есть ли дубликаты в List
        //Задача: Проверить, есть ли в List повторяющиеся элементы.
        //Ищем уникальные элементы
        List<Integer> numbers = List.of(4, 2, 2, 3, 1, 4, 5);
        HashSet<Integer> num = new HashSet<>(numbers);
        System.out.println(num);

        //Задача: Даны два Set<String>. Нужно найти все общие элементы.
        Set<String> set1 = Set.of("Алексей", "Мария", "Дмитрий");
        Set<String> set2 = Set.of("Мария", "Сергей", "Алексей");
        Set<String> setUnic = new HashSet<>(set1);
        setUnic.retainAll(set2);
        System.out.println(setUnic);

//        📌 5. Найти разницу между двумя Set
//        Задача: Найти уникальные элементы первого множества, которых нет во втором.
        Set<String> set = Set.of("Алексей", "Мария", "Дмитрий");
        Set<String> set4 = Set.of("Мария", "Сергей");
        Set<String> set5 = new HashSet<>(set);
        set5.removeAll(set4);
        System.out.println(set5);

//        📌 6. Найти количество уникальных слов в тексте (List → Set)
//        Задача: У нас есть список слов List<String>. Нужно узнать, сколько уникальных слов в нем встречается.
        List<String> words = new ArrayList<>(List.of("кот", "собака", "кот", "птица", "рыба", "рыба"));
        List<String> word = new ArrayList<>(words);
        Set<String> wordUnicum = new HashSet<>(words);//1способ
        System.out.println(wordUnicum);

        int size = 0;                         //второй способ
        for (int i = 0; i < word.size(); i++) {
            size++;
            for (int j = i + 1; j < word.size(); j++) {
                if (word.get(i).equals(word.get(j))) {
                    word.remove(j);
                }
            }
        }
        System.out.println(size + " (уникальные :" + word + " )");

//        📌 7. Сортировка List по длине строк
//        Задача: Дан List<String>. Нужно отсортировать его по длине строк.
        List<String> wordFruit = new ArrayList<>(List.of("яблоко", "ананас", "киви", "банан"));
        List<String> wordsFruits = new ArrayList<>(wordFruit);
        wordsFruits.sort(Comparator.comparing(String::length));
        System.out.println(wordsFruits);

//        📌 8. Найти первое уникальное слово в List
//        Задача: Найти первое слово, которое встречается только один раз.
        List<String> animal = List.of("кот", "собака", "кот", "птица", "рыба", "рыба");
        Set<String> animalSort = new HashSet<>(animal);
        List<String> animalFirst = new ArrayList<>(animalSort);
        System.out.println(animalFirst.getLast() + " первое слово,встречающаяся первый раз ");


//        📌 9. Разделить List<Integer> на четные и нечетные числа
//        Задача: Дан List<Integer>. Разделить его на два списка – четные и нечетные числа.
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int nu : number) {
            if (nu % 2 == 0) {
                even.add(nu);
            } else {
                odd.add(nu);
            }
        }
        System.out.println(even);
        System.out.println(odd);


    }
}
