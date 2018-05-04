package org.bzyw.prototype;

import org.bzyw.prototype.framework.Manager;
import org.bzyw.prototype.framework.Product;

/**
 * Created by bzyw on 2018/5/4.
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        MessageBox box1 = new MessageBox('*');
        MessageBox box2 = new MessageBox('/');
         UnderlinePen pen = new UnderlinePen('~');

        manager.register("strong message",pen);
        manager.register("warning box",box1);
        manager.register("slash box",box2);

        Product p1 = manager.create("strong message");
        p1.use("Hello,World.");
        Product p2 = manager.create("warning box");
        p2.use("Hello,World.");
        Product p3 = manager.create("slash box");
        p3.use("Hello,World.");

    }
}
