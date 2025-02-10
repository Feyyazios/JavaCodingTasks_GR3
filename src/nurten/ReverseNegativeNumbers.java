package nurten;

public class ReverseNegativeNumbers {

    /* **
    Reverse digits of a negative number and return it as int input:-35 output:-53
     */

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumbers(-35));//output:-53
        System.out.println();
    }



    public static int reverseNegativeNumbers(int num) {

        if (num >=0){  // If the number is positive, return as is
            return num;
        }


        int reversed = 0;

        while (num < 0) {
            reversed = reversed * 10 + (num % 10); //Append the last digit
            num /= 10; //Remove the last digit
        }
        return reversed; //return as negative
    }
}
