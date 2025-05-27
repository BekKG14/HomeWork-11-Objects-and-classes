public class book {
    private String Author;
    private int year;
    private String name;
    public book(String Author, int year, String name){
        this.Author = Author ;
        this.year = year;
        this.name = name;
    }
    public void publishedYear(){
        this.year = year;
    }
    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }
}
