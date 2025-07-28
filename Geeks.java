import java.lang.*;
public class Geeks
{
 public static void main(String[] args)
{
StringBuffer sbf=new StringBuffer("Geeks for geeks:");
System.out.println("string buffer:"+sbf);
sbf.delete(6,8);
System.out.println("after deletion string buffer:"+sbf);
}
}