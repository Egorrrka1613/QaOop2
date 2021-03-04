import java.util.Random;

public class Reader {
    Book[] arrBook;

    public Reader(Book[] arrBook) {
        this.arrBook = arrBook;
    }

    public Book choiceBook() {
        int bookNum = getRandomNum(arrBook.length);
        return arrBook[bookNum];
    }

    public int getRandomNum(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public void readBook(Book book) {
        System.out.println("Читатель приступил к книге \"" + book.toString() + "\".");
        ratingBook(book);
    }

    public void ratingBook(Book book) {
        int countLikeBook = 0;

        countLikeBook += book.name.length();

        if (book.countOfPage == 0) {
            countLikeBook -= getRandomNum(101);
        } else {
            countLikeBook += book.countOfPage;
        }

        if (book.number == 0) {
            countLikeBook -= getRandomNum(101);
        } else {
            countLikeBook -= book.number;
        }

        if (book.author == null) {
            countLikeBook -= getRandomNum(101);
        } else {
            countLikeBook += book.author.length();
        }

        System.out.println("Оценка читателем книги " + book.name + ": " + countLikeBook);
    }

}
