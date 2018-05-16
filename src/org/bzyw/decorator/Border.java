package org.bzyw.decorator;

/**
 * Created by bzyw on 2018/5/15.
 */
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }

}
