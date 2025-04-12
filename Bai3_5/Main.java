package Bai3_5;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(31, 12, 2023);
        System.out.println("Current Date: " + date);

        date.nextDay();
        System.out.println("After nextDay(): " + date);

        date.previousDay();
        System.out.println("After previousDay(): " + date);
    }
}

