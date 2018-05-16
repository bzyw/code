package org.bzyw.chainofresponsibility2;

/**
 * Created by bzyw on 2018/5/16.
 */
public class Main {
    public static void main(String[] args) {
        Validator lengthValidator = new LengthValidator("LengthValidator", 20);
        Validator regValidator = new RegValidator("RegValidator", "\\D+");
        Validator asciiValidator = new AsciiValidator("AsciiValidator");

        lengthValidator.setNext(regValidator).setNext(asciiValidator);
        boolean isMatch = lengthValidator.reslove(new Parameter("a_\n*&"));
        System.out.println(isMatch);
    }
}
