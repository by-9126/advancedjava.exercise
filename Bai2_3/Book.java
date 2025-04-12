package Bai2_3;

public class Book {
private String isbn;
private String name;
private String author;
private double price;
private int qty = 0;
public Book(String isbn, String name, String author, double price) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
}
public Book(String isbn, String name, String author, double price, int qty) {
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
}

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString() {

    }

}
