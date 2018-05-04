package org.bzyw.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bzyw on 2018/5/4.
 */
public class Manager {
    private Map<String, Product> products = new HashMap<>();

    public void register(String name, Product p) {
        products.put(name, p);
    }

    public Product create(String name) {
        Product product = products.get(name);
        if (null != product) {
            return product.createClone();
        }
        return null;
    }
}
