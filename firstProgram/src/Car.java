public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
    Car swift = new Car(4, 4, 120, "Swift");
        System.out.println(swift.toString()); // output: Car@1a6c5a9e

    }
}


