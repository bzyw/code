package org.bzyw.strategy;

/**
 * Created by bzyw on 2018/5/10.
 */
public class Player {
    private String name;
    private Strategy strategy;

    private int wincount = 0;

    private int losecount = 0;

    private int gamecount = 0;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    public void even() {
        gamecount++;
    }

}
