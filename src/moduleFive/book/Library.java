package moduleFive.book;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        // Создание списка книг
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Lord of the Rings", "NAME", 1000));
        books.add(new Book(2, "Harry Potter and the Philosopher's Stone", "NAME2", 200));
        books.add(new Book(3, "War and Peace", "NAME3", 1400));

        // Преобразование списка книг в HashMap
        convertToHashMap(books);
    }

    // Метод для преобразования списка книг в HashMap
    public static HashMap<Integer, Book> convertToHashMap(List<Book> books) {
        HashMap<Integer, Book> bookMap = new HashMap<>();

        // Перебор всех книг в списке и добавление их в HashMap
        for (Book book : books) {
            bookMap.put(book.id, book);
        }

        return bookMap;
    }
}
