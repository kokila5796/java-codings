
import java.io.*;

import java.util.*;

public class Sum {

   public static void main(String args[] ) throws Exception {

int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

int i,j,sum=0;

for(i=0;i<=3;i++)

{
   
 for(j=0;j<=3;j++)
  
  {
        
sum=sum+a[i][j];
  

   }

}
 System.out.print(""+sum);



   }

}
