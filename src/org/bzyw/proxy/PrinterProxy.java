package org.bzyw.proxy;

/**
 * Created by bzyw on 2018/6/3.
 */
public class PrinterProxy implements Printable {
    private String name;
    /**
     * “本人”
     */
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if (null != real) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String msg) {
        if (null == real) {
            real = new Printer(this.name);
        }
        real.print(msg);
    }
}
