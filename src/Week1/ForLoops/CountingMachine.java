package Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        System.out.print("Count to: ");
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        String s = "";
        for (int i = 0; i <= n; i++) {
            String temp = Integer.toString(i);
            s = s.concat(temp + " ");
        }
        System.out.println(s);
    }
}
