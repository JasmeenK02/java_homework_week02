package java_homework_week02;
/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;
public class FahrenheitConvertToCelsiusP7 {
    public static void main(String[] args)
    {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*5/9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
