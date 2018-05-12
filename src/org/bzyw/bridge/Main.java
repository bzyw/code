package org.bzyw.bridge;

/**
 * Created by bzyw on 2018/5/9.
 */
public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello,World!"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello,World!!"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello,World!!!"));
        display1.display();
        System.out.println("");
        display2.display();
        System.out.println("");
        display3.multiDisplay(5);
    }
}
