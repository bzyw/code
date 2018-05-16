package org.bzyw.chainofresponsibility2;

/**
 * Created by bzyw on 2018/5/16.
 */
public class AsciiValidator extends Validator {

    public AsciiValidator(String name) {
        super(name);
    }

    @Override
    protected boolean validate(Parameter param) {
        String paraStr = param.getParam();
        int length = paraStr.length();
        for (int i = 0; i < length; i++) {
            char ch = paraStr.charAt(i);
            if (ch > Byte.MAX_VALUE) {
                return false;
            }
        }
        return true;
    }
}
