package org.bzyw.interpret;


/**
 * Created by bzyw on 2018/6/5.
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
