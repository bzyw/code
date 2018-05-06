package org.bzyw.abstractfactory.listfactory;

import org.bzyw.abstractfactory.factory.Factory;
import org.bzyw.abstractfactory.factory.Link;
import org.bzyw.abstractfactory.factory.Page;
import org.bzyw.abstractfactory.factory.Tray;

/**
 * Created by bzyw on 2018/5/6.
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
