package src;

import java.util.Scanner;

public class UserIntake {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("Enter a number: ");
//        sc = new Scanner(System.in);
//        int s = Integer.parseInt(sc.nextLine());
//        System.out.println("Your number is : " + s);
        Integer num = sum();
        System.out.println("Total sum of given number is: " + num);
    }
    public static int sum(){
        System.out.println("Enter the first Number");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the second Number");
        int b = Integer.parseInt(sc.nextLine());
        int sum = a+b;
        return sum;
    }
}
