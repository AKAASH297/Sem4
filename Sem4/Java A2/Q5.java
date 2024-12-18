class Box {
    int height;
    Box() {
        this.height = 60;
    }
    static void modifyBox(Box b) {
        b.height = 30;
    }
}
public class Q5{
    public static void main(String[] args) {
        Box box = new Box();
         System.out.println("Height BEFORE call: " + box.height);
         Box.modifyBox(box);
         System.out.println("Height AFTER call: " + box.height);
    }
}