package org.bzyw.chainofresponsibility;

/**
 * Created by bzyw on 2018/5/16.
 */
public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("alice");
        Support bob = new LimitSupport("bob", 5);
        Support charlie = new SpecialSupport("charlie", 7);
        Support diana = new OddSupport("diana");

        alice.setNext(bob).setNext(charlie).setNext(diana);

        for (int i = 0; i < 20; i++) {
            alice.support(new Trouble(i));
        }
    }
}
