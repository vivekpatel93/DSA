import java.io.*;
import java.util.Scanner;
public class Example2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("D J");

        /*-------->>>>>> Bitwise operator
        int a=2;
        int b=3;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(a^b);
        */


        /*------- Left shift operator
        System.out.println(1256789<<1);//  <^>(multiply by 2 for small number)
         -------- right shift operator
        System.out.println(5>>2);//  <^>(divide by 2)
        System.out.println(125>>2); */ 

         //------Increment or Decrement
        
         /*int a=2,i=3;
         int sum= a + (++i);
         System.out.println(i);//4
         System.out.println(sum);
         System.out.println(++i);*/

         /* ----pre-Increment
         int i=11;
         int a=++i;
         System.out.println(a);
         */

         /* ----post-Increment
         int j=7;
         int b=j++;
         System.out.println(b);
         System.out.println(j); 
         */

         // Question=> 03  prime number
         /*int n=sc.nextInt();
         for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Entered number is not prime");
                
            }else{
                System.out.println("Number is prime");
                }
            }*/
            //Question=> 04 fibonacci series
            int n1=0,n2=1;
            System.out.print(n1+" "+n2+" ");
            int count=10;
            for(int i=2;i<count;i++){
            int n3=n1+n2;
           
            System.out.print(n3+" ");
             n1=n2;
            n2=n3;
            }
             

          
         

    }
}

    