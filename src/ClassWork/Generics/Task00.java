package ClassWork.Generics;

import java.util.List;

public class Task00 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Привет");
        String item = stringBox.getItem();
        System.out.println(item);

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(12);
        Integer item1 = integerBox.getItem();
        System.out.println(item1);
        printTwice("Hello");
        printTwice(18);
        printTwice(integerBox);

        Pair<String, Integer> student = new Pair<>("Дима", 18);
        System.out.println(student.getKey());
        System.out.println(student.getValue());

        List<Integer> list = List.of(1, 2, 3);
        printList(list);
//        List<String>list1=List.of("1","2","3");
//        printList(list1);
//так не получится потому что метод ждет только цифры

    }

    public static <T> T printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
        return value;
    }

    public static void printList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);

        }
    }


}

