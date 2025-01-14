package muzaffar;

import java.util.ArrayList;

public class OddOrEven {
    public static void main(String[] args) {
        int[] numbers ={2,45,67,34,20,21,56,78,80,2,4,6,8,90};

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int each : numbers ){
            if (each % 2 == 0){
                oddNumbers.add(each);
            }else {
               evenNumbers.add(each);
            }
        }
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

    }
}
