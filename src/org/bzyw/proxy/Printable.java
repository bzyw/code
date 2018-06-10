package org.bzyw.proxy;

/**
 * Created by bzyw on 2018/6/3.
 */
public interface Printable {
    public abstract void setPrinterName(String name);

    public abstract String getPrinterName();

    public abstract void print(String msg);
}
