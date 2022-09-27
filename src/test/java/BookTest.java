import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("тестирование задачи Book")

public class BookTest {
    @Test
    @DisplayName("проверка метода повышения рейтинга")
    void up(){
        Book book = new Book("Война и Мир",new Author("Лев", "Толстой"),1873);
        book.rating = 1;
        Assertions.assertEquals(2,book.up());
    }
    @Test
    @DisplayName("проверка метода понижения рейтинга")
    void down(){
        Book book = new Book("Война и Мир",new Author("Лев", "Толстой"),1873);
        book.rating = 2;
        Assertions.assertEquals(1,book.down());
    }
    @ParameterizedTest
    @ValueSource (strings = {"Краткое описание: "})
    @DisplayName("проверка метода добавления текста")
    void append(String moreText){
        Book book = new Book("Война и Мир",new Author("Лев", "Толстой"),1873);
        book.textBook = "Краткое описание: ";
        System.out.println(moreText);
        moreText = "книга описывает события 1812 года";
        final String except = "Краткое описание: книга описывает события 1812 года";
        final String result = book.append(moreText);
        System.out.println(result);
        Assertions.assertEquals(except, result);
    }
}

