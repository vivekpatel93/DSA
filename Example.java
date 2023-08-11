import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //new funtions
        // size of data type
        /*
         * System.out.println("size is:"+Byte.SIZE);
         * System.out.println("size is:"+Integer.SIZE);
         */

        // Question no-:1

        /*
         * char ch=x.next().charAt(0);
         * if(ch>='a' && ch<='z'){
         * System.out.println("This is lower case letters");
         * }
         * if(ch>='A'&& ch<='Z'){
         * System.out.println("this is Uppercase");
         * }
         * if(ch>='0' && ch<='9'){
         * System.out.println("this is numeric number");
         * }
         */

        // Question no-:2 sum of even number between 1 to n

        /*
         * int n = x.nextInt();
         * int sum = 0;
         * for (int i = 1; i <= n; i++) {
         * if (i % 2 == 0) {
         * System.out.println("number " + i + "is a sum number");
         * sum = sum + i;
         * }
         * }
         * System.out.println(sum);
         */

        // Question no.-:3 print the pattern of * of equal row and column
        /* 
         * for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        /* Q=>> 04;
        question to print star like this format
                    *
                    **
                    ***
                    ****
        */  
            /*   int n=x.nextInt();
           
            int i=1;
            while(i<=n){
                int j=1;
                while(j<=i){
                    System.out.print("*");
                    j++;
                 }
                System.out.println();
                i++;
            }   */

            /*Q=>> 05
            1
            2 2
            3 3 3
            4 4 4 4   solve this type of question ? */

        //solution:
        /*int n=x.nextInt();
        System.out.println();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i+" ");
                j++;
            }
            System.out.println();
            i++;
        */
        /*Q= 06
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * solve this type of question 
         */

        // solution-----

        /*int n=x.nextInt();
        System.out.println();
        int row=1;
        while(row<=n){
            int col=1;
            while(col<=row){
                System.out.print(col+" ");
                col++;
            }
            System.out.println();
            row++;
        }*/
        /* Qusetion=07
            1
            2 3
            3 4 5
            4 5 6 7
            5 6 7 8 9  --- for this type of question*/

        /*int n=x.nextInt();
        System.out.println();
        int row=1;
        while(row<=n){
            int col=1;
            int count=row;
           while(col<=row){
                System.out.print(count+" ");
                count++;
                col++;
            }
            System.out.println();
            row++;
        }*/
        /*
         * Question=08
         * 1
         * 2 1
         * 3 2 1
         * 4 3 2 1 solve this pattern
         */
        // Solution
        /*int n=x.nextInt();
        System.out.println();
        int row=1;
        while(row<=n){
            int col=1;
            int count=row;
            while(col<=row){
                System.out.print(count+" ");
                count--;
                col++;
            }
            System.out.println();
            row++;
        }*/

        /*Question=09 
         * 1 2 3
         * 1 2 3
         * 1 2 3 print this pattern
        */
        //Solution
        /*int n=x.nextInt();
        System.out.println();
        int row=1;
        while(row<=n){
            int col=1;
            int count=1;
            while(col<=n){
                System.out.print(count+" ");
                count++;
                col++;
            }
            System.out.println();
            row++;
        }*/
        /* Question= 10
         * 3 2 1 
         * 3 2 1
         * 3 2 1 print this pattern
         */
        // Solution
        /*int n=x.nextInt();
        System.out.println();
        int row=1;
        while(row<=n){
            int col=1;
            int count=n;
            while(col<=n){
                System.out.print(count+" ");
                count--;
                col++;
            }
            System.out.println();
            row++;
        }*/
        /*Question= 11
         * 
         */
        /*int n=x.nextInt();
        System.out.println();
        int row=1;
        int count=1;
        while(row<=n){
            int col=1;
            while(col<=n){
                System.out.print(count+" ");
                count++;
                col++;
            }
            System.out.println();
            row++;
        }*/
        


            
    }

}
