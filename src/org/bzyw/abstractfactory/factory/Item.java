package org.bzyw.abstractfactory.factory;

/**
 * Created by bzyw on 2018/5/6.
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
