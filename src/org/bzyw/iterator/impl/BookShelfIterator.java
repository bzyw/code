package org.bzyw.iterator.impl;

import org.bzyw.iterator.Iterator;

/**
 * Created by bzyw on 2018/5/3.
 */
public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf = null;

    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        int size = this.bookShelf.size();
        if (index < size) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return bookShelf.getBook(index++);
        } else {
            return null;
        }
    }
}
