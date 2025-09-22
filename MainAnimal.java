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
}
}
class MainAnimal{
public static void main(String[] args){
Dog dog1=new Dog();
dog1.display();
}
}
