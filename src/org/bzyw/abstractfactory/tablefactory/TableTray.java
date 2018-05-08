package org.bzyw.abstractfactory.tablefactory;

import org.bzyw.abstractfactory.factory.Item;
import org.bzyw.abstractfactory.factory.Tray;

/**
 * Created by bzyw on 2018/5/7.
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<td><table width=\"100%\" border=\"1\">");
        builder.append("<tr><td colspan=\"" + items.size() + "\" align=\"center\">" + caption + "</td></tr>");
        builder.append("<tr>");
        for (Item item : items) {
            builder.append(item.makeHTML());
        }
        builder.append("</tr></table></td>");
        return builder.toString();
    }
}
