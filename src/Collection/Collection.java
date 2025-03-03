package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();

        // String[]strings=new String[0]; одно и тоже

        stringList.add("Dima");
        stringList.add("Dima");

        stringList.add("Dima1");
        stringList.add("Dima2");

        System.out.println("размер stringList " + stringList.size());
        stringList.addAll(stringList2);
        System.out.println("размер stringList " + stringList.size());
        System.out.println(stringList);

        stringList.clear();

        System.out.println(stringList);
        System.out.println(stringList.size());


    }
}
