package org.bzyw.visitor;

import org.bzyw.visitor.exception.FileTreatmentException;

import java.util.Iterator;

/**
 * Created by bzyw on 2018/5/15.
 */
public abstract class Entry implements Acceptor {
    public abstract String getName();

    public abstract int getSize();

    public abstract void add(Entry entry) throws FileTreatmentException;

    public abstract Iterator<Entry> iterator() throws FileTreatmentException;

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
