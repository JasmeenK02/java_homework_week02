package java_homework_week02;
/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.6 Height = 8.5
 */
public class AreaAndPerimeterOfTriangleP14 {

    public static void main(String[] args) {

        float width = 5.6f;
        float height = 8.5f;
        float area = (width * height);
        float perimeter = 2 * (width + height);

        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);

    }
}
