public class TestRun {
    public static void main(String[] args) {
        // not possible since Vehicle is an abstract class
//        Vehicle v = new Vehicle(4);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
    }
}
