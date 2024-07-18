public class Circle extends Shape{

    public Circle(){
        super(4);
    }
    @Override
    double calculateArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}
