package org.bzyw.chainofresponsibility2;

import java.util.regex.Pattern;

/**
 * Created by bzyw on 2018/5/16.
 */
public class RegValidator extends Validator {
    private String reg;

    public RegValidator(String name, String reg) {
        super(name);
        this.reg = reg;
    }

    @Override
    protected boolean validate(Parameter param) {
        if (Pattern.matches(reg, param.getParam())) {
            return true;
        } else {
            return false;
        }
    }
}
