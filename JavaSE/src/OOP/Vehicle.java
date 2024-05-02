package OOP;

public class Vehicle {
    public static int COUNT = 0;
    Vehicle() {
        COUNT++;
    }


    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle v2 = new Vehicle();
        System.out.println(Vehicle.COUNT);
    }
}
