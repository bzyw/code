package org.bzyw.factorymethod;

import org.bzyw.factorymethod.framework.Factory;
import org.bzyw.factorymethod.framework.Product;
import org.bzyw.factorymethod.idcard.IDCardFactory;

/**
 * Created by bzyw on 2018/5/3.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("aa");
        Product card2 = factory.create("bb");
        Product card3 = factory.create("cc");
        card1.use();
        card2.use();
        card3.use();
    }
}
