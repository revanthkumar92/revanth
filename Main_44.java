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
interface Domestic
{
  void play();
}
interface DogBehaviour extends Domestic
{
  void guard();
}
class DomesticDog implements DogBehaviour
{
  @Override
  public void play()
  {
   System.out.println("Domestic dog is playing");
  }
  @Override
  public void guard()
  {
   System.out.println("Domestic dog id guarding");
  }
}
public class Main_44
{
  public static void main(String[] args)
  {
    DomesticDog dog = new DomesticDog();
    dog.play();
    dog.guard();
  }
}