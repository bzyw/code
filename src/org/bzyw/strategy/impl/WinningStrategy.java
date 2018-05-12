package org.bzyw.strategy.impl;

import org.bzyw.strategy.Hand;
import org.bzyw.strategy.Strategy;

/**
 * 先调用nextHand，再调用study
 * Created by bzyw on 2018/5/9.
 */
public class WinningStrategy implements Strategy {
    private boolean isWon = false;

    private Hand preHand;

    @Override
    public Hand nextHand() {
        if (!isWon) {
            preHand = Hand.randomHand();
        }
        return preHand;
    }

    @Override
    public void study(boolean isWin) {
        this.isWon = isWin;
    }
}
