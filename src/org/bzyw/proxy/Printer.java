package org.bzyw.proxy;

/**
 * Created by bzyw on 2018/6/3.
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("正在产生Printer实例");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("正在产生Printer实例(" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String msg) {
        System.out.println("=== " + name + " ===");
        System.out.println(msg);
    }

    private void heavyJob(String msg) {
        System.out.print(msg + "...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("完成。");

    }
}
