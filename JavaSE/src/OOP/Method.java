package OOP;

public class Method {
    public static void main(String[] args) {
        sayHello("CoulsonZero");
        sayHello("Shville");

        System.out.println(max(7, 42));
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
}
