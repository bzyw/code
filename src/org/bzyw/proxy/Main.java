package org.bzyw.proxy;

/**
 * Created by bzyw on 2018/6/3.
 */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名称：" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在的名称：" + p.getPrinterName());
        p.print("Hello,World!");
    }
}
