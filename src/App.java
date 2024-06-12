public class App {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        Author authorOne = new Author("Николай", "Фёдоров");
        Author authorTwo = new Author("Виталий", "Валериянович");
        Author authorThree = new Author("Виталий", "Валериянович");
        Book bookOne = new Book("Лапландия", 1970, authorOne);
        Book bookTwo = new Book("Приключения юнного Питекантропика Геракла", 1908, authorTwo);
        Book bookThree = new Book("Лапландия", 1970, authorOne);

        System.out.println("Список литературы:");
        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        System.out.println(bookThree.toString());

        System.out.println("Похожа ли книга 1 на книгу 2?");
        if (bookOne.equals(bookTwo)) {
            System.out.println("Книги похожи");
        } else {
            System.out.println("Книги не похожи");
        }
        System.out.println("Похожа ли книга 1 на книгу 3?");
        if (bookOne.equals(bookThree)) {
            System.out.println("Книги похожи");
        } else {
            System.out.println("Книги не похожи");
        }
        System.out.println("Похож ли автор 1 на автора 2?");
        if (authorOne.equals(authorTwo)) {
            System.out.println("Авторы похожи");
        } else {
            System.out.println("Авторы не похожи");
        }
        System.out.println("Похож ли автор 2 на автора 3?");
        if (authorTwo.equals(authorThree)) {
            System.out.println("Авторы похожи");
        } else {
            System.out.println("Книги не похожи");
        }
    }
}
