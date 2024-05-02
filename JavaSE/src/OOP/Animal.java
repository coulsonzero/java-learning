package OOP;

interface Animal {
    public void eat();
    public void makeSound();
}
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("omnomnom");
    }
}
