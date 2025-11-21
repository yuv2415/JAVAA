import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.println("area of circle: " + area);
        sc.close();
    }
}