package BasicConcepts;

public class operators {
    public static void main(String[] args) {

        int x = 14, y= 4;

        System.out.println("x+y: " + (x + y));     // 18
        System.out.println("x-y: " + (x - y));     // 10
        System.out.println("x/y: " + (x * y));     // 56
        System.out.println("x/y: " + (x / y));     // 3
        System.out.println("x%y: " + (x % y));     // 2

        // Assignment BasicConcepts.Operators
        System.out.println( y += 2 );  // 6  y is 4
        System.out.println( y -= 3);   // 3  y is 6
        System.out.println( y *= 5 );  // 15 y is 3
        System.out.println( y /= 2 );  // 7  y is 15
        System.out.println( y %= 4 );  // 3  y is 7

        // Prefix % Postfix
        System.out.println( x++ ); // 14
        System.out.println( x );   // 15
        System.out.println( ++x ); // 16
        System.out.println( x );   // 16

        /**
         * Comparison Opeartors: >  >=  <  <=  ==  !=
         * Logical Opeartors: &&  ||  !
         */

    }
}
