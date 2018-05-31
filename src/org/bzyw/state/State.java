package org.bzyw.state;

/**
 * Created by bzyw on 2018/5/30.
 */
public interface State {
    /**
     * 设定时间
     *
     * @param context
     * @param hour
     */
    public abstract void doClock(Context context, int hour);

    /**
     * 使用金库
     *
     * @param context
     */
    public abstract void doUse(Context context);

    /**
     * 警铃
     *
     * @param context
     */
    public abstract void doAlarm(Context context);

    /**
     * 一般通话
     *
     * @param context
     */
    public abstract void doPhone(Context context);
}
