package org.bzyw.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * Suject对象：被观察的一方
 * Created by bzyw on 2018/2/3.
 */
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();
    /**
     * 登录观察者的方法
     *
     * @param observer 需要添加的观察者
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者的方法
     *
     * @param observer 需要删除的观察者
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者，调用观察者update方法的触发点
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    /**
     * 取得数值
     * @return 数值
     */
    public abstract int getNumber();

    /**
     * 产生数值
     */
    public abstract void execute();

}
