package Packages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args) {

        try {
            long start = System.currentTimeMillis( );
            Thread.sleep(3000);
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(dateToString());

    }

    public static String dateToString() {
        Date date = new Date();
        // System.out.println(date);   // Fri Nov 25 23:54:47 CST 2022
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // System.out.println(dateFormat.format(date));    // 2022-11-25 11:55:56

        return dateFormat.format(date);
    }
}
