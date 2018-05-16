package org.bzyw.decorator;

/**
 * Created by bzyw on 2018/2/8.
 */
public abstract class Display {
    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public final void show() {
        int rows = getRows();
        for (int i = 1; i <= rows; i++) {
            String rowText = getRowText(i);
            System.out.println(rowText);
        }
    }
}
