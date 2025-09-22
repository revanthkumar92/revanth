class Animal{
Animal(){
System.out.println("iam an animal");
}
Animal(String type){
System.out.println("type:"+type);
}
}
class Dog extends Animal{
Dog(){
super("Animal");
System.out.println("iam a dog");
}
}
class MainAnimal4{
public static void main(String[] args){
Dog dog1=new Dog();
}
}
