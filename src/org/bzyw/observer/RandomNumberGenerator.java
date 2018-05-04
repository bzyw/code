package org.bzyw.observer;

import java.util.Random;

/**
 * ConcreteSubject，具体目标参与者；随机数产生器
 * Created by bzyw on 2018/2/3.
 */
public class RandomNumberGenerator extends NumberGenerator {

    private int number;

    private Random random = new Random();

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void execute() {
        number = random.nextInt(20);
        notifyAllObservers();
    }
}
