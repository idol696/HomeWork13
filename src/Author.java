import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (firstName.isBlank() || lastName.isBlank()) {
            this.authorExcept();
        }
    }

    public Author() {
        this.authorExcept();
    }

    public boolean equals(Author author) {

        int degreeSimilarity = 0;
        if (this.hashCode() == author.hashCode()) {
            System.out.println("hashCode объекта авторов идентичны");
            degreeSimilarity++;
        }
        if (this.firstName.equalsIgnoreCase(author.firstName)) {
            System.out.println("Имена авторов идентичны");
            degreeSimilarity++;
        }
        if (this.lastName.equalsIgnoreCase(author.lastName)) {
            System.out.println("Фамилии авторов идентичны");
            degreeSimilarity++;
        }
        System.out.printf("Степень похожести объектов %s из 3-х%n",degreeSimilarity);
        return degreeSimilarity == 3;
    }

    public int hashCode() {
        return Objects.hashCode(this.firstName + this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    private void authorExcept() {
        throw new IllegalArgumentException("Имя и фамилия автора должны быть указаны");
    }
}


