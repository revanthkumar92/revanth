public class Week2l
{
public static void main(String[] args)
{
String str="Radar",reversestr="";
int strlength=str.length();
for(int i=(strlength-1);i>=0;--i)
{
reversestr=reversestr+str.charAt(i);
}
if(str.toLowerCase().equals(reversestr.toLowerCase()))
{
System.out.println(str+"is a palindrome");
}
else
{
System.out.println(str+"is not a palindrome");
}
}
}

