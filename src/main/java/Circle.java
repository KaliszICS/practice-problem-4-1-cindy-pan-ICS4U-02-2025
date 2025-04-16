public class Circle {
    private double radius;

    public Circle(double radius1){  
        this.radius = radius1;

    }
    public double getRadius(){
        return this.radius;
    }
    public double area(){
        return (3.14)*(this.radius)*(this.radius);
    }
    public double circumference(){
        return 2*(3.14)*(this.radius);
    }
}