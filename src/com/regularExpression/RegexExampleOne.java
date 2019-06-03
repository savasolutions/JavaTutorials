package com.regularExpression;
import  java.util.regex.*;

public class RegexExampleOne {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("[^A-z0-9\\s]");
        Matcher matcher=pattern.matcher("H@PpyB*#$d@y");
        while (matcher.find())
        System.out.println("Matches the regex "+matcher.group()+" status "+matcher.find());

       /* Pattern p=Pattern.compile("[@(.)]");
        String[] s=p.split("asdf4fghjj7hjjkkk9@gmail.com");
        for(String i:s)
        {

            System.out.println(i);
        }
        System.out.println(matcher.replaceAll("+"));*/
    }
}
