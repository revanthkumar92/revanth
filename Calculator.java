public class Calculator{
public int add(int a,int b){
return a+b;
}
public double add(double a,double b){
return a+b;
}
public int add(int a,int b,int c){
return a+b+c;
}
public static void main(String[] args){
Calculator calc=new Calculator();
System.out.println("sum of two integers:"+calc.add(10,20));
System.out.println("sum of two doubles:"+calc.add(10.5,20.5));
System.out.println("sum of three integers:"+calc.add(10,20,30));
}
}