
import java.io.*;

import java.util.*;

public class EvenNumbers {
   
public static void main(String args[] ) throws Exception 
{

int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

int i,j,count=0,k,l,b=0;

StringBuilder sb = new StringBuilder();

for(i=0;i<=3;i++)

{

    for(j=0;j<=3;j++)
 
   {

        if(a[i][j]%2==0)
       
 {
      
  
      sb.append(a[i][j]+" ");
   
     }

    } 
 
} 

String x = sb.toString();

for(i=0;i<x.length()-1;i++)
{

    System.out.print(x.charAt(i));

}

}

}
