public class Book {

    String name;
    String author;
    int number;
    int countOfPage;

    public Book(String name, String author, int number, int countOfPage) {
        this.name = name;
        this.author = author;
        this.number = number;
        this.countOfPage = countOfPage;
    }

    public Book(String name, String author, int number) {
        this.name = name;
        this.author = author;
        this.number = number;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", number=" + number +
                ", numberOfPage=" + countOfPage +
                '}';
    }
}
