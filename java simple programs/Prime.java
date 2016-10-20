import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j=0;
for(i=2;i<n;i++)
{
if(n%i==0){
System.out.println("number is not a prime number.");
j=1;
break;
}
}
if(j==0)
System.out.println("number is prime number.");



}
}