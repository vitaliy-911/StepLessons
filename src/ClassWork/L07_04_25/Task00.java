package ClassWork.L07_04_25;

import java.io.*;
import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("files/file.txt");) {
            //читает симолы
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("files/file.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("файл не найден или поврежден file.txt");
        }
        //читает целые строки (из буффера)

        File file = new File("files/file2.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            //читает все
        } catch (IOException e) {
            System.out.println("файл не найден или поврежден file2.txt");
        }

        try (FileWriter fileWriter = new FileWriter("files/file2.txt", true)) {
            fileWriter.write("Привет я новая строка 2 \n");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("files/file.txt"))) {
            writer.write("Строка");
            writer.newLine();
            writer.write("Строка");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }

        try (PrintWriter writer = new PrintWriter("files/file.txt")) {
            writer.println("С новой строки");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }

    }
}
