class Animal{
Animal(){
System.out.println("iam an animal");
}
}
class Dog extends Animal{
Dog(){
super();
System.out.println("iam a dog");
}
}
class MainAnimal3{
public static void main(String[] args){
Dog dog1=new Dog();
}
}
