package org.bzyw.abstractfactory.listfactory;

import org.bzyw.abstractfactory.factory.Item;
import org.bzyw.abstractfactory.factory.Tray;

/**
 * Created by bzyw on 2018/5/6.
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<p>" + caption + "</p>");
        builder.append("<ul>");
        for (Item item : items) {
            builder.append("<li>");
            builder.append(item.makeHTML());
            builder.append("</li>");
        }
        builder.append("</ul>");
        return builder.toString();
    }
}
