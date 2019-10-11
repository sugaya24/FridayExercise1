package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        System.out.print("Hello. What is your name? ");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.print("Hi, " + name + "! How old are you? ");
        Scanner inputAge = new Scanner(System.in);
        Integer age = inputAge.nextInt();
        System.out.println("Did you know that in five years you will be " + age + " years old?\nAnd five years ago you were " + (age - 10) + "! Imagine that!");
    }
}
