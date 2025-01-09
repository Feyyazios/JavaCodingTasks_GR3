import java.util.ArrayList;

public class OddOrEven {

    public static void main(String[] args) {


        int[] numbers ={4,9,12,36,43,7,67,34,198};

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int each : numbers){
            if(each%2==0){
                oddNumbers.add(each);
            }else{
                evenNumbers.add(each);
            }
        }
        System.out.println("odd numbers: " + oddNumbers);
        System.out.println("even numbers: " +evenNumbers);
}
}

