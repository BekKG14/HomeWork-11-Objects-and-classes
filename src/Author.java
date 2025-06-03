public class Author {
    private String surname;
    private String name;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String toString(){
        return "Фамилия: " + surname + " Имя: " + name;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return surname.equals(author.surname);
    }
    public int hashCode() {
        return java.util.Objects.hash(surname);
    }
}

