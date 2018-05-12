package org.bzyw.composite.impl;

import org.bzyw.composite.Device;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bzyw on 2018/5/12.
 */
public class SubNet implements Device {
    private String ip;
    private String name;
    private String version;

    private Set<Device> devices = new HashSet<>();

    public SubNet(String ip, String name, String version) {
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
        this.devices.add(device);
    }

    @Override
    public void add(Collection<? extends Device> device) {
        this.devices.addAll(device);
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + this.toString());
        String subPrefix = prefix + prefix;
        if (prefix.length() == 0) {
            subPrefix = "    " + prefix;
        }

        for (Device device : devices) {
            device.print(subPrefix);
        }
    }

    @Override
    public String toString() {
        return ip + "#" + name + "#" + version;
    }
}

