package org.bzyw.visitor;

/**
 * Created by bzyw on 2018/5/15.
 */
public interface Acceptor {
    public abstract void accept(Visitor visitor);
}
