import java.util.Scanner;
public class BinarySearchAscending
{
   public static void main(String[] args)
   {
     int num[]={2,4,9,12,17,37,86};
     int i,x,f,S,E,M;
     Scanner sc=new Scanner(System.in);
     System.out.println("array:");
     for(i=0;i<num.Length;i++)
     { 
       System.out.println(num[i]+"");
     } 
     System.out.println("\n\n enter the number to search:");
     x=sc.nextInt();
     f=0;
     S=0;
     E=num.length-1;
     while(S<=E)
      {
        m=(S+E)/2;
        if(x==num[M])
        {
          System.out.println("element found at index:"+M);
          f=1;
          break;
        }
        else if(x>num[M])
        {
          S=M+1;
        }
        else
        {
           E=M-1;
        }
      }
     if(f==0)
     {
       System.out.println("number not found");
     }
 }
}