package java_homework_week02;
/**
 * 15. Write a Java program to swap two variables.
 */
public class SwapTwoVariablesP15 {

    public static void main(String[] args) {

        int a, b;
        a = 20;
        b = 10;
        System.out.println("Before swap : a, b = "+ a +", "+  + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap : a, b = " + a + ", " + + b);
    }

}
