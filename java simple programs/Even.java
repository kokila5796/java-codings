import java.io.*;

import java.util.*;

public class Even
{

   public static void main(String args[] ) throws Exception 
{


int a=15,c=0,i,sum=0,d=0;

int b=15;

c=a*b;

for(i=1;i<=3;i++)

{

  d=c%10;
  
c=c/10;

if(d%2==0)

{

    sum=sum+c;

}

   }

   System.out.println(""+sum);
 
  }

}
