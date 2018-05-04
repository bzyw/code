package org.bzyw.prototype;

import org.bzyw.prototype.framework.Product;

/**
 * Created by bzyw on 2018/5/4.
 */
public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String message) {
        System.out.print("\n");
        int borderLenth = message.length() + 2;
        printBorder(borderLenth);
        System.out.print(decochar);
        System.out.print(message);
        System.out.println(decochar);
        printBorder(borderLenth);
    }

    private void printBorder(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.print("\n");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
