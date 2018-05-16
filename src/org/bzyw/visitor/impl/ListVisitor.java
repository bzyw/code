package org.bzyw.visitor.impl;

import org.bzyw.visitor.Directory;
import org.bzyw.visitor.Entry;
import org.bzyw.visitor.File;
import org.bzyw.visitor.Visitor;

import java.util.Iterator;

/**
 * Created by bzyw on 2018/5/15.
 */
public class ListVisitor implements Visitor {
    private String currDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currDir + "/" + file.toString());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currDir + "/" + directory.toString());
        String saveDir = currDir;
        currDir = currDir + "/" + directory.getName();
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
        currDir = saveDir;
    }
}
