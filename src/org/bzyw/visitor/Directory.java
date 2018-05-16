package org.bzyw.visitor;


import org.bzyw.visitor.exception.FileTreatmentException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by bzyw on 2018/5/15.
 */
public class Directory extends Entry {
    private String name;
    private List<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
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
        int size = 0;
        for (Entry entry : dir) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void add(Entry entry) throws FileTreatmentException {
        this.dir.add(entry);
    }

    @Override
    public Iterator<Entry> iterator() throws FileTreatmentException {
        return this.dir.iterator();
    }
}
