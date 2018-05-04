package org.bzyw.observer;

/**
 * Created by bzyw on 2018/2/3.
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver:" + numberGenerator.getNumber());
    }
}
