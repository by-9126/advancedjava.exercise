package Bai2_5;

public class Main{
    public static void main(String[] args) {
        Customer c1= new Customer(101, " Cammm",'f');
        System.out.println(c1);
        Account a1= new Account(1, "Cammmmmmm", 500.0);
        System.out.println(a1);
        a1.deposit(200.0);
        System.out.println(" After deposit:"+ a1);
        a1.widthdraw(100.0);
        System.out.println("After withdrawal: " + a1);
        a1.widthdraw(700.0);
    }
}
