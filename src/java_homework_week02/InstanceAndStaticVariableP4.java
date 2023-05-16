package java_homework_week02;
/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class InstanceAndStaticVariableP4 {
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public static void main(String[] args) {

        InstanceAndStaticVariableP4 obj = new InstanceAndStaticVariableP4();
        obj.m1();
        m2();
    }

    public void m1() {

        InstanceAndStaticVariableP4 i1 = new InstanceAndStaticVariableP4();
        System.out.println(i1.a);
        System.out.println(i1.b);
        System.out.println(i1.c);
        System.out.println(i1.d);

    }

    public static void  m2(){

        InstanceAndStaticVariableP4 s1 = new InstanceAndStaticVariableP4();
        System.out.println(s1.a);
        System.out.println(s1.b);
        System.out.println(s1.c);
        System.out.println(s1.d);

    }


}
