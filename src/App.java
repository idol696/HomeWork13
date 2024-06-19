public class App {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        Author authorOne = new Author("Николай", "Фёдоров");
        Author authorTwo = new Author("Виталий", "Валериянович");
        Author authorThree = new Author("Виталий", "Валериянович");
        Book bookOne = new Book("ЛаплаНдия", 1970, authorOne); // допустили ошибку в букве "Н" - заглавная
        Book bookTwo = new Book("Приключения юнного Питекантропика Геракла", 1908, authorTwo);
        Book bookThree = new Book("Лапландия", 1970, authorOne);

        System.out.println("Список литературы:");
        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        System.out.println(bookThree.toString());

        if (bookOne.equals(bookTwo)) {
            System.out.println("Книги одинаковы");
        } else {
            System.out.println("Книги разные");
        }

        if (authorTwo.equals(authorThree)) {
            System.out.println("Авторы одинаковы");
        } else {
            System.out.println("Авторы разные");
        }
    }
}
