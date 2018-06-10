package org.bzyw.command.impl;

import org.bzyw.command.Drawable;

import java.awt.*;

/**
 * Created by bzyw on 2018/6/3.
 */
public class DrawCanvas extends Canvas implements Drawable {
    /**
     * 绘制的颜色
     */
    private Color color = Color.red;
    /**
     * 绘制点的半径
     */
    private int radius = 16;

    /**
     * 命令记录
     */
    private MacroCommand history;

    public DrawCanvas(int weight, int height, MacroCommand history) {
        setSize(weight, height);
        setBackground(Color.white);
        this.history = history;
    }

    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public void paint(Graphics g) {
        history.execute();
    }
}
