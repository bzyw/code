package org.bzyw.templatemethod;

/**
 * Created by bzyw on 2018/5/3.
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('H');
        display.display();

        AbstractDisplay display1 = new StringDisplay("Hello,World!");
        display1.display();
    }
}
