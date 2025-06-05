import javax.xml.namespace.QName;
public class Book {
    private Author author;
    private int year;
    private String name;
    public Book(Author author, int year, String name){
        this.author = author ;
        this.year = year;
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public  int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Название: " + name + " , автор: " + author + ", год публикации " + year;
    }
    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book myBook  = (Book) other;
        return name.equals(myBook.name) && year == (myBook.year) && author.equals(myBook.author);
    }
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
