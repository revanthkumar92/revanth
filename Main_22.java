class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog {
    void display() {
        System.out.println("Labrador is a type of dog");
    }
}

public class Main_22 {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat();
        labrador.bark();
        labrador.display();
    }
}