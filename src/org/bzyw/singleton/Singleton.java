package org.bzyw.singleton;

/**
 * Created by bzyw on 2018/5/4.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
