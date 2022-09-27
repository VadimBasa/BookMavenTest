import java.time.LocalDate;


public class Author {
    public String firstName;
    public String lastName;
    public int counter;

    public Author(String firstName, String lastName) {//создаю конструктор
        this.firstName = firstName;
        this.lastName = lastName;
        counter = 0;
    }

    public Book newBook(String title) {// создаю метод для создания новой книги
        Book book = new Book(title, this, LocalDate.now().getYear());
        counter++;
        return book;
    }

    public String toString() {// метод вывода на экран
        return firstName + " " + lastName + " " + counter;
    }
}

