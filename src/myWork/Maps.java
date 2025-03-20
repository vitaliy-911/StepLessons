package myWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> apper = new HashMap<>();
        apper.put("cat", "11");
        apper.put("caty", "12");//добавляет
        apper.put("catys", "13");

        System.out.println(apper);
        String name = apper.get("cat");//отдает
        System.out.println(name);

        boolean by = apper.containsKey("caty");//проверяет наличие  ключа
        boolean caty = apper.containsValue("11");//проверяет наличие значение
        System.out.println(caty);
        System.out.println(by);

        Set<String> keySet = apper.keySet();//получаем все ключи и убераем спомощье Set повторения
        Collection<String> values = apper.values();//получаем все значения
        System.out.println(keySet);
        System.out.println(values);

        int size = apper.size();//возвращает число элементов
       // apper.clear(); удаляет все элементы
        System.out.println(size);

        boolean empty = apper.isEmpty();//проверяет на наличие хотя бы одного элемента
        System.out.println(apper);


    }
}
