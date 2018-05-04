package org.bzyw.factorymethod.idcard;

import org.bzyw.factorymethod.framework.Product;

/**
 * Created by bzyw on 2018/5/3.
 */
public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的卡。");
    }

    public String getOwner() {
        return this.owner;
    }
}
