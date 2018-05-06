package org.bzyw.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bzyw on 2018/5/6.
 */
public abstract class Tray extends Item {
    protected List<Item> items = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        items.add(item);
    }
}
