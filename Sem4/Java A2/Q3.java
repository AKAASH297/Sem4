import java.util.Scanner;
class Rectangle {
    int length;
    int width;
    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }
    int calculateArea() {
        return length*width;
    }
}
public class Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = scanner.nextInt();
        System.out.println("Enter the width: ");
        int width = scanner.nextInt();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area  : " + rectangle.calculateArea() + "cm²");
        scanner.close();
    }
}