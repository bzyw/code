package org.bzyw.chainofresponsibility;

/**
 * Created by bzyw on 2018/5/16.
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getCode() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
