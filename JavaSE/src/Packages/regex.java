package Packages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        String s = "hello, my name is Bob, I'm 20 yeas old, the date is 2021-10-12. you can send message to bob@gmail.com";

        // Pattern p = Pattern.compile("\\d+");
        // Matcher m = p.matcher(s);
        Matcher m = Pattern.compile("\\d+").matcher(s);

        while (m.find())  {
            System.out.println(m.group());
        }
    }
}

/*
20
2021
10
12
 */

