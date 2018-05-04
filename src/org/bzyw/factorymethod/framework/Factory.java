package org.bzyw.factorymethod.framework;

/**
 * Created by bzyw on 2018/5/3.
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product p);
}
