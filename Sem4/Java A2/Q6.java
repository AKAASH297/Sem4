class Number {
    int a;
    int b;

    Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    static void swap(Number n) {
        int temp = n.a;
        n.a = n.b;
        n.b = temp;
    }
}
public class Q6{
    public static void main(String[] args) {
        Number number = new Number(10, 20);
        System.out.printf("Values of a and b BEFORE swapping: %d %d\n", number.a, number.b);
        Number.swap(number);
        System.out.printf("Values of a and b AFTER swapping: %d %d", number.a, number.b);
    }
}