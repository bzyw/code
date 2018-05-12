package org.bzyw.composite;

import org.bzyw.composite.impl.NE;
import org.bzyw.composite.impl.SubNet;

/**
 * Created by bzyw on 2018/5/12.
 */
public class Main {
    public static void main(String[] args) {
        NE ne1 = new NE("1.1.1.1", "ne1", "1.0");
        NE ne2 = new NE("1.1.1.2", "ne2", "1.0");
        NE ne3 = new NE("1.1.1.3", "ne3", "1.0");
        NE ne4 = new NE("1.1.1.4", "ne4", "1.0");
        NE ne5 = new NE("1.1.1.5", "ne5", "1.0");
        NE ne6 = new NE("1.1.1.6", "ne6", "1.0");
        NE ne7 = new NE("1.1.1.7", "ne7", "1.0");

        SubNet subNet1 = new SubNet("2.2.2.2", "subnet1", "unknown");
        SubNet subNet2 = new SubNet("2.2.2.3", "subnet2", "unknown");
        SubNet subNet3 = new SubNet("2.2.2.4", "subnet3", "unknown");

        subNet3.add(ne6);
        subNet3.add(ne7);

        subNet2.add(ne4);
        subNet2.add(ne5);
        subNet2.add(subNet3);

        subNet1.add(ne1);
        subNet1.add(ne2);
        subNet1.add(ne3);
        subNet1.add(subNet2);

        subNet1.print("");
    }
}
