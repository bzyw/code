package org.bzyw.strategy.impl;

import org.bzyw.strategy.Hand;
import org.bzyw.strategy.Strategy;

/**
 * Created by bzyw on 2018/5/9.
 */
public class ProbStrategy implements Strategy {
    @Override
    public Hand nextHand() {
        return Hand.randomHand();
    }

    @Override
    public void study(boolean isWin) {

    }
}
