package org.bzyw.templatemethod;

/**
 * Created by bzyw on 2018/5/3.
 */
public abstract class AbstractDisplay {
    protected abstract void open();

    protected abstract void print();

    protected abstract void close();

    public void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
