package org.bzyw.chainofresponsibility2;

/**
 * Created by bzyw on 2018/5/16.
 */
public class LengthValidator extends Validator {
    private int maxLength;

    public LengthValidator(String name, int maxLength) {
        super(name);
        this.maxLength = maxLength;
    }

    @Override
    protected boolean validate(Parameter param) {
        if (param.getParam().length() <= maxLength) {
            return true;
        } else {
            return false;
        }
    }
}
