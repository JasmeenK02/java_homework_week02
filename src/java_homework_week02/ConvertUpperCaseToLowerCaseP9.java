package java_homework_week02;

/**
 * 9. Write a program to convert the upper case to lower case.
 */


import java.util.Scanner;

public class ConvertUpperCaseToLowerCaseP9 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter character in uppercase :");
        String uppercase = in.nextLine();

        String  lowercaseString = uppercase.toLowerCase();

        System.out.println("Lowercase character is : " + lowercaseString);


    }
}
