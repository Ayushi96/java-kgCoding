public class TestRun {
    public static void main(String[] args) {
        // not possible since Vehicle is an abstract class
//        Vehicle v = new Vehicle(4);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
        Square sq = new Square();
        System.out.println("Area of square is " + sq.calculateArea());
        Circle c = new Circle();
        System.out.println("Area of square is " + c.calculateArea());
        Eagle e = new Eagle();
        e.fly();
    }
}
