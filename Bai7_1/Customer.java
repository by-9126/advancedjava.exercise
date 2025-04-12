package Bai7_1;

public class Customer {
	private String name;
    private String membership; 

    public Customer(String name, String membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public String getMembership() {
        return membership;
    }

}
