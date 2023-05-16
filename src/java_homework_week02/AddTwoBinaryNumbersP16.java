package java_homework_week02;

import java.util.Scanner;
public class AddTwoBinaryNumbersP16 {

    public static void main(String[] args) {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter first binary number : ");
        String a = add.next();
        System.out.println("Enter second binary number : ");
        String b = add.next();

        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int b3 = b1 + b2;

        System.out.println("n1 : " + Integer.toBinaryString(b1));
        System.out.println("n2 : " + Integer.toBinaryString(b2));
        System.out.println("b1 + b2 = b3 : "  + Integer.toBinaryString(b3));


    }
}
