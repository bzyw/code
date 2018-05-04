package org.bzyw.prototype.framework;

/**
 * Created by bzyw on 2018/5/4.
 */
public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createClone();
}
