package PR1.entities;

public class Ball {
    private String size;
    private String color;
    public Ball(String n, String a){
        size = n;
        color = a;
    }
    public Ball(String n){
        size = n;
        color =  "red (standard)";
    }
    public Ball(){
        size = "small (standard)";
        color = "red (standard)";
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public String toString(){
        return "this " + this.size + " ball is " + this.color;
    }
}