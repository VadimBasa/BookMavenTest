class Main {
    int rating = 3;
    String textBook = "";
    String moreText;

    public static void main(String[] args) {
        Author authorSam = new Author("������", "������");
        Author authorKor = new Author("������", "���������");
        Author authorStiv = new Author("Stiven", "King");
        Book bookSpase = new Book("����� � ���", authorSam, 1863);
        Book bookDoktor = new Book("�������", authorKor, 1930);
//������1
        Book starWars = new Book("Star Wars", authorStiv, 1985);
        System.out.println("����� = " + starWars.nameBook + ", ����� = " + authorStiv.firstName + " " + authorStiv.lastName + ", ��� ������� - " + starWars.creationYear + ", ������� - " + starWars.rating + ", ����� ����� - " + starWars.textBook);
        starWars.up();
        System.out.println("����� = " + starWars.nameBook + ", ����� = " + starWars.nameAuthor + ", ��� ������� - " + starWars.creationYear + ", ������� - " + starWars.rating + ", ����� ����� - " + starWars.textBook);
        starWars.down();
        System.out.println("����� = " + starWars.nameBook + ", ����� = " + starWars.nameAuthor + ", ��� ������� - " + starWars.creationYear + ", ������� - " + starWars.rating + ", ����� ����� - " + starWars.textBook);
        starWars.append("Chubaka was dead");
        System.out.println("����� = " + starWars.nameBook + ", ����� = " + starWars.nameAuthor + ", ��� ������� - " + starWars.creationYear + ", ������� - " + starWars.rating + ", ����� ����� - " + starWars.textBook);
        //authorStiv.newBook("Terminator");
        System.out.println(authorStiv.toString());
        authorStiv.newBook("Terminator");
        System.out.println(authorStiv.toString());// ���������, ��� �������� �������
        System.out.println(authorStiv.newBook("Terminator"));
        //authorStiv.newBook("Terminator");
        System.out.println(bookDoktor.toString());
        System.out.println(bookSpase.append("1812 ���, ��� �����..."));
    }
}

