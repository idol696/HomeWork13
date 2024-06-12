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
        return this.hashCode() == author.hashCode();
    }

    public int hashCode() {
        return Objects.hashCode(this.toString().toUpperCase());
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


