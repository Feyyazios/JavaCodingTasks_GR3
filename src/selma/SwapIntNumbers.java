package selma;

public class SwapIntNumbers {


    /**
     *Swap two integer variable values (including both ways; with using a third variable and without it)
     */
    public static void main(String[] args) {


        System.out.println("<-------------First method with using a third variable----------------->");
        int a = 20;
        int b = 40;
        System.out.println("Before swap ==>  a = " + a + ", b = " + b);

        // third variable
        int temporary = a;  // temporary=20   a=20   b=40
        a = b;     //a=40    b= 40   temporary= 20
        b = temporary; // a=40  b=20

        System.out.println("After  swap ==>  a = " + a + ", b = " + b);


        System.out.println("<-------------Second method without using a third variable------------->");
        int i = 20;
        int k = 40;
        System.out.println("Before swap ==>  i =  " + i + ", k = " + k);

        i = i + k; // i= 20+40 =>60   k=40
        k = i - k; // k= 60-40 =>20   i=60
        i = i - k; // i= 60-20 =>40   k=20

        System.out.println("After  swap ==>  i =  " + i + ", k = " + k);

    }

}
