package Bai3_5;

public class MyDate {
    private int day;
    private int month;
    private int year;

    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int day, int month, int year) {
        setDate(day, month, year);
    }

    public void setDate(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int day, int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDays = DAYS_IN_MONTH[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }
        return day >= 1 && day <= maxDays;
    }

    public MyDate nextDay() {
        if (isValidDate(day + 1, month, year)) {
            day++;
        } else if (isValidDate(1, month + 1, year)) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            year++;
        }
        return this;
    }

    public MyDate previousDay() {
        if (isValidDate(day - 1, month, year)) {
            day--;
        } else if (isValidDate(31, month - 1, year)) {
            month--;
            day = DAYS_IN_MONTH[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        } else {
            day = 31;
            month = 12;
            year--;
        }
        return this;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}

