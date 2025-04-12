package Bai7_1;

public class Visit {
	private Customer customer;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public double getTotalBill() {
        double serviceDiscount = Discount.getServiceDiscount(customer.getMembership());
        double productDiscount = Discount.getProductDiscount();

        double discountedServiceCost = serviceExpense * (1 - serviceDiscount);
        double discountedProductCost = productExpense * (1 - productDiscount);

        return discountedServiceCost + discountedProductCost;
    }
}
