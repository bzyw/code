package org.bzyw.iterator.impl;

import org.bzyw.iterator.Aggregate;
import org.bzyw.iterator.Book;
import org.bzyw.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bzyw on 2018/5/3.
 */
public class BookShelf implements Aggregate {
    private List<Book> books = new ArrayList<Book>();

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int index) {
        if (index < books.size()) {
            return books.get(index);
        } else {
            return null;
        }
    }

    public int size() {
        return this.books.size();
    }
}
