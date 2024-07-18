package ExceptionHandling;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to division calculator");
        System.out.println("Please enter two numbers");
        int first = input.nextInt();
        int second = input.nextInt();
        int a[] = new int[5];
        try {
//            int result = first/second;
//            System.out.println("Result is "+ result);
            a[6] = first/second;
            System.out.println("Result is "+ a[6]);
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0, enter valid value \n" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Array index is out of bounds");
        }


    }
}
