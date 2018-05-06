package org.bzyw.abstractfactory.factory;

/**
 * Created by bzyw on 2018/5/6.
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;

    }
}
