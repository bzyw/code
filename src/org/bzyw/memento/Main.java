package org.bzyw.memento;

import org.bzyw.memento.game.Gamer;
import org.bzyw.memento.game.Memento;

/**
 * Created by bzyw on 2018/5/27.
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("====== " + i);
            System.out.println("现况:" + gamer);
            gamer.bet();
            System.out.println("手边金钱总额:" + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("赢了,存储现在的状态.");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("输了,恢复到前次状态.");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }

    }
}
