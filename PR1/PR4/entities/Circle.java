package PR4.entities;

public class Circle {
    private float radius;
    private float diameter;

    public Circle(float radius, float diameter){
        this.radius = radius;
        this.diameter = diameter;
    }
    public float getRadius(){
        return this.radius;
    }
    public float getDiameter(){
        return this.diameter;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public void setDiameter(float diameter){
        this.diameter = diameter;
    }
    public String toString() {
        return "Radius of circle: " + this.radius + "\ndiameter of circle: " + this.diameter + " ";
    }
}
