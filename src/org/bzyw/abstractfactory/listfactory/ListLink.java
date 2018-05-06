package org.bzyw.abstractfactory.listfactory;

import org.bzyw.abstractfactory.factory.Link;

/**
 * Created by bzyw on 2018/5/6.
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<a href=\"" + url + "\">" + caption + "</a>";
    }
}
