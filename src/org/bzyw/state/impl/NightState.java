package org.bzyw.state.impl;

import org.bzyw.state.Context;
import org.bzyw.state.State;

/**
 * Created by bzyw on 2018/5/30.
 */
public class NightState implements State {
    private static NightState nightState = new NightState();

    private NightState() {
    }

    public static NightState getInstance() {
        return NightState.nightState;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("异常：晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃（晚上）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}
