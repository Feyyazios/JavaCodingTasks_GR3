package Baris;

public class OddOrEven {
    public static void main(String[] args) {
        OddOrEvenMethod(2);

    }

    public static void OddOrEvenMethod(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else
            System.out.println("Odd");
    }
    }