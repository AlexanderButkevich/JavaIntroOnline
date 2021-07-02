package by.epam.training_center.part1;

import by.epam.training_center.part1.beans.task9.Book;
import by.epam.training_center.part1.beans.task9.BookStorage;

import java.util.function.Predicate;

/**
 * Classes and Objects
 */
public final class Task9 {
    public static void solution() {

        BookStorage storage = new BookStorage() {{
            add(
                    new Book("Selected Poems", "Marina Tsvetaeva", "Bloodaxe Books", 1987, 162, 13.18, "paperback"),
                    new Book("To You - in 10 Decades", "Marina Tsvetaeva", "Sumizdat", 2013, 254, 8.00, "hardcover"),
                    new Book("Selected poems", "Denise Levertov", "Bloodaxe Books", 1986, 221, 58.65, "paperback"),
                    new Book("Payback", "Richard Stark", "Mysterious Press", 1999, 350, 17.99, "paperback")
            );
        }};

        Predicate<Book> pred1 = book -> book.getAuthor().equals(AUTHOR);
        Predicate<Book> pred2 = book -> book.getPublisher().equals(PUBLISHER);
        Predicate<Book> pred3 = book -> book.getYear() > YEAR;

        storage.print(pred1);
        System.out.println();

        storage.print(pred2);
        System.out.println();

        storage.print(pred3);

    }

    private static final String AUTHOR = "Marina Tsvetaeva";
    private static final String PUBLISHER = "Bloodaxe Books";
    private static final int YEAR = 1986;
}
