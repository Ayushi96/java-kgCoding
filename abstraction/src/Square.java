public class Square extends Shape{

    public Square(){
        super(4, 2);
    }
    @Override
    double calculateArea() {
        return getLen() * getWidth();
    }
}
