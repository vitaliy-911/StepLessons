package myWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);// add добовляет элемент в конец массива
        arr.add(1, 10);//добовляет элемент по индексу
        System.out.println(arr.get(1));//получает элемент по индексу
        System.out.println(arr.size());
         arr.remove(2);//удаление элемента по индексу
        arr.clear();//удаляет все элементы м массиве
        for (Integer el : arr) {
            System.out.println(el);
        }
    }
}
