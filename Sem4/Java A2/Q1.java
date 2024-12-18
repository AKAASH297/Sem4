class Car {
    int passengers;
    int fuelCap;
    int mpg;

    Car(int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }
    
    int range() {
        return fuelCap*mpg;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Car car = new Car(4,20,30);
        System.out.println("Total range: " + car.range() + " miles.");
    }
}