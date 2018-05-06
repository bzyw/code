package org.bzyw.builder;

/**
 * Created by bzyw on 2018/5/5.
 */
public class TextBuilder extends Builder {
    private StringBuilder result = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        result.append("====================\n");
        result.append("[" + title + "]\n");
    }

    @Override
    public void makeString(String str) {
        result.append("*" + str + "\n");
    }

    @Override
    public void makeItem(String[] items) {
        for (String item : items) {
            result.append(" & " + item + "\n");
        }
    }

    @Override
    public Object getResult() {
        result.append("====================\n");
        return result.toString();
    }
}
