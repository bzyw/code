package org.bzyw.templatemethod;

/**
 * Created by bzyw on 2018/5/3.
 */
public class StringDisplay extends AbstractDisplay {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    protected void open() {
        printBorderString();
    }

    @Override
    protected void print() {
        System.out.println(" " + string);
    }

    @Override
    protected void close() {
        printBorderString();
    }

    private void printBorderString() {
        System.out.print('+');
        int length = string.length();
        for (int i = 0; i < length; i++) {
            System.out.print('-');
        }
        System.out.println('+');
    }
}
