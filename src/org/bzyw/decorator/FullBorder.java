package org.bzyw.decorator;

/**
 * Created by bzyw on 2018/5/15.
 */
public class FullBorder extends Border {
    private char ch = '*';

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return super.display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return super.display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 1 || row == getRows()) {
            return getLine();
        } else {
            String result = ch + super.display.getRowText(row - 1) + ch;
            return result;
        }
    }

    private String getLine() {
        StringBuilder builder = new StringBuilder();
        builder.append("+");
        int length = super.display.getColumns();
        for (int i = 0; i < length; i++) {
            builder.append(ch);
        }
        builder.append("+");
        return builder.toString();
    }
}
