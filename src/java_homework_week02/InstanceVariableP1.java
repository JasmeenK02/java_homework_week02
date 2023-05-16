package java_homework_week02;

/**
 * 1. Write a Java programme using the following steps.
 * Declare two instance variables
 * Declare one instance method
 * Call both instance variables into the instance method inside the print statement.
 * Declare the Main method.
 * Call the above instance method into the Main method and Run the programme.
 */
public class InstanceVariableP1 {
    int a = 25;
    int b = 30;

    public static void main(String[] args) {

        InstanceVariableP1 m1 = new InstanceVariableP1();
        System.out.println(m1.a);
        System.out.println(m1.b);

    }

    public void m1() {

        InstanceVariableP1 c = new InstanceVariableP1();
        System.out.println(c.a);
        System.out.println(c.b);

    }

}
