package org.bzyw.mediator;

/**
 * Created by bzyw on 2018/5/19.
 */
public interface Mediator {
    public abstract void createColleagues();

    /**
     * colleague向mediator提出咨询时调用此方法
     * @param colleague
     */
    public abstract void colleagueChanged(Colleague colleague);
}
