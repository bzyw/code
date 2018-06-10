package org.bzyw.interpret;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bzyw on 2018/6/5.
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
        String text = null;
        while ((text = reader.readLine()) != null) {
            System.out.println("text = \"" + text + "\"");
            Node node = new ProgramNode();
            node.parse(new Context(text));
            System.out.println("node = " + node);
        }
        reader.close();
    }
}
