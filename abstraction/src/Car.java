public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(){
        super(4);
    }


    @Override
    public void makeStartSound() {
        System.out.println("Vrooommm......");
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to place...");
    }
}
