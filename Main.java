class Lamp{
  boolean isOn;
  void turnOn(){
    isOn=true;
System.out.println("light on?"+isOn);
}
void turnOff(){
 isOn=false;
System.out.println("light on?"+isOn);
}
}
public class Main{
public static void main(String[] args){
Lamp led=new Lamp();
Lamp halogen=new Lamp();
led.turnOn();
halogen.turnOff();
}
}