package moduleFive.book;

public class Book {
    public int id;
    public String title;
    public String author;
    public int pageCount;

    // Конструктор для удобства создания экземпляров книги
    public Book(int id, String title, String author, int pageCount) {
        this.id = id;
        this.title = title;
        this.pageCount = pageCount;
    }
}