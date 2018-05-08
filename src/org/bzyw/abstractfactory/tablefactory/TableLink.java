package org.bzyw.abstractfactory.tablefactory;

import org.bzyw.abstractfactory.factory.Link;

/**
 * Created by bzyw on 2018/5/7.
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\""+url+"\">" + caption + "</a></td>";
    }
}
