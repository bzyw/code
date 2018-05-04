package org.bzyw.templatemethod;

/**
 * Created by bzyw on 2018/5/3.
 */
public class CharDisplay extends AbstractDisplay {
    private char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    protected void open() {
        System.out.print("<<");
    }

    @Override
    protected void print() {
        System.out.print(this.c);
    }

    @Override
    protected void close() {
        System.out.println(">>");
    }
}
