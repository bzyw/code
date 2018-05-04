package org.bzyw.decorator;

/**
 * Created by bzyw on 2018/2/8.
 */
public class StringDisplay extends Display {
    private String text;

    public StringDisplay(String text) {
        this.text = text;
    }

    @Override
    public int getColumns() {
        return text.length();
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 1) {
            return text;
        } else {
            return null;
        }
    }
}
