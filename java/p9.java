import java.util.Scanner;
class Shapes {
    public void Area(int r) {
        System.out.println(3.14*r*r);
    }

    public void Area(int l, int b) {
        System.out.println(l*b);
    }

    public void Area(double b, double h) {
        System.out.println((1/2)*b*h);
    }
}
public class p9 {
    

    public static void main(String[] args) {
        Shapes myShape = new Shapes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice!!");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
            System.out.println("Enter the radius of the circle");
            int r = sc.nextInt();
            myShape.Area(r);
            break;
            case 2:
            System.out.println("Enter the length of Rectangle");
            int l = sc.nextInt();
            System.out.println("Enter the breadth of Rectangle");
            int b = sc.nextInt();
            myShape.Area(l, b);
            break;
            case 3:
            System.out.println("Enter the Base of the Triangle");
            double bee = sc.nextDouble();
            System.out.println("Enter the Height of the triangle");
            double h = sc.nextDouble();
            myShape.Area(bee, h);
            break;
            default:
            System.out.println("Invalid Choice-_-");
        }
    }
}