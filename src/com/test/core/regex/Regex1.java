package com.test.core.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * IP validation
 */
public class Regex1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//        String IP="121.234.12.12";
//        System.out.println(IP.matches(new MyRegex().pattern));

        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}


//Write your code here
class MyRegex{
    String pattern;
     MyRegex(){
        //   pattern="(([01]?\\d\\d?|25[0-5]|2[0,4]\\d)\\.){3}"+"([01]?\\d\\d?|25[0-5]|2[0,4]\\d)";
        //pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        pattern="(([01]?\\d\\d?|25[0-5]|2[0-4]\\d)\\.){3}"+"([01]?\\d\\d?|25[0-5]|2[0-4]\\d)";

    }

}
