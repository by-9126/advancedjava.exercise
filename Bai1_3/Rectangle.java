package Bai1_3;

public class Rectangle {
    private float width;
    private float height;
    public Rectangle() {}
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
