public class Main {
    public static void main(String[] args) {
        Author author = new Author("Бредбери", "Рей");
        Author the2Author = new Author("Толстой", "Лев");

        Book myBook = new Book(author,1953, "'451 градус по фаренгейту'");
        Book yourBook = new Book(the2Author, 1869, "'Война и мир'");

        System.out.println(myBook.getYear() + " " + myBook.getAuthor().getSurname()+ " "+ myBook.getAuthor().getName() + " "+ myBook.getName());
        System.out.println(yourBook.getYear() + " " + yourBook.getAuthor().getSurname() +" " + yourBook.getAuthor().getName() + " " + yourBook.getName());

        myBook.setYear(1954);

        System.out.println("451 градус по Фаренгейту выпушен " + myBook.getYear());
        System.out.println(myBook.getName());
        System.out.println(new Author("Пушкин", "Александр"));

        Author a1 = new Author("Кинг", "Стивин");
        Author a2 = new Author("Кинг", "Клоун");
        Author a3 = new Author("Кинг", "Стивин");


        Book b1 = new Book(a1, 1977, "Shining");
        Book b2 = new Book(a2, 1932, "Shining");

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        System.out.println(new Book(author, 1939, "Чето там"));
        System.out.println(b1.equals(b2));
    }
}
