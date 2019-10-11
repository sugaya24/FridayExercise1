package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        System.out.print("Hey, what's your name?(Sorry, I keep forgetting.) ");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.print("Ok, " + name + ", how old are you? ");
        Scanner inputAge = new Scanner(System.in);
        Integer age = inputAge.nextInt();
        if (age < 16) {
            System.out.println("You can't drive.");
        } else if (16 <= age && age <= 17) {
            System.out.println("You can drive but not vote.");
        } else if (18 <= age && age <= 24) {
            System.out.println("You can vote but not rent a car.");
        } else if (25 <= age) {
            System.out.println("You can do pretty much anything.");
        }
    }
}
