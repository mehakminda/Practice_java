package com.test.core.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Loading properties file
 */
public class FH1 {
    static void main() throws IOException {
        String cwd = System.getProperty("user.dir");
        System.out.println("Current working directory: " + cwd);


        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("src/com/test/core/FileHandling/db.properties");
        p.load(fis);
        System.out.println(p.getProperty("username"));
        String s= "next" +Math.random();
        p.setProperty(s,"Winner");
        System.out.println(p.getProperty(s));

    }
}
