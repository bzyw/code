package org.bzyw.builder;

/**
 * Created by bzyw on 2018/5/5.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Object construct() {
        builder.makeTitle("Greeting");

        builder.makeString("白天");
        builder.makeItem(new String[]{"早上好", "中午好","下午好"});

        builder.makeString("晚上");
        builder.makeItem(new String[]{"晚上好","晚安"});

        return builder.getResult();
    }
}
