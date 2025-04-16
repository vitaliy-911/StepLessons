package ClassWork.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task00 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("ClassWork/Exception/Task00.java:9");
            int i = Integer.parseInt("7");
            System.out.println("файл найден");
        } catch (FileNotFoundException | NumberFormatException e) {
            System.out.println("Файл не найден по такому-то пути или не число");
        } catch (IOException e) {
            System.out.println("");
        } catch (Exception e) {
            System.out.println("общая ошибка");
        }finally {
            System.out.println("выполняем в любом случае");
        }
        System.out.println("После try/catch");

//        System.out.println("после не обработанного исключения");
        try {
            test2(38);
        }catch (AgeException e){
            System.out.println();
        }

        try {
            test3(17);
        }catch (AgeException e){

        }
    }


    private static void test() throws FileNotFoundException {
        FileReader fileReader = new FileReader("one.txt");
    }

    private static  void test2(int age){
        if (age<18){
            throw new RuntimeException("возраст меньше 18");
        }
    }
    private static  void test3(int age)throws FileNotFoundException{
        if (age<18){
            throw new RuntimeException("возраст меньше 18");
        }
    }
}
