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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return  Objects.equals(this.firstName, author.firstName) &&
                Objects.equals(this.lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
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


