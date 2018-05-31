package org.bzyw.state.impl;

import org.bzyw.state.Context;
import org.bzyw.state.State;

/**
 * Created by bzyw on 2018/5/30.
 */
public class DayState implements State {
    private static DayState dayState = new DayState();

    private DayState() {
    }

    public static DayState getInstance() {
        return dayState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("一般的通话（白天）");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}
