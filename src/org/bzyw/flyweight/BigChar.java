package org.bzyw.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by bzyw on 2018/2/11.
 */
public class BigChar {
    private char charname;
    private String text;

    public BigChar(char charname) {
        init(charname);
    }

    private void init(char charname) {
        this.charname = charname;
        String fileName = "big" + charname + ".txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }
            reader.close();
            text = builder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.print(text);
    }
}
