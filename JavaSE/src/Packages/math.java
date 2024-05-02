package Packages;

import java.util.Random;

/**
 * Math Api:
 * Math.min()
 * Math.max()
 *
 * Math.floor()
 * Math.ceil()
 *
 * Math.abs()
 * Math.round()
 * Math.random()
 *
 * Math.pow()
 */

public class math {
    public static void main(String[] args) {
        System.out.println(Math.min(3, 5));     // 3
        System.out.println(Math.max(3, 5));     // 5

        System.out.println(Math.floor(3.4));    // 3.0
        System.out.println(Math.ceil(3.4));     // 4.0

        System.out.println(Math.abs(- 3.2));    // 3.2
        System.out.println(Math.round(3.62));   // 4


        //Math.random() 生成随机数
        System.out.println(Math.round(Math.random() * 10)); // [0, 10]
        System.out.println((int)Math.floor(Math.random() * 10)); // [0, 10)

        int num = (int) (Math.random() * 10);
        System.out.println(num);

        //new Random() 生成随机数
        Random r = new Random();
        int i = r.nextInt(10);
        System.out.println(i);

        System.out.println(Math.pow(2, 3)); // 8.0
    }
}
