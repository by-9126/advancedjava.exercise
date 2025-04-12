package Bai3_7;

public class Player {
    private int number, x, y, width, height;

    public Player(int number, int x, int y, int width, int height) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getNumber() { return number; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    public boolean collidesWith(Ball ball) {
        return ball.getX() + ball.getRadius() >= x &&
                ball.getX() - ball.getRadius() <= x + width &&
                ball.getY() + ball.getRadius() >= y &&
                ball.getY() - ball.getRadius() <= y + height;
    }

    @Override
    public String toString() {
        return "Player " + number + " at (" + x + "," + y + ") with size (" + width + "," + height + ")";
    }
}
