public class Main {
    public static void main(String[] args) {
        Author theAuthor = new Author("Бредбери", "Рей");
        book myBook = new book(theAuthor.getName() +" "+ theAuthor.getSurname(),1953, "'451 градус по фаренгейту'");
        Author the2Author = new Author("Толстой", "Лев");
        book yourBook = new book(the2Author.getName()+ " " + the2Author.getSurname(), 1920, "'Война и мир'");
        System.out.println(myBook.getYear()+ " " + myBook.getAuthor() + " "+ myBook.getName());
        System.out.println(yourBook.getYear() + " " + yourBook.getAuthor() + " " + yourBook.getName());
        }
    }
}