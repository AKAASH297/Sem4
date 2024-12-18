class Counter {
    static int count;

    Counter() {
        count++;
    }
}
public class Q4{
    public static void main(String[] args){
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println(("Total no. of objects: " + Counter.count));
    }
}