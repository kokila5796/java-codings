
import java.io.*;

import java.util.*;

public class Code {
   
public static void main(String args[] ) throws Exception {

int a[]={10,20,15,2,4,7,8};

int i,b,c=0,d=0,e;

for(i=0;i<=6;i++)    

{

          b=a[i];
    

if(b%5==0&&b%10==0)

     {
        
           c=0;

      }
   
     else
      {
        
           a[d]=b;
        
           d++;
           
        
      }
       
    
}

       
for(e=0;e<=6;e++)
{
        
         System.out.print(""+a[e]+" ");
    
}   
       
       
       
       
   
}

 
  }

