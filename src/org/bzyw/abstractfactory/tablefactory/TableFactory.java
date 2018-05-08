package org.bzyw.abstractfactory.tablefactory;

import org.bzyw.abstractfactory.factory.Factory;
import org.bzyw.abstractfactory.factory.Link;
import org.bzyw.abstractfactory.factory.Page;
import org.bzyw.abstractfactory.factory.Tray;

/**
 * Created by bzyw on 2018/5/7.
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
