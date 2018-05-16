package org.bzyw.visitor;

/**
 * Created by bzyw on 2018/5/15.
 */
public interface Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
