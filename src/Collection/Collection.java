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
        stringList.add("dima");
        stringList.add("vita");
        boolean isDimaContains=stringList.contains("Dima");
        System.out.println(isDimaContains);

        if (stringList.isEmpty()){//если не пустой сделай
            System.out.println();
        }
        boolean equals=stringList.equals(stringList);
        System.out.println(equals);

        String s=stringList.get(0);
        System.out.println(s);

        int i =stringList.indexOf("Nata");
        System.out.println(i);
        stringList.remove(0);
        System.out.println(stringList);
        stringList.reversed();
        String[]array=stringList.toArray(new String[0]);
        List<String>k=new ArrayList<>(20);//можно задать размер
        stringList.set(0,"kate");






    }
}
