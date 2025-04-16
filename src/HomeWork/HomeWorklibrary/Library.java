package HomeWork.HomeWorklibrary;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public void add(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;

        } else {
            Book[] books1 = new Book[books.length * 2];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[size] = book;
            books = books1;
            size++;
        }
    }

    public void printBooks() {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            System.out.println(book.getDiskription());
        }
    }

    public void sortByYearBook() {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {

                if (books[i] == null) {
                    return;
                }

                if (books[j + 1] != null && books[j].getYear() < (books[j + 1].getYear())) {
                    Book book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }

            }
        }
    }

    public void sortByYearAutor() {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {

                if (books[i] == null) {
                    return;
                }

                if (books[j + 1] != null && books[j].getAuthor().getBirthYear() < books[j + 1].getAuthor().getBirthYear()) {
                    Book book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }
            }
        }
    }

    public String libraryFindBook(String name) {
        for (Book book : books) {

            if (book == null) {
                return "no book";
            }

            if (name.equals(book.getTitle())) {
                return name;
            }
        }
        return "no book";
    }
}
