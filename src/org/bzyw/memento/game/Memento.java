package org.bzyw.memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bzyw on 2018/5/27.
 */
public class Memento {
    int money;
    List<String> fruits;

    /**
     * narrow interface
     *
     * @return
     */
    public int getMoney() {
        return this.money;
    }

    /**
     * wide interface
     *
     * @param money
     */
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    /**
     * wide interface
     *
     * @param fruit
     */
    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return this.fruits;
    }
}
