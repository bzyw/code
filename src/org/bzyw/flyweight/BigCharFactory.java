package org.bzyw.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bzyw on 2018/2/11.
 */
public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap<String, BigChar>();
    private static BigCharFactory factory = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return factory;
    }

    public BigChar getBigChar(char charname) {
        String key = "" + charname;
        if (pool.containsKey(key)) {
            return pool.get(key);
        } else {
            return new BigChar(charname);
        }
    }
}
