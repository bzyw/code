package org.bzyw.decorator;

/**
 * Created by bzyw on 2018/5/15.
 */
public class SideBorder extends Border {
    private char ch = '|';

    public SideBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return super.display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return super.display.getRows();
    }

    @Override
    public String getRowText(int row) {
        String result = ch + super.display.getRowText(row) + ch;
        return result;
    }
}
