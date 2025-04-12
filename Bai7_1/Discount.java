package Bai7_1;

public class Discount {
	public static double getServiceDiscount(String membership) {
        switch (membership) {
            case "Premium": return 0.20;
            case "Gold": return 0.15;
            case "Silver": return 0.10;
            default: return 0.0;
        }
    }

    public static double getProductDiscount() {
        return 0.10; 
    }
}
