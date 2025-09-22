class Animal{
protected String type="animal";
}
class Dog extends Animal{
public String type="mammal";
public void printtype(){
System.out.println("iam a:"+type);
System.out.println("iam an :"+super.type);
}
}
class MainAnimal2{
public static void main(String[] args){
Dog dog1=new Dog();
dog1.printtype();
}
}