import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("enter operator");
        char operator=sc.next().charAt(0);
         System.out.println("Enter Second number");
         int num2=sc.nextInt();
        System.out.println("Hi vivek");
        switch(operator){
            //cond 1
            case '+' :System.out.println(num1+num2);
            break;
            //cond 2
             case '-' :System.out.println(num1-num2);
            break;
            //cond 3
             case '*' :System.out.println(num1*num2);
            break;
            //cond 3

             case '/' :System.out.println(num1/num2);
            break;
        }
    }
}