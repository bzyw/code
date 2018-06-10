package org.bzyw.command.impl;

import org.bzyw.command.Command;
import org.bzyw.command.Drawable;

import java.awt.*;

/**
 * Created by bzyw on 2018/6/3.
 */
public class DrawCommand implements Command {
    /**
     * 绘制对象
     */
    protected Drawable drawable;

    /**
     * 绘制的位置
     */
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
