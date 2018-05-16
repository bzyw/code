package org.bzyw.chainofresponsibility;

/**
 * Created by bzyw on 2018/5/16.
 */
public class Trouble {
    private int code;

    public Trouble(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return "Trouble " + code;
    }

}
