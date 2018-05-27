package org.bzyw.mediator;

/**
 * Created by bzyw on 2018/5/19.
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);

    /**
     * mediator调用此方法
     * @param enable
     */
    public abstract void setColleagueEnable(boolean enable);
}
