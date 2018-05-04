package org.bzyw.observer;

/**
 * Created by bzyw on 2018/2/3.
 */
public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        numberGenerator.add(digitObserver);
        numberGenerator.add(graphObserver);

        numberGenerator.execute();
    }

}
