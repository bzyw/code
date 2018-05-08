package org.bzyw.abstractfactory.tablefactory;

import org.bzyw.abstractfactory.factory.Item;
import org.bzyw.abstractfactory.factory.Page;

/**
 * Created by bzyw on 2018/5/7.
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html><html><head><title>" + title + "</title></head><body>");
        builder.append("<h1>" + title + "</h1>");
        for (Item item : content) {
            builder.append(item.makeHTML());
        }
        builder.append("<hr/>");
        builder.append("<address>" + author + "</address>");
        builder.append("</body></html>");
        return builder.toString();
    }
}
