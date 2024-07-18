package enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        Grade grade = Grade.C;
        Grade g = Grade.valueOf("A");
        // print valid values of Grade
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}
