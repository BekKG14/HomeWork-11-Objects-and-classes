public class Main {
    public static void main(String[] args) {
        Author author = new Author("Бредбери", "Рей");
        book myBook = new book(author,1953, "'451 градус по фаренгейту'");
        Author the2Author = new Author("Толстой", "Лев");
        book yourBook = new book(the2Author, 1869, "'Война и мир'");
        System.out.println(myBook.getYear() + " " + myBook.getAuthor().getSurname()+ " "+ myBook.getAuthor().getName() + " "+ myBook.getName());
        System.out.println(yourBook.getYear() + " " + yourBook.getAuthor().getSurname() +" " + yourBook.getAuthor().getName() + " " + yourBook.getName());
        myBook.setYear(1954);
        System.out.println("451 градус по Фаренгейту выпушен " + myBook.getYear());
    }
}
