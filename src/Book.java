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
        int degreeSimilarity = 0;
        if (this.hashCode() == book.hashCode()) {
            System.out.println("Книги равны по hashCode свойств объекта");
            degreeSimilarity++;
        }
        if (this.author.toString().equalsIgnoreCase(book.author.toString())) {
            System.out.println("Книги равны по автору");
            degreeSimilarity++;
        }
        if (this.name.equalsIgnoreCase(book.name)) {
            System.out.println("Книги равны по названию");
            degreeSimilarity++;
        }
        if (this.year == book.year) {
            System.out.println("Книги равны по году");
            degreeSimilarity++;
        }
        System.out.printf("Уровени идентичности объекта: %s из 4-х%n",degreeSimilarity);
        return degreeSimilarity == 4; // четверочка - это идентичные объекты
    }

    public int hashCode() {
        return Objects.hashCode(this.name + this.year + this.author.toString());
    }

    private void bookExcept() {
        throw new IllegalArgumentException("Название и год должны быть заполнены корректно!");
    }
}

