class Animal{
public void display(){
 System.out.println("iam an animal");
}
}
class Dog extends Animal{
@Override
public void display(){
System.out.println("iam a dog");
}
public void printmessage(){
display();
super.display();
}
}
class MainAnimal1{
public static void main(String[] args){
Dog dog1=new Dog();
dog1.display();
dog1.printmessage();
}
}
