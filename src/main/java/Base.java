import java.util.Random;

public class Base {
    public static void main(String[] args) {

        Book[] bookFromLibrary = {
                new Book("Мастер и Маргарита"),
                new Book("Евгений Онегин"),
                new Book("Преступление и наказание"),
                new Book("Война и мир"),
                new Book("Маленький принц", "Антуан де Сент-Экзюпери"),
                new Book("Герой нашего времени", "Михаил Лермонтов,"),
                new Book("Двенадцать стульев", "Евгений Петров"),
                new Book("1984", "Джордж Оруэлл"),
                new Book("Сто лет одиночества", "Габриэль Гарсиа Маркес", 8),
                new Book("Гарри Поттер и философский камень", "Джоан К. Роулинг", 3),
                new Book("Мёртвые души", "Николай Васильевич Гоголь", 1),
                new Book("Анна Каренина", "Лев Толстой", 12),
                new Book("Идиот", "Фёдор Достоевский", 5, 188),
                new Book("Портрет Дориана Грея", "Оскар Уайльд", 2, 145),
                new Book("Горе от ума", "А. С. Грибоедов", 1, 321),
                new Book("Отцы и дети", "Иван Сергеевич Тургенев", 3, 875)
        };

        Reader reader = new Reader(bookFromLibrary);

        reader.readBook(reader.choiceBook());

    }
}