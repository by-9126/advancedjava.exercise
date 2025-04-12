package Bai1_2;

public class Circle1 {
        private double radius;
        private String color;
        public Circle1(){
            radius = 0;
            color = "red";
        }
        public Circle1(double r){
            radius = r;
            color = "red";
        }
        public double getRadius(){
            return radius;
        }
        public void setRadius(double r){
            this.radius = r;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String c){
            this.color = c;
        }
        public double getArea(){
            return radius*radius*Math.PI;
        }
        public double getCircumference(){
            return 2*Math.PI*radius;
        }
        public String toString(){
            return "Circle [ Radius : "+ radius + " , Color : "+ color + " ]";
        }
    }

