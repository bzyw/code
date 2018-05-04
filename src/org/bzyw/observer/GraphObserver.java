package org.bzyw.observer;

/**
 * Created by bzyw on 2018/2/3.
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        int number = numberGenerator.getNumber();
        System.out.print("GraphObserver:");
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
