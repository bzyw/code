package org.bzyw.builder;

/**
 * Created by bzyw on 2018/5/5.
 */
public class HtmlBuilder extends Builder {
    private StringBuilder result = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        result.append("<!DOCTYPE html><html><head><title>" + title + "</title></head><body>");
        result.append("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        result.append("<p>" + str + "</p>");
    }

    @Override
    public void makeItem(String[] items) {
        result.append("<ul>");
        for (String item : items) {
            result.append("<li>" + item + "</li>");
        }
        result.append("</ul>");
    }

    @Override
    public Object getResult() {
        result.append("</body></html>");
        return result.toString();
    }
}
