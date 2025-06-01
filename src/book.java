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
}
