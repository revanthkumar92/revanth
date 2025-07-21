public class Week2i
{
 public static void main(String[] args)
{
   int count=0,num=23;
   while(num!=0)
{num/=10;
++count;}
System.out.println("number of digits:"+count);
}
}