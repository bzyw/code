package org.bzyw.iterator;

import org.bzyw.iterator.impl.BookShelf;

/**
 * Created by bzyw on 2018/5/3.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf books = new BookShelf();
        books.addBook(new Book("aa"));
        books.addBook(new Book("bb"));
        books.addBook(new Book("cc"));
        books.addBook(new Book("dd"));
        books.addBook(new Book("ee"));

        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getName());
        }

    }
}
