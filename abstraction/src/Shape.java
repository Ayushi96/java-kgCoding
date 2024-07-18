abstract class Shape {

    private double len;
    private double width;
    private double radius;


    public Shape() {
      this.radius = 1;
      this.width = 1;
      this.len = 1;
    }

    public Shape(double len, double width) {
        this.len = len;
        this.width = width;
    }

    public Shape(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getLen(){
        return len;
    }

    public double getWidth(){
        return width;
    }
 abstract double calculateArea();
}
