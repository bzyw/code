package org.bzyw.builder;

/**
 * Created by bzyw on 2018/5/5
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director(new TextBuilder());
        String textStr = director.construct().toString();
        System.out.println(textStr);

        Director director2 = new Director(new HtmlBuilder());
        String thtmlStr = director2.construct().toString();
        System.out.println(thtmlStr);
    }
}
