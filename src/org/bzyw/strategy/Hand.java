package org.bzyw.strategy;

import java.security.SecureRandom;

/**
 * Created by bzyw on 2018/5/9.
 */
public enum Hand {
    STONE("stone", 3), SCISSORS("scissors", 2), CLOTH("cloth", 1);
    private static final SecureRandom RANDOM = new SecureRandom();
    private String name;
    private int value;

    private Hand(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public boolean isStrongerThan(Hand another) {
        return fight(another) > 0;
    }

    public boolean isWeakerThan(Hand another) {
        return fight(another) < 0;
    }

    /**
     * 随机返回一个手势
     *
     * @return
     */
    public static Hand randomHand() {
        int ranNumber = RANDOM.nextInt(4) + 1;
        if (ranNumber == 3) {
            return STONE;
        } else if (ranNumber == 2) {
            return SCISSORS;
        } else {
            return CLOTH;
        }
    }

    /**
     * 比较两手势的胜负
     *
     * @param another 要比较的对象
     * @return 平局返回0;当前对象负于another返回负数;胜过another返回正数
     */
    private int fight(Hand another) {

        if (this.value == another.value) {
            return 0;
        } else if (this.value > another.value) {
            return 1;
        } else {
            return -1;
        }
    }
}
