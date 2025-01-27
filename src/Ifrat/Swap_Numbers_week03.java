package Ifrat;

public class Swap_Numbers_week03 {
    /**
     *Swap two integer variable values 10 and 20 (including both ways; with using a third variable and without it)
     */
    public static void main(String[] args) {
// Create two integer variable
        int a = 10;
        int b = 20;
        // Create a temporal variable to swap the integer
        //assign a to int temp
        int temp = a;
        //assign b to a
        a = b;
        //assign temp(has the value of a) to b
        b = temp;
        // Swap completed
        //print
        System.out.println("After swapping a and b: a = " + a + " and b = " + b);


    }
}
