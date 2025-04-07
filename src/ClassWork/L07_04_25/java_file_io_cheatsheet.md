# 📚 Ввод/вывод в файл в Java

## 📖 Чтение из файла

Java предлагает несколько способов чтения данных из текстового файла. Вот основные из них:

### 📊 Сравнение: FileReader vs BufferedReader vs Scanner

| Класс              | Что делает                                | Когда использовать                              | Пример чтения        | Преимущества                         | Недостатки                          |
|--------------------|--------------------------------------------|--------------------------------------------------|-----------------------|---------------------------------------|--------------------------------------|
| **FileReader**     | Читает **символы** из файла                  | Если нужно по символам (редко)                   | `reader.read()`       | Простой, лёгкий                       | Неудобно читать строки               |
| **BufferedReader** | Читает **строки** (с буфером)                | Лучше всего для **построчного** чтения текста    | `reader.readLine()`   | Быстро, эффективно, удобно            | Нужно оборачивать `FileReader`      |
| **Scanner**        | Читает **токены** (слова, числа, строки)     | Если нужно разбирать текст на части              | `scanner.nextLine()` | Очень гибкий: можно считывать числа   | Медленнее, чем `BufferedReader`     |

---

### 🧪 Примеры чтения

#### ✅ FileReader

```java
FileReader reader = new FileReader("files/file.txt");
int ch;
while((ch =reader.

read())!=-1){
        System.out.

print((char) ch);
        }
```

#### ✅ BufferedReader

```java
BufferedReader reader = new BufferedReader(new FileReader("files/file.txt"));
String line;
while((line =reader.

readLine())!=null){
        System.out.

println(line);
}
```

#### ✅ Scanner

```java
Scanner scanner = new Scanner(new File("files/file.txt"));
while(scanner.

hasNextLine()){
        System.out.

println(scanner.nextLine());
        }
```

---

## ✍️ Запись в файл

Вот основные классы для записи данных:

### 📊 Сравнение: FileWriter vs BufferedWriter vs PrintWriter vs FileOutputStream

| Класс               | Что делает                                | Когда использовать                             | Пример записи         | Преимущества                         | Недостатки                           |
|---------------------|--------------------------------------------|-------------------------------------------------|------------------------|---------------------------------------|----------------------------------------|
| **FileWriter**      | Пишет **символы** (текст) в файл          | Простая текстовая запись                        | `writer.write(...)`    | Быстро, просто                       | Неэффективен при множественной записи |
| **BufferedWriter**  | Пишет **символы** с буфером               | Большой объём текста, много строк               | `writer.write(...)`    | Быстрее, чем `FileWriter`            | Нужно вызывать `flush()` или `close()` |
| **PrintWriter**     | Удобная запись строк, чисел и форматирование | Когда нужно `println()` или `printf()`          | `writer.println(...)`  | Пишет как в консоль, удобно          | Нет автоматического буфера            |
| **FileOutputStream**| Записывает **байты** (не текст!) в файл   | Для изображений, PDF, сериализованных объектов | `out.write(byte[])`    | Универсален (для бинарных данных)    | Неудобен для текста                   |

---

### 🧪 Примеры записи

#### ✅ FileWriter

```java
try (FileWriter writer = new FileWriter("output.txt")) {
    writer.write("Привет, мир!");
}
```

#### ✅ BufferedWriter

```java
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("Первая строка");
    writer.newLine();
    writer.write("Вторая строка");
}
```

#### ✅ PrintWriter

```java
try (PrintWriter writer = new PrintWriter("output.txt")) {
    writer.println("Имя: Анна");
    writer.println("Возраст: 22");
    writer.printf("Средний балл: %.2f%n", 4.67);
}
```

#### ✅ FileOutputStream

```java
try (FileOutputStream fos = new FileOutputStream("output.bin")) {
    byte[] data = "Привет в байтах!".getBytes();
    fos.write(data);
}
```

---

## 💡 Что выбрать?

| Задача                                     | Что лучше использовать       |
|--------------------------------------------|------------------------------|
| Простая запись текста                      | `FileWriter`                 |
| Многострочная/массовая запись              | `BufferedWriter`             |
| Удобная форматированная запись, как в консоли | `PrintWriter`              |
| Запись байтов (изображений, pdf и т.п.)    | `FileOutputStream`           |
| Простое построчное чтение текста           | `BufferedReader`             |
| Гибкий анализ строк, чисел, слов           | `Scanner`                    |

---