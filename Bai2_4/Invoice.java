package Bai2_4;


    public class Invoice {
        private int id;
        private Customer customer;
        private double amount;
        public Invoice(int id, Customer customer, double amount){
            this.id= id;
            this.customer= customer;
            this.amount= amount;
        }
        public int getId() {
            return id;
        }
        public Customer getCustomer() {
            return customer;
        }
        public double getAmount() {
            return amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        public  int getCustomerId(){
            return customer.getId();
        }
        public String getCustomerName(){
            return customer.getName();
        }
        public int getCustomerDiscount(){
            return customer.getDiscount();
        }
        public double getAmountAfterDiscount() {
            double discountRate= customer.getDiscount()/100;
            return amount * (1-discountRate);
        }
        @Override
        public String toString() {
            return "Invoice[id=" + id + ", customer=" + customer.toString() +
                    ", amount=" + amount + "]";
        }


}
