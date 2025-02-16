package Ifrat;

import java.util.Scanner;

public class OddOrEvenClient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (scanner.hasNextInt()) {

            int inputNumber = scanner.nextInt();
            OddOrEven obj = new OddOrEven();
            obj.setNumber(inputNumber);
            System.out.println("The number " + obj.getNumber() + " is an " + obj.checkOddOrEven(obj.getNumber()) + " number");
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
}
