abstract class Employee{
String name;
int employeeid;
public Employee(String name,int employeeid){
this.name=name;
this.employeeid=employeeid;
}
public void displayinfo(){
System.out.println("name:"+name+"Id:"+employeeid);
}
abstract double calculatesalary();
}
class FulltimeEmployee extends Employee{
double monthlysalary;
public FulltimeEmployee(String name,int employeeid,double monthlysalary){
super(name,employeeid);
this.monthlysalary=monthlysalary;
}
@Override
double calculatesalary(){
return monthlysalary;
}
}
class ParttimeEmployee extends Employee {
double hourlyrate;
int hoursworked;
public ParttimeEmployee(String name,int employeeid,double hourlyrate,int hoursworked){
super(name,employeeid);
this.hourlyrate=hourlyrate;
this.hoursworked=hoursworked;
}
double calculatesalary(){
return hourlyrate*hoursworked;
}
}
public class Main_7_1 {
	public static void main(String[] args) {
		FulltimeEmployee full = new FulltimeEmployee("alice", 101, 50000);
		ParttimeEmployee part = new ParttimeEmployee("bob", 125, 25, 120);
		full.displayinfo();
		System.out.println("salary:$" + full.calculatesalary());
		part.displayinfo();
		System.out.println("salary:$" + part.calculatesalary());
	}
}
