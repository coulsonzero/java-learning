package Conditions;

public class If {
    public static void main(String[] args) {

        int age = 24;
        int money = 10000;

        if (age <= 0) {
            System.out.println("Error");
        } else if (age <= 16) {
            System.out.println("Too Young");
        } else if (age < 25 && money > 10000) {
            System.out.println("Welcome!");
        } else if (age < 35 || money > 30000) {
            System.out.println("Great");
        } else {
            System.out.println("Really?");
        }
    }
}

/**
 * if (condition) {
 * // statements
 * } else if (condition) {
 * // statements
 * } else {
 * // statements
 * }
 */
