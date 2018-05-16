package org.bzyw.chainofresponsibility2;

/**
 * Created by bzyw on 2018/5/16.
 */
public abstract class Validator {
    private String name;
    private Validator next;

    public Validator(String name) {
        this.name = name;
    }

    public Validator setNext(Validator next) {
        this.next = next;
        return next;
    }

    /**
     * 校验参数
     *
     * @param param 参数
     * @return 校验通过返回true，不通过返回false
     */
    public boolean reslove(Parameter param) {
        if (validate(param)) {
            if (next == null) {
                return true;
            } else {
                return next.reslove(param);
            }
        } else {
            return false;
        }
    }

    /**
     * 校验参数
     *
     * @return 能通过校验返回true，不能通过返回false
     */
    protected abstract boolean validate(Parameter param);
}
