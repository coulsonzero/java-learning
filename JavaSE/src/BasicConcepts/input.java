package BasicConcepts;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How old are you ?    ");
        int age = sc.nextInt();

        System.out.print("What's your name ?   ");
        String name = sc.next();
        // input: "hello coulson"
        // output: "hello"

        System.out.print("Where are you from ? ");
        String country = new Scanner(System.in).nextLine();
        // input: "hello coulson"
        // output: "hello coulson" 包含空格!
    }
}

/**
 * nextLine()  => Enter退出
 * next()      => Enter退出 (输出space前的数字，space前遇到非数字报错)
 * nextInt()   => Enter退出 (输出space前的数字，space前遇到非数字报错)
 */
