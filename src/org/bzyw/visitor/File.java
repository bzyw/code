package org.bzyw.visitor;

import org.bzyw.visitor.exception.FileTreatmentException;

import java.util.Iterator;

/**
 * Created by bzyw on 2018/5/15.
 */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public Iterator<Entry> iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }
}
