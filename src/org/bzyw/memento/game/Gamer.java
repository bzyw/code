package org.bzyw.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bzyw on 2018/5/27.
 */
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<String>();
    private Random random = new Random();
    private static String[] fruitsname = {"apple", "grape", "banana", "orange"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }


    public void bet() {
        int dice = this.random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("钱多了100。");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("钱减半。");
        } else if (dice == 6) {
            String fruit = getFruit();
            System.out.println("得到水果：" + fruit);
            this.fruits.add(fruit);
        } else {
            System.out.println("什么都没发生。");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(this.money);
        for (String fruit : fruits) {
            if (fruit.startsWith("delicious")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits.clear();
        this.fruits.addAll(memento.getFruits());
    }

    public String toString() {
        return "{money=" + money + ",fruits=" + fruits + "}";
    }

    private String getFruit() {
        String prefix = "";
        if (this.random.nextBoolean()) {
            prefix += "delicious";
        }
        return prefix + fruitsname[this.random.nextInt(fruitsname.length)];
    }

}
