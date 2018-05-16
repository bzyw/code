package org.bzyw.chainofresponsibility;

/**
 * Created by bzyw on 2018/5/16.
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getCode() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
