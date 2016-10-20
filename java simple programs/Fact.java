import java.util.*;
public class Fact
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter x");
int n=s.nextInt();
int result=Fact(n);
System.out.println("factorial of"+n+"is"+result);
}
public static int Fact(int n)
{
int result=n;
for(int i=1;i<n;i++)
{
result=result*i;
}
return result;
}
}
 
