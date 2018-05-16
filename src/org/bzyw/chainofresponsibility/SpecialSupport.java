package org.bzyw.chainofresponsibility;

/**
 * Created by bzyw on 2018/5/16.
 */
public class SpecialSupport extends Support {
    private int code;

    public SpecialSupport(String name, int code) {
        super(name);
        this.code = code;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getCode() == code) {
            return true;
        } else {
            return false;
        }
    }
}
