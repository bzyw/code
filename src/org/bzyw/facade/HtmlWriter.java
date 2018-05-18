package org.bzyw.facade;

import java.io.*;

/**
 * Created by bzyw on 2018/5/18.
 */
public class HtmlWriter {
    private BufferedWriter writer;

    public HtmlWriter(String filename) {
        try {
            writer = new BufferedWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void title(String title) {
        try {
            writer.write("<!DOCTYPE html><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><title>" + title + "</title></head><body><h1>" + title + "</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paragraph(String msg) {
        try {
            writer.write("<p>" + msg + "</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void link(String url, String caption) {
        paragraph("<a href=\"" + url + "\">" + caption + "</a>");
    }

    public void mailTo(String url, String name) {
        link("maolto:" + url, name);
    }

    public void makeHtml() {
        try {
            writer.write("</body></html>");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
