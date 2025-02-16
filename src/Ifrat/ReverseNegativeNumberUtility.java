package Ifrat;

public class ReverseNegativeNumberUtility {
    public static int reverseNegative(int number) {
        // Create a String object to hold the absolute value of the number
        StringBuffer str =new StringBuffer();
        //Add the abs of the number to the StringBuffer
        str.append(Math.abs(number));
        //Reverse the String
        str.reverse();
        //Convert the reversed string back to an integer
        return Integer.parseInt(str.toString())*(number < 0 ? -1 : 1);




    }
}
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
