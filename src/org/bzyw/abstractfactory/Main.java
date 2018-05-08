package org.bzyw.abstractfactory;

import org.bzyw.abstractfactory.factory.Factory;
import org.bzyw.abstractfactory.factory.Link;
import org.bzyw.abstractfactory.factory.Page;
import org.bzyw.abstractfactory.factory.Tray;

/**
 * Created by bzyw on 2018/5/6.
 */
public class Main {
    public static void main(String[] args) {
        //String classname = "org.bzyw.abstractfactory.listfactory.ListFactory";
        String classname = "org.bzyw.abstractfactory.tablefactory.TableFactory";
        Factory factory = Factory.getFactory(classname);

        Link asahi = factory.createLink("朝日新闻", "http://www.asahi.com");
        Link yomiuri = factory.createLink("读者新闻", "http://www.yomiuri.co.jp");
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray traynews = factory.createTray("新闻");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("搜索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "结城 浩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
