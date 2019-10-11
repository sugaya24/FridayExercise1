package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        System.out.println("Hello. What is yoru name?");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.println("Hi, " + name + "! How old are you?");
        Scanner inputAge = new Scanner(System.in);
        String age = inputAge.nextLine();
        System.out.println("So you're " + age + ", eh? That's not old at all!\nHow much do you make, " + name + "?");
        Scanner inputAmount = new Scanner(System.in);
        String amout = inputAmount.nextLine();
        System.out.println(amout + "! I hope that's per hour and not per year! LOL!");
    }
}
