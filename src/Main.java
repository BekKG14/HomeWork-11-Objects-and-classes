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
        System.out.println(myBook.getName());
        System.out.println(new Author("Пушкин", "Александр"));
        Author a1 = new Author("Кинг", "Стивин");
        Author a2 = new Author("Кинг", "Клоун");
        book b1 = new book(a1, 1977, "Shining");
        book b2 = new book(a2, 1932, "Shining");
        System.out.println(a1.equals(a2));
        System.out.println(new book(author, 1939, "Чето там"));
        System.out.println(b1.equals(b2));
    }
}
