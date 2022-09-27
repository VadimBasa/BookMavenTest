class Main {
    int rating = 3;
    String textBook = "";
    String moreText;

    public static void main(String[] args) {
        Author authorSam = new Author("Самуил", "Маршак");
        Author authorKor = new Author("Корней", "Чуковский");
        Author authorStiv = new Author("Stiven", "King");
        Book bookSpase = new Book("Война и Мир", authorSam, 1863);
        Book bookDoktor = new Book("Айболит", authorKor, 1930);
//Задача1
        Book starWars = new Book("Star Wars", authorStiv, 1985);
        System.out.println("книга = " + starWars.nameBook + ", автор = " + authorStiv.firstName + " " + authorStiv.lastName + ", год издания - " + starWars.creationYear + ", рейтинг - " + starWars.rating + ", текст книги - " + starWars.textBook);
        starWars.up();
        System.out.println("книга = " + starWars.nameBook + ", автор = " + starWars.nameAuthor + ", год издания - " + starWars.creationYear + ", рейтинг - " + starWars.rating + ", текст книги - " + starWars.textBook);
        starWars.down();
        System.out.println("книга = " + starWars.nameBook + ", автор = " + starWars.nameAuthor + ", год издания - " + starWars.creationYear + ", рейтинг - " + starWars.rating + ", текст книги - " + starWars.textBook);
        starWars.append("Chubaka was dead");
        System.out.println("книга = " + starWars.nameBook + ", автор = " + starWars.nameAuthor + ", год издания - " + starWars.creationYear + ", рейтинг - " + starWars.rating + ", текст книги - " + starWars.textBook);
        //authorStiv.newBook("Terminator");
        System.out.println(authorStiv.toString());
        authorStiv.newBook("Terminator");
        System.out.println(authorStiv.toString());// проверяем, как работает счетчик
        System.out.println(authorStiv.newBook("Terminator"));
        //authorStiv.newBook("Terminator");
        System.out.println(bookDoktor.toString());
        System.out.println(bookSpase.append("1812 год, все плохо..."));
    }
}

