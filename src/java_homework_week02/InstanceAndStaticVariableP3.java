package java_homework_week02;
/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme
 */
public class InstanceAndStaticVariableP3 {
    int a = 15;
    static int b = 20;

    public static void main(String[] args) {

        InstanceAndStaticVariableP3 obj = new InstanceAndStaticVariableP3();
       obj.m1();
        m2();

    }

    public void m1() {
        InstanceAndStaticVariableP3 c = new InstanceAndStaticVariableP3();
        System.out.println(c.a);
        System.out.println(c.b);

    }
    public static void m2() {
        InstanceAndStaticVariableP3 d = new InstanceAndStaticVariableP3();
        System.out.println(d.a);
        System.out.println(b);

    }



}
