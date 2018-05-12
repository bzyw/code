package org.bzyw.composite;

import java.util.Collection;

/**
 * Created by bzyw on 2018/5/12.
 */
public interface Device {
    public abstract String getIddress();

    public abstract String getName();

    public abstract String getVersion();

    public abstract void add(Device device);

    public abstract void add(Collection<? extends Device> device);

    public abstract void print(String prefix);
}
