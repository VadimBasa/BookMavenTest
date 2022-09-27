import java.time.LocalDate;


public class Author {
    public String firstName;
    public String lastName;
    public int counter;

    public Author(String firstName, String lastName) {//������ �����������
        this.firstName = firstName;
        this.lastName = lastName;
        counter = 0;
    }

    public Book newBook(String title) {// ������ ����� ��� �������� ����� �����
        Book book = new Book(title, this, LocalDate.now().getYear());
        counter++;
        return book;
    }

    public String toString() {// ����� ������ �� �����
        return firstName + " " + lastName + " " + counter;
    }
}

