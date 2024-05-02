package Loops;

public class While {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            System.out.println(x);
            if (x == 2) break;
            x--;
        }
        /*
         3
         2
         */
    }
}
