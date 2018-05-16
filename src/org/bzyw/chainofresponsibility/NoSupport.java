package org.bzyw.chainofresponsibility;

/**
 * Created by bzyw on 2018/5/16.
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
