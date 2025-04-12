package Bai7_1;

public class BeautySalonTest {
	public static void main(String[] args) {
        Customer c1 = new Customer("Alice", "Premium");
        Visit v1 = new Visit(c1, 100, 50);
        System.out.println("Total bill for Alice: $" + v1.getTotalBill());

        Customer c2 = new Customer("Bob", "Gold");
        Visit v2 = new Visit(c2, 200, 100);
        System.out.println("Total bill for Bob: $" + v2.getTotalBill());

        Customer c3 = new Customer("Charlie", "None");
        Visit v3 = new Visit(c3, 150, 80);
        System.out.println("Total bill for Charlie: $" + v3.getTotalBill());
    }
}
