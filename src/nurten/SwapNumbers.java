package nurten;

import org.w3c.dom.ls.LSOutput;

public class SwapNumbers {
    //code from nurten

/*
Swap two integer variable values (including both ways; with using a third variable and without it)
 */


    public static void main(String[] args) {

    // First method: Swapping two integer variable values with using a third variable
        int a = 7;
        int b = 8;
        System.out.println("Before swapping a =  " + a + ", b = " + b);

        //Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a =  " + a + ", b = " + b);

    System.out.println("=================================================================================");

    // Second method: Swapping two integer variable values without using a third variable
        int c = 5;
        int d = 10;

        System.out.println("Before swapping c =  " + c + ", d = " + d);

        c = c + d; // c becomes 11
        d = c - d; // d becomes 5
        c = c - d;  // c becomes 10

        System.out.println("After swapping c =  " + c + ", d = " + d);

    }





}
