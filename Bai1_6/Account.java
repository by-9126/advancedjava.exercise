package Bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void credit(int amount) {
        this.balance += amount;
    }
    public void debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Sĩ hả con");
        }
    }
//    public void transferTo(int amount) {
//        if (balance >= amount) {
//        this.balance += amount;
//    }else{
//            System.out.println("Nghèo quá con à");
//        }
//    } lỗi logic ::))
public void transferTo(Account another, int amount) {
    if (amount <= this.balance) {
        this.balance -= amount; // Trừ tiền từ tài khoản hiện tại
        another.credit(amount); // Thêm tiền vào tài khoản đích
    } else {
        System.out.println("Nghèo quá con à");
    }
}

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
