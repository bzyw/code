package org.bzyw.prototype;

import org.bzyw.prototype.framework.Product;

/**
 * Created by bzyw on 2018/5/4.
 */
public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String message) {
        System.out.print("\n");
        System.out.println("\"" + message + "\"");
        int ullenth = message.length() + 2;
        for (int i = 0; i < ullenth; i++) {
            System.out.print(ulchar);
        }
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
