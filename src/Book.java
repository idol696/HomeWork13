import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private Author author;


    public Book(String name, int year, Author author) {
        if (!name.isBlank() && year > 0) {
            this.name = name;
            this.year = year;
            this.author = author;
        } else {
            this.bookExcept();
        }
    }

    public Book() {
        bookExcept();
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return name + "," + year + "," + author.toString();
    }

    public boolean equals(Book book) {
        return this.hashCode() == book.hashCode();
    }

    public int hashCode() {
        return Objects.hashCode((name + year + author.toString()).toUpperCase());
    }

    private void bookExcept() {
        throw new IllegalArgumentException("Название и год должны быть заполнены корректно!");
    }
}

