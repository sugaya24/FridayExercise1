package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        System.out.println("I will add up the numbers you give me.");
        // System.out.print("Number: ");
        Integer total = 0;
        while (true) {
            System.out.print("Number: ");
            Scanner inputNum = new Scanner(System.in);
            Integer num = inputNum.nextInt();
            if (num == 0) {
                break;
            }
            total += num;
            System.out.println("The total so far is " + total);
        }
        System.out.println("The total is " + total);
    }
}
