package reee;

import java.util.Formatter;
import java.util.Scanner;

public class example17 {
    public static void main(String[] args){
        int choice;
        double A, W, r, H, BAC;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
        choice = input.nextInt();
        r = (choice == 1) ? 0.73: 0.66;
        System.out.print("How many ounces of alcohol did you have? ");
        A = input.nextDouble();
        System.out.print("What is your weight in pounds? ");
        W = input.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        H = input.nextDouble();

        BAC = ((A * 5.14 / W * r)) - (0.015 * H);
        Formatter fmt = new Formatter();
        fmt.format("%.6f", BAC);

        System.out.println("Your BAC is "+fmt);
        if(BAC >= 0.08)
        {
            System.out.println("It is not legal for you to drive.");
        }
        else
        {
            System.out.println("It is legal for you to drive.");
        }
    }
}
