package Bai1_1;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        radius = 0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color = c;
    }
    public String toString(){
        return "Circle [ Radius : "+ radius + " , Color : "+ color + " ]";
    }
}
