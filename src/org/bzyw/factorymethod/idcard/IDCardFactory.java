package org.bzyw.factorymethod.idcard;

import org.bzyw.factorymethod.framework.Factory;
import org.bzyw.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bzyw on 2018/5/3.
 */
public class IDCardFactory extends Factory {

    private List<Product> products = new ArrayList<Product>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product p) {
        products.add(p);
    }
}
