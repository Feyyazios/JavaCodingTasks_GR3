package Ifrat;

public class OddOrEven {


    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number != 0) {
            this.number = number;
        } else {
            System.out.println("The number cannot be zero. Please enter a non-zero number.");
        }
    }

    public String checkOddOrEven(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

}
