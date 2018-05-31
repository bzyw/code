package org.bzyw.state;

/**
 * Created by bzyw on 2018/5/30.
 */
public interface Context {
    /**
     * 设定时间
     *
     * @param hour
     */
    public abstract void setClock(int hour);

    /**
     * 状态变化
     *
     * @param state
     */
    public abstract void changeState(State state);

    /**
     * 调用安保中心
     *
     * @param msg
     */
    public abstract void callSecurityCenter(String msg);

    /**
     * 保安中心保留记录
     *
     * @param msg
     */
    public abstract void recordLog(String msg);
}
