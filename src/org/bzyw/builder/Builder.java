package org.bzyw.builder;

/**
 * Created by bzyw on 2018/5/5.
 */
public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItem(String[] items);

    public abstract Object getResult();
}
