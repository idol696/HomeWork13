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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return this.year == book.year &&
        Objects.equals(author, book.author) &&
        Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, year);
    }

    private void bookExcept() {
        throw new IllegalArgumentException("Название и год должны быть заполнены корректно!");
    }
}

