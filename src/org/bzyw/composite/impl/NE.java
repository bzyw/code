package org.bzyw.composite.impl;

import org.bzyw.composite.Device;

import java.util.Collection;

/**
 * Created by bzyw on 2018/5/12.
 */
public class NE implements Device {
    private String ip;

    private String name;

    private String version;

    public NE(String ip, String name, String version) {
        this.ip = ip;
        this.name = name;
        this.version = version;
    }

    @Override
    public String getIddress() {
        return this.ip;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    @Override
    public void add(Device device) {
        throw new IllegalArgumentException();
    }

    @Override
    public void add(Collection<? extends Device> device) {
        throw new IllegalArgumentException();
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + this.toString());
    }

    @Override
    public String toString() {
        return ip + "#" + name + "#" + version;
    }
}
