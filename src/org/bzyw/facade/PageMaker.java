package org.bzyw.facade;

/**
 * Created by bzyw on 2018/5/18.
 */
public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String name, String filename) {
        String mailAddress = Data.getMailAddress(name);
        HtmlWriter htmlWriter = new HtmlWriter(filename);
        htmlWriter.title("Welcome!");
        htmlWriter.paragraph("欢迎来到" + name + "的网页！");
        htmlWriter.link(mailAddress, name);
        htmlWriter.makeHtml();
    }
}
