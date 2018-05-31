package org.bzyw.flyweight;

/**
 * Created by bzyw on 2018/2/11.
 */
public class Main {
    public static void main(String[] args) {
        String phoneNumber = "0818-5527012";
        BigString bigString = new BigString(phoneNumber);
        bigString.print();
    }
}
