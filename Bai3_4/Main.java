package Bai3_4;

public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Current Time: " + time);

        time.nextSecond();
        System.out.println("After nextSecond(): " + time);

        time.previousSecond();
        System.out.println("After previousSecond(): " + time);
    }
}

