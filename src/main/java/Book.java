public class Book {
    public String nameBook;
    public Author nameAuthor;
    public int creationYear;
    public int rating;
    public String textBook;
    public String moreText;

    // создаем метод повышения рейтинг
    public int up() {
        if (rating < 5) {
            rating++;
        }
        return rating;
    }

    // создаем метод понижения рейтинга
    public int down() {
        if (rating > 0) {
            rating--;
        }
        return rating;
    }

    // создаем метод изменения текста
    public String append(String moreText) {

        textBook += moreText;
        return textBook;
    }

    public Book(String nameBook, Author nameAuthor, int creationYear) {//String textBook
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.creationYear = creationYear;
        rating = 3;
        textBook = "";
    }

    public String toString() {// метод вывода на экран
        return nameBook + " " + nameAuthor.firstName + " " + nameAuthor.lastName;
    }
}
