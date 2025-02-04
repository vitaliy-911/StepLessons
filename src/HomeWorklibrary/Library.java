package HomeWorklibrary;

public class Library {
    Book[] books;
    int size;

    public void add(Book book) {
        if (size < books.length) {
            books[size++] = book;

        } else {//эта часть не понятна /зачем она если size не увеличивается
            Book[] books1 = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[size++] = book;
            books = books1;
        }
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            System.out.println(books[i]);
        }
    }

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public void sortByYearBook() {//
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++)
                if (books[j].getYear() < (books[j + 1].getYear())) {
                    Book book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }
        }
    }

    public void sortByYearAutor() {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].getAuthor().getBirthYear() < books[j + 1].getAuthor().getBirthYear()) {
                    Book book = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = book;
                }
            }
        }
    }

    public String LibraryFindBook(String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(name)) {
                return name;
            }
        }
        return null;
    }
}
