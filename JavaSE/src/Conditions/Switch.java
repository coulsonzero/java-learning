package Conditions;

public class Switch {
    public static void main(String[] args) {
        switch3();
        switch2();
    }

    public static void switch3() {
        int day = 3;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Working day";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(dayType); // Working day
    }

    public static void switch2() {
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }

    public static void switch1() {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;  // no break will 穿透
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
