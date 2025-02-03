package omar;

public class SwapIntegers {

    public static void main(String[] args) {

        //switching using three variables

        int a = 2;
        int b = 3;
        int c = a; //giving c the value of a so that we can give b the value of a after we change it to the value of b
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = b;
        b = c;

        System.out.println();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("======================================================");
        //switching using two variables
        int x = 6;
        int y = 4;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y = x + y;  //adding the values of x and y
        x = y - x; //making the value of x equals to (y - x) so that the value of x becomes y
        y = y - x; //making the value of y equal to (y-x) after the value of x got changed so that y becomes the old value of x
        System.out.println();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
