package org.bzyw.decorator;

/**
 * Created by bzyw on 2018/5/15.
 */
public class Main {
    public static void main(String[] args) {
        Display strDisplay = new StringDisplay("hello,World!");
        FullBorder fullBorder = new FullBorder(strDisplay);
        SideBorder sideBorder = new SideBorder(fullBorder);
        SideBorder sideBorder2 = new SideBorder(sideBorder);
        FullBorder fullBorder2 = new FullBorder(sideBorder2);
        fullBorder2.show();
    }
}
