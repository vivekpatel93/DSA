//import java.util.Scanner;
/* Method ==> function define inside the class are known as method. */
public class Method1 {
    // method for multiplication
    static void multiplication(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication is : " + mul);
    }

    // method for addition
    static void doSum(int a, int b) {
        int s = a + b;
        System.out.println("Sum is : " + s);
    }
    // method for substraction 
    static int doSubs(int a, int b){
        int x = a - b;
        return x; // method is integer type that means it returns an interger value
    }
    // method for division
    static int doDiv(int a, int b){
        int y = a / b;
        return y;
    }
    // method for remainder
    static int doRem(int a, int b){
        int z = a % b;
        return z;
    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        doSum(3, 5);

        multiplication(2, 4);

        int ans1 = doSubs(3,4);
        System.out.println("Substraction is : "+ans1);

        int ans2 = doDiv(5,4);
        System.out.println("Division is : "+ans2);

        int ans3 = doRem(2,3);
        System.out.println("Remainder is : "+ans3); 
    }

}
