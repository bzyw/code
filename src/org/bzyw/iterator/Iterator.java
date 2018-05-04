package org.bzyw.iterator;

/**
 * Created by bzyw on 2018/5/3.
 */
public interface Iterator<T> {
    public abstract boolean hasNext();

    public abstract T next();
}
