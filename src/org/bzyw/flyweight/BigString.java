package org.bzyw.flyweight;

/**
 * Created by bzyw on 2018/2/11.
 */
public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        init(string);
    }

    private void init(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }

}
