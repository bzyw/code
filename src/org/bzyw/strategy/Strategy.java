package org.bzyw.strategy;

/**
 * Created by bzyw on 2018/5/9.
 */
public interface Strategy {

    public abstract Hand nextHand();

    public abstract void study(boolean isWin);
}
