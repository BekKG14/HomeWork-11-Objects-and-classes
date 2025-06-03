import javax.xml.namespace.QName;
public class book {
    private Author author;
    private int year;
    private String name;
    public book(Author author, int year, String name){
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
        if (this.getClass() != other.getClass()) {
            return false;
        }
        book myBook  = (book) other;
        return name.equals(myBook.name);}
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
