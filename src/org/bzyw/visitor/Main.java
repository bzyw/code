package org.bzyw.visitor;

import org.bzyw.visitor.impl.ListVisitor;

/**
 * Created by bzyw on 2018/5/15.
 */
public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        rootDir.add(binDir);
        rootDir.add(tmpDir);

        binDir.add(new File("bzyw", 1));
        binDir.add(new File("bzyw2", 2));

        tmpDir.add(new File("index.html", 10));

        tmpDir.add(new Directory("bzywTmp"));

        rootDir.accept(new ListVisitor());
    }
}
