package HomeWorklibrary;

public class Ebook extends Book {
    private int format;

    public Ebook(String title, Author author, int year, int format) {
        super(title, author, year);
        this.format = format;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getDiskription() {
        return super.getDiskription()+format;
    }
}

