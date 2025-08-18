class Animal
{
  void eat()
   {
     System.out.println("Animal is eating");
   }
}
class Dog extends Animal
{
  void bark()
 {
   System.out.println("dog is barking");
 }
}
class Cat extends Animal
{
  void meow()
  {
    System.out.println("cat is meowing");
  }
}
public class Main_33
{
  public static void main(String[] args)
  {
   Dog dog=new Dog();
   dog.eat();
   dog.bark();
   Cat cat=new Cat();
   cat.eat();
   cat.meow();
  }
}