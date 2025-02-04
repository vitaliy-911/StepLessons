package HomeWorklibrary;

public class RunLibrary {
    public static void main(String[] args) {
        Library library = new Library(6);//вот это не понятно
        Author tolkien = new Author("Джон", "Толкен", 1972);
        Author roulen = new Author("Джоан", "Роулен", 1986);
        Author sherba = new Author("Наталья", "Щерба", 1985);

        Book fantasticBeasts = new Book("Фантастические твари", roulen, 1768);
        Book lordOfTheRings = new Book("Властелин колец", tolkien, 1955);
        Book harryPotter = new Book("Гарри Поттер", roulen, 1995);
        Book hobbitbackAndForth = new Book("Хоббит туда и обратно", tolkien, 2015);
        Book chasodei = new Book("Часодеи", sherba, 2009);
        Book clockTower = new Book("Часовая башня", sherba, 2010);

        library.add(fantasticBeasts);
        library.add(lordOfTheRings);
        library.add(harryPotter);
        library.add(hobbitbackAndForth);
        library.add(chasodei);
        library.add(clockTower);

        System.out.println("Все книги :");
        library.printBooks();

        System.out.println("Поиск книги по названию : ");
        System.out.println(library.LibraryFindBook("Часоде"));

        System.out.println("Книги после сортировки по году издания :");
        library.sortByYearBook();
        library.printBooks();

        System.out.println("Книги после сортировки по году рождения автора :");
        library.sortByYearAutor();
        library.printBooks();
    }
}
